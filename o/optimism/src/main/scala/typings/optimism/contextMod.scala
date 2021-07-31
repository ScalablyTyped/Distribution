package typings.optimism

import typings.optimism.entryMod.AnyEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("optimism/lib/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def asyncFromGen[TArgs /* <: js.Array[js.Any] */](genFn: js.Function1[/* args */ TArgs, js.Any]): js.Function1[/* args */ TArgs, js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncFromGen")(genFn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ TArgs, js.Promise[js.Any]]]
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(noContext) */ @scala.inline
  def bindContext[TArgs /* <: js.Array[js.Any] */, TResult](callback: js.Function1[/* args */ TArgs, TResult]): js.Function1[/* args */ TArgs, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindContext")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ TArgs, TResult]]
  
  object parentEntrySlot {
    
    @JSImport("optimism/lib/context", "parentEntrySlot")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getValue(): js.UndefOr[AnyEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValue")().asInstanceOf[js.UndefOr[AnyEntry]]
    
    @scala.inline
    def hasValue(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasValue")().asInstanceOf[Boolean]
    
    @JSImport("optimism/lib/context", "parentEntrySlot.id")
    @js.native
    val id: String = js.native
    
    @scala.inline
    def withValue[TResult, TArgs /* <: js.Array[js.Any] */, TThis](value: AnyEntry, callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult]): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("withValue")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TResult]
    @scala.inline
    def withValue[TResult, TArgs /* <: js.Array[js.Any] */, TThis](
      value: AnyEntry,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: TArgs
    ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("withValue")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[TResult]
    @scala.inline
    def withValue[TResult, TArgs /* <: js.Array[js.Any] */, TThis](
      value: AnyEntry,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: TArgs,
      thisArg: TThis
    ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("withValue")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[TResult]
    @scala.inline
    def withValue[TResult, TArgs /* <: js.Array[js.Any] */, TThis](
      value: AnyEntry,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: Unit,
      thisArg: TThis
    ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("withValue")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[TResult]
  }
  
  @scala.inline
  def setTimeout(callback: js.Function0[js.Any], delay: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
