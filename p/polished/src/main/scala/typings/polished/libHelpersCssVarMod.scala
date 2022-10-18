package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersCssVarMod {
  
  @JSImport("polished/lib/helpers/cssVar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(cssVariable: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cssVariable.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  inline def default(cssVariable: String, defaultValue: String): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cssVariable.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  inline def default(cssVariable: String, defaultValue: Double): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cssVariable.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String | Double]
}
