package typings.openlayers.global.ol

import typings.openlayers.mod.olx.OverlayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.Overlay")
@js.native
open class Overlay protected ()
  extends typings.openlayers.mod.Overlay {
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
  def this(options: OverlayOptions) = this()
}
