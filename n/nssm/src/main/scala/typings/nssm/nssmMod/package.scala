package typings.nssm

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nssmMod {
  type CallbackFn = js.Function2[/* error */ js.UndefOr[String], /* result */ js.UndefOr[String], Unit]
  type Nssm = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in nssm.nssm.Command ]: nssm.nssm.NssmCommandFn}
    */ typings.nssm.nssmStrings.Nssm with js.Any
  type NssmCatch[T] = js.Function1[
    /* onrejected */ js.UndefOr[
      (js.Function2[/* reason */ Error, /* stderr */ String, js.Any | js.Thenable[js.Any]]) | Null
    ], 
    NssmPromise[T | js.Any]
  ]
  type NssmCommandFn = ZeroArgCommandFn with OneArgCommandFn with TwoArgCommandFn with PromiseCommandFn
  type NssmThen[T] = js.Function2[
    /* onfulfilled */ js.UndefOr[(js.Function1[/* value */ T, js.Any | js.Thenable[js.Any]]) | Null], 
    /* onrejected */ js.UndefOr[
      (js.Function2[/* reason */ Error, /* stderr */ String, js.Any | js.Thenable[js.Any]]) | Null
    ], 
    NssmPromise[js.Any]
  ]
  type OneArgCommandFn = js.Function2[/* arg1 */ String, /* callback */ CallbackFn, Unit]
  type PromiseCommandFn = js.Function2[/* arg1 */ js.UndefOr[String], /* arg2 */ js.UndefOr[String], NssmPromise[String]]
  type TwoArgCommandFn = js.Function3[/* arg1 */ String, /* arg2 */ String, /* callback */ CallbackFn, Unit]
  type ZeroArgCommandFn = js.Function1[/* callback */ CallbackFn, Unit]
}
