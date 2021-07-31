package typings.polished

import typings.polished.colorMod.HslColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hslMod {
  
  @JSImport("polished/lib/color/hsl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def default(value: Double, saturation: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(value: Double, saturation: Double, lightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(value: Double, saturation: Unit, lightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(value: HslColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def default(value: HslColor, saturation: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(value: HslColor, saturation: Double, lightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(value: HslColor, saturation: Unit, lightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[String]
}
