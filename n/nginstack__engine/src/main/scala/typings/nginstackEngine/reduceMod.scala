package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduceMod {
  
  inline def apply(
    obj: Any,
    func: js.Function4[/* arg0 */ Any, /* arg1 */ Any, /* arg2 */ String, /* arg3 */ Any, Any],
    `val`: Any
  ): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], func.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(
    obj: Any,
    func: js.Function4[/* arg0 */ Any, /* arg1 */ Any, /* arg2 */ String, /* arg3 */ Any, Any],
    `val`: Any,
    opt_obj: Any
  ): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], func.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opt_obj.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("@nginstack/engine/lib/object/reduce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
