package typings
package olLib.interactionExtentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Allows the user to draw a vector box by clicking and dragging on the map.
  * Once drawn, the vector box can be modified by dragging its vertices or edges.
  * This interaction is only supported for mouse devices.
  *
  * @fires ol.interaction.Extent.Event
  * @param options Options.
  * @api stable
  */
@JSImport("ol/interaction/Extent", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.interactionNs.Extent {
  /**
    * @fires ol.interaction.Extent.Event
    * @param options Options.
    * @api stable
    */
  def this(options: openlayersLib.openlayersMod.olxNs.interactionNs.ExtentOptions) = this()
}

