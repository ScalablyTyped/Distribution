package typings.openlayers.openlayersMod.interaction

import typings.openlayers.openlayersMod.Map
import typings.openlayers.openlayersMod.olx.interaction.ExtentOptions
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
@JSImport("openlayers", "interaction.Extent")
@js.native
class Extent protected () extends Pointer {
  /**
    * @fires ol.interaction.Extent.Event
    * @param options Options.
    * @api stable
    */
  def this(options: ExtentOptions) = this()
  /**
    * Returns the current drawn extent in the view projection
    *
    * @return Drawn extent in the view projection.
    * @api
    */
  def getExtent(): typings.openlayers.openlayersMod.Extent = js.native
  /**
    * Manually sets the drawn extent, using the view projection.
    *
    * @param extent Extent
    * @api
    */
  def setExtent(extent: typings.openlayers.openlayersMod.Extent): Unit = js.native
  /**
    * @inheritDoc
    */
  def setMap(map: Map): Unit = js.native
}

@JSImport("openlayers", "interaction.Extent")
@js.native
object Extent extends js.Object {
  /**
    * @classdesc
    * Events emitted by {@link ol.interaction.Extent} instances are instances of
    * this type.
    *
    * @param extent the new extent
    */
  @js.native
  class Event protected ()
    extends typings.openlayers.openlayersMod.events.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Extent} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param feature The feature drawn.
      */
    def this(`type`: ExtentEventType, extent: typings.openlayers.openlayersMod.Extent) = this()
    /**
      * The current extent.
      * @api stable
      */
    var extent: typings.openlayers.openlayersMod.Extent = js.native
  }
  
}

