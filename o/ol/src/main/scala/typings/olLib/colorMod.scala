package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/color", JSImport.Namespace)
@js.native
object colorMod extends js.Object {
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    def asArray(color: java.lang.String): openlayersLib.openlayersMod.Color = js.native
    /**
      * Return the color as an array. This function maintains a cache of calculated
      * arrays which means the result should not be modified.
      * @param color Color.
      * @return Color.
      * @api
      */
    def asArray(color: openlayersLib.openlayersMod.Color): openlayersLib.openlayersMod.Color = js.native
    def asString(color: java.lang.String): java.lang.String = js.native
    /**
      * Return the color as an rgba string.
      * @param color Color.
      * @return Rgba string.
      * @api
      */
    def asString(color: openlayersLib.openlayersMod.Color): java.lang.String = js.native
  }
  
}

