package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setLightnessMod {
  
  @JSImport("polished/lib/color/setLightness", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(lightness: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(lightness.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  @scala.inline
  def default(lightness: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(lightness.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(lightness: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(lightness.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  @scala.inline
  def default(lightness: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(lightness.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
}
