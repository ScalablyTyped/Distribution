package typings.openlayers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object color {
  
  @JSImport("openlayers", "color.asArray")
  @js.native
  def asArray(color: String): Color_ = js.native
  /**
    * Return the color as an array. This function maintains a cache of calculated
    * arrays which means the result should not be modified.
    * @param color Color.
    * @return Color.
    * @api
    */
  @JSImport("openlayers", "color.asArray")
  @js.native
  def asArray(color: Color_): Color_ = js.native
  
  @JSImport("openlayers", "color.asString")
  @js.native
  def asString(color: String): String = js.native
  /**
    * Return the color as an rgba string.
    * @param color Color.
    * @return Rgba string.
    * @api
    */
  @JSImport("openlayers", "color.asString")
  @js.native
  def asString(color: Color_): String = js.native
}
