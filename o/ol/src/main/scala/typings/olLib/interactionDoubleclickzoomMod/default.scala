package typings
package olLib.interactionDoubleclickzoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Allows the user to zoom by double-clicking on the map.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("ol/interaction/doubleclickzoom", JSImport.Default)
@js.native
/**
  * @classdesc
  * Allows the user to zoom by double-clicking on the map.
  *
  * @param opt_options Options.
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.interactionNs.DoubleClickZoom {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DoubleClickZoomOptions) = this()
}

/* static members */
@JSImport("ol/interaction/doubleclickzoom", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Handles the {@link ol.MapBrowserEvent map browser event} (if it was a
    * doubleclick) and eventually zooms the map.
    * @param mapBrowserEvent Map browser event.
    * @return `false` to stop event propagation.
    * @api
    */
  def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
}

