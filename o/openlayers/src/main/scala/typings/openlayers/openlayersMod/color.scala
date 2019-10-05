package typings.openlayers.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "color")
@js.native
object color extends js.Object {
  def asArray(color: String): Color = js.native
  /**
    * Return the color as an array. This function maintains a cache of calculated
    * arrays which means the result should not be modified.
    * @param color Color.
    * @return Color.
    * @api
    */
  def asArray(color: Color): Color = js.native
  def asString(color: String): String = js.native
  /**
    * Return the color as an rgba string.
    * @param color Color.
    * @return Rgba string.
    * @api
    */
  def asString(color: Color): String = js.native
}

