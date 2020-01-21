package typings.openlayers.mod.interaction

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.geom.Polygon
import typings.openlayers.mod.olx.interaction.DragBoxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Allows the user to draw a vector box by clicking and dragging on the map,
  * normally combined with an {@link ol.events.condition} that limits
  * it to when the shift or other key is held down. This is used, for example,
  * for zooming to a specific area of the map
  * (see {@link ol.interaction.DragZoom} and
  * {@link ol.interaction.DragRotateAndZoom}).
  *
  * This interaction is only supported for mouse devices.
  *
  * @fires ol.DragBoxEvent
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "interaction.DragBox")
@js.native
/**
  * @classdesc
  * Allows the user to draw a vector box by clicking and dragging on the map,
  * normally combined with an {@link ol.events.condition} that limits
  * it to when the shift or other key is held down. This is used, for example,
  * for zooming to a specific area of the map
  * (see {@link ol.interaction.DragZoom} and
  * {@link ol.interaction.DragRotateAndZoom}).
  *
  * This interaction is only supported for mouse devices.
  *
  * @fires ol.DragBoxEvent
  * @param opt_options Options.
  * @api stable
  */
class DragBox () extends Pointer {
  def this(opt_options: DragBoxOptions) = this()
  /**
    * Returns geometry of last drawn box.
    * @return Geometry.
    * @api stable
    */
  def getGeometry(): Polygon = js.native
}

@JSImport("openlayers", "interaction.DragBox")
@js.native
object DragBox extends js.Object {
  /**
    * @classdesc
    * Events emitted by {@link ol.interaction.DragBox} instances are instances of
    * this type.
    *
    * @param type The event type.
    * @param coordinate The event coordinate.
    * @param mapBrowserEvent Originating event.
    */
  @js.native
  class Event protected ()
    extends typings.openlayers.mod.events.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.DragBox} instances are instances of
      * this type.
      *
      * @param type The event type.
      * @param coordinate The event coordinate.
      * @param mapBrowserEvent Originating event.
      */
    def this(`type`: String, coordinate: Coordinate_, mapBrowserEvent: MapBrowserEvent) = this()
    /**
      * The coordinate of the drag event.
      * @const
      * @api stable
      */
    var coordinate: Coordinate_ = js.native
    /**
      * @const
      * @api
      */
    var mapBrowserEvent: MapBrowserEvent = js.native
  }
  
}

