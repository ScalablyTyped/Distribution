package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.olx.OverlayOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "Overlay")
@js.native
class Overlay protected () extends Object {
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
  /**
    * Get the DOM element of this overlay.
    * @return The Element containing the overlay.
    * @observable
    * @api stable
    */
  def getElement(): Element = js.native
  /**
    * Get the overlay identifier which is set on constructor.
    * @return Id.
    * @api
    */
  def getId(): Double | String = js.native
  /**
    * Get the map associated with this overlay.
    * @return The map that the overlay is part of.
    * @observable
    * @api stable
    */
  def getMap(): Map = js.native
  /**
    * Get the offset of this overlay.
    * @return The offset.
    * @observable
    * @api stable
    */
  def getOffset(): js.Array[Double] = js.native
  /**
    * Get the current position of this overlay.
    * @return The spatial point that the overlay is
    *     anchored at.
    * @observable
    * @api stable
    */
  def getPosition(): Coordinate = js.native
  /**
    * Get the current positioning of this overlay.
    * @return How the overlay is positioned
    *     relative to its point on the map.
    * @observable
    * @api stable
    */
  def getPositioning(): OverlayPositioning = js.native
  /**
    * Set the DOM element to be associated with this overlay.
    * @param element The Element containing the overlay.
    * @observable
    * @api stable
    */
  def setElement(element: Element): Unit = js.native
  /**
    * Set the map to be associated with this overlay.
    * @param map The map that the overlay is part of.
    * @observable
    * @api stable
    */
  def setMap(map: Map): Unit = js.native
  /**
    * Set the offset for this overlay.
    * @param offset Offset.
    * @observable
    * @api stable
    */
  def setOffset(offset: js.Array[Double]): Unit = js.native
  def setPosition(): Unit = js.native
  /**
    * Set the position for this overlay. If the position is `undefined` the
    * overlay is hidden.
    * @param position The spatial point that the overlay
    *     is anchored at.
    * @observable
    * @api stable
    */
  def setPosition(position: Coordinate): Unit = js.native
  /**
    * Set the positioning for this overlay.
    * @param positioning how the overlay is
    *     positioned relative to its point on the map.
    * @observable
    * @api stable
    */
  def setPositioning(positioning: OverlayPositioning): Unit = js.native
}

