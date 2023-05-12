package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStringTemplateMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/string/template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def template(str: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def template(str: String, data: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(str.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Any]
}
