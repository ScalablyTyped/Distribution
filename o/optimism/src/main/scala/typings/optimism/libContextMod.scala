package typings.optimism

import typings.optimism.libEntryMod.AnyEntry
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextMod {
  
  @JSImport("optimism/lib/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asyncFromGen[TArgs /* <: js.Array[Any] */, TYield, TReturn, TNext](genFn: js.Function1[/* args */ TArgs, Generator[TYield, TReturn, TNext]]): js.Function1[/* args */ TArgs, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncFromGen")(genFn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ TArgs, js.Promise[Any]]]
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(noContext) */ inline def bindContext[TArgs /* <: js.Array[Any] */, TResult, TThis](callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult]): js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindContext")(callback.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult]]
  
  object parentEntrySlot {
    
    @JSImport("optimism/lib/context", "parentEntrySlot")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getValue(): js.UndefOr[AnyEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValue")().asInstanceOf[js.UndefOr[AnyEntry]]
    
    inline def hasValue(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasValue")().asInstanceOf[Boolean]
    
    @JSImport("optimism/lib/context", "parentEntrySlot.id")
    @js.native
    val id: String = js.native
    
    inline def withValue[TResult, TArgs /* <: js.Array[Any] */, TThis](value: AnyEntry, callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult]): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("withValue")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TResult]
    inline def withValue[TResult, TArgs /* <: js.Array[Any] */, TThis](
      value: AnyEntry,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: TArgs
    ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("withValue")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[TResult]
    inline def withValue[TResult, TArgs /* <: js.Array[Any] */, TThis](
      value: AnyEntry,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: TArgs,
      thisArg: TThis
    ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("withValue")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[TResult]
    inline def withValue[TResult, TArgs /* <: js.Array[Any] */, TThis](
      value: AnyEntry,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: Unit,
      thisArg: TThis
    ): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("withValue")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[TResult]
  }
  
  inline def setTimeout(callback: js.Function0[Any], delay: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Any]
}
