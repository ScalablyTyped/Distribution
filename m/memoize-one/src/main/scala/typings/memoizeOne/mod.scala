package typings.memoizeOne

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memoize-one", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TFunc /* <: js.ThisFunction1[/* this */ Any, /* repeated */ Any, Any] */](resultFn: TFunc): MemoizedFn[TFunc] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(resultFn.asInstanceOf[js.Any]).asInstanceOf[MemoizedFn[TFunc]]
  inline def default[TFunc /* <: js.ThisFunction1[/* this */ Any, /* repeated */ Any, Any] */](resultFn: TFunc, isEqual: EqualityFn[TFunc]): MemoizedFn[TFunc] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(resultFn.asInstanceOf[js.Any], isEqual.asInstanceOf[js.Any])).asInstanceOf[MemoizedFn[TFunc]]
  
  type EqualityFn[TFunc /* <: js.Function1[/* repeated */ Any, Any] */] = js.Function2[/* newArgs */ Parameters[TFunc], /* lastArgs */ Parameters[TFunc], Boolean]
  
  @js.native
  trait MemoizedFn[TFunc /* <: js.ThisFunction1[/* this */ Any, /* repeated */ Any, Any] */] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<TFunc> is not an array type */ args: Parameters[TFunc]
    ): ReturnType[TFunc] = js.native
    
    def clear(): Unit = js.native
  }
}
