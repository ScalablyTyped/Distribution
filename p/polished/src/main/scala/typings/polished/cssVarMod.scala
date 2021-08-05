package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssVarMod {
  
  @JSImport("polished/lib/helpers/cssVar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(cssVariable: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cssVariable.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  inline def default(cssVariable: String, passThrough: Boolean): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cssVariable.asInstanceOf[js.Any], passThrough.asInstanceOf[js.Any])).asInstanceOf[String | Double]
}
