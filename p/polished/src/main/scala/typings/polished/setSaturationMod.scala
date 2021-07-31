package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setSaturationMod {
  
  @JSImport("polished/lib/color/setSaturation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(saturation: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(saturation.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  @scala.inline
  def default(saturation: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(saturation.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(saturation: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(saturation.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  @scala.inline
  def default(saturation: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(saturation.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
}
