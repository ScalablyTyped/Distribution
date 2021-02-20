package typings.optimism

import typings.optimism.entryMod.AnyEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("optimism/lib/context", "asyncFromGen")
  @js.native
  def asyncFromGen[TArgs /* <: js.Array[_] */](genFn: js.Function1[/* args */ TArgs, _]): js.Function1[/* args */ TArgs, js.Promise[_]] = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(noContext) */ @JSImport("optimism/lib/context", "bindContext")
  @js.native
  def bindContext[TArgs /* <: js.Array[_] */, TResult](callback: js.Function1[/* args */ TArgs, TResult]): js.Function1[/* args */ TArgs, TResult] = js.native
  
  object parentEntrySlot {
    
    @JSImport("optimism/lib/context", "parentEntrySlot.getValue")
    @js.native
    def getValue(): js.UndefOr[AnyEntry] = js.native
    
    @JSImport("optimism/lib/context", "parentEntrySlot.hasValue")
    @js.native
    def hasValue(): Boolean = js.native
    
    @JSImport("optimism/lib/context", "parentEntrySlot.id")
    @js.native
    val id: String = js.native
    
    @JSImport("optimism/lib/context", "parentEntrySlot.withValue")
    @js.native
    def withValue[TResult, TArgs /* <: js.Array[_] */, TThis](value: AnyEntry, callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult]): TResult = js.native
    @JSImport("optimism/lib/context", "parentEntrySlot.withValue")
    @js.native
    def withValue[TResult, TArgs /* <: js.Array[_] */, TThis](
      value: AnyEntry,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: TArgs
    ): TResult = js.native
    @JSImport("optimism/lib/context", "parentEntrySlot.withValue")
    @js.native
    def withValue[TResult, TArgs /* <: js.Array[_] */, TThis](
      value: AnyEntry,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: TArgs,
      thisArg: TThis
    ): TResult = js.native
    @JSImport("optimism/lib/context", "parentEntrySlot.withValue")
    @js.native
    def withValue[TResult, TArgs /* <: js.Array[_] */, TThis](
      value: AnyEntry,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: js.UndefOr[scala.Nothing],
      thisArg: TThis
    ): TResult = js.native
  }
  
  @JSImport("optimism/lib/context", "setTimeout")
  @js.native
  def setTimeout(callback: js.Function0[_], delay: Double): js.Any = js.native
}
