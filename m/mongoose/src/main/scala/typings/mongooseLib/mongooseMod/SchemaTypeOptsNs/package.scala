package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SchemaTypeOptsNs {
  type AsyncPromiseValidationFn[T] = js.Function1[/* value */ T, stdLib.Promise[scala.Boolean]]
  type AsyncValidateFn[T] = js.Function2[
    /* value */ T, 
    /* done */ js.Function1[/* result */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
  type DefaultFn[T] = js.Function1[/* repeated */js.Any, T]
  type RequiredFn[T] = js.Function2[/* required */ scala.Boolean, /* message */ js.UndefOr[java.lang.String], T]
  type ValidateFn[T] = js.Function1[/* value */ T, scala.Boolean]
}
