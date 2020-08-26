package typings.optimism

import typings.optimism.entryMod.AnyEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("optimism/lib/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  def asyncFromGen[TArgs /* <: js.Array[_] */](genFn: js.Function1[/* args */ TArgs, _]): js.Function1[/* args */ TArgs, js.Promise[_]] = js.native
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(noContext) */ def bindContext[TArgs /* <: js.Array[_] */, TResult](callback: js.Function1[/* args */ TArgs, TResult]): js.Function1[/* args */ TArgs, TResult] = js.native
  def setTimeout(callback: js.Function0[_], delay: Double): js.Any = js.native
  @js.native
  object parentEntrySlot extends js.Object {
    val id: String = js.native
    def getValue(): js.UndefOr[AnyEntry] = js.native
    def hasValue(): Boolean = js.native
    def withValue[TResult, TArgs /* <: js.Array[_] */, TThis](value: AnyEntry, callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult]): TResult = js.native
    def withValue[TResult, TArgs /* <: js.Array[_] */, TThis](
      value: AnyEntry,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: TArgs
    ): TResult = js.native
    def withValue[TResult, TArgs /* <: js.Array[_] */, TThis](
      value: AnyEntry,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: TArgs,
      thisArg: TThis
    ): TResult = js.native
    def withValue[TResult, TArgs /* <: js.Array[_] */, TThis](
      value: AnyEntry,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: js.UndefOr[scala.Nothing],
      thisArg: TThis
    ): TResult = js.native
  }
  
}

