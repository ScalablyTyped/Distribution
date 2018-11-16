package typings
package olLib.overlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("ol/overlay", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.Overlay {
  /**
       * @classdesc
       * An element to be displayed over the map and attached to a single map
       * location.  Like {@link ol.control.Control}, Overlays are visible widgets.
       * Unlike Controls, they are not in a fixed position on the screen, but are tied
       * to a geographical coordinate, so panning the map will move an Overlay but not
       * a Control.
       *
       * Example:
       *
       *     var popup = new ol.Overlay({
       *       element: document.getElementById('popup')
       *     });
       *     popup.setPosition(coordinate);
       *     map.addOverlay(popup);
       *
       * @param options Overlay options.
       * @api stable
       */
  def this(options: openlayersLib.openlayersMod.olxNs.OverlayOptions) = this()
}

