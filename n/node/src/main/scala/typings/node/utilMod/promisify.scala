package typings.node.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util", "promisify")
@js.native
object promisify extends js.Object {
  val custom: js.Symbol = js.native
  def apply(fn: js.Function): js.Function = js.native
  def apply(fn: js.Function1[/* callback */ js.Function1[js.UndefOr[js.Any], Unit], Unit]): js.Function0[js.Promise[Unit]] = js.native
  def apply[T1](fn: js.Function2[/* arg1 */ T1, /* callback */ js.Function1[js.UndefOr[js.Any], Unit], Unit]): js.Function1[/* arg1 */ T1, js.Promise[Unit]] = js.native
  def apply[TCustom /* <: js.Function */](fn: CustomPromisify[TCustom]): TCustom = js.native
  def apply[T1, T2](
    fn: js.Function3[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* callback */ js.Function1[js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function2[/* arg1 */ T1, /* arg2 */ T2, js.Promise[Unit]] = js.native
  def apply[T1, T2, T3](
    fn: js.Function4[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* callback */ js.Function1[js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, js.Promise[Unit]] = js.native
  def apply[T1, T2, T3, T4](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ js.Function1[js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, js.Promise[Unit]] = js.native
  def apply[T1, T2, T3, T4, T5](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ js.Function1[js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): js.Function5[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    js.Promise[Unit]
  ] = js.native
}

