package typings.nginstackEngine

import typings.nginstackEngine.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forceRecordUpdateMod {
  
  inline def apply(queryFunc: js.Function0[Any], updateFunc: js.Function1[/* arg0 */ Any, Any]): Any = (^.asInstanceOf[js.Dynamic].apply(queryFunc.asInstanceOf[js.Any], updateFunc.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(queryFunc: js.Function0[Any], updateFunc: js.Function1[/* arg0 */ Any, Any], opt_options: Context): Any = (^.asInstanceOf[js.Dynamic].apply(queryFunc.asInstanceOf[js.Any], updateFunc.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@nginstack/engine/lib/dataset/forceRecordUpdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
