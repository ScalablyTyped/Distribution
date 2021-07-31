package typings.openlayers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object color {
  
  @JSImport("openlayers", "color")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def asArray(color: String): Color_ = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(color.asInstanceOf[js.Any]).asInstanceOf[Color_]
  /**
    * Return the color as an array. This function maintains a cache of calculated
    * arrays which means the result should not be modified.
    * @param color Color.
    * @return Color.
    * @api
    */
  @scala.inline
  def asArray(color: Color_): Color_ = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(color.asInstanceOf[js.Any]).asInstanceOf[Color_]
  
  @scala.inline
  def asString(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
    * Return the color as an rgba string.
    * @param color Color.
    * @return Rgba string.
    * @api
    */
  @scala.inline
  def asString(color: Color_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asString")(color.asInstanceOf[js.Any]).asInstanceOf[String]
}
