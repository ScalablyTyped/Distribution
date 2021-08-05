package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adjustHueMod {
  
  @JSImport("polished/lib/color/adjustHue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(degree: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(degree.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def default(degree: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(degree.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(degree: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(degree.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def default(degree: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(degree.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
}
