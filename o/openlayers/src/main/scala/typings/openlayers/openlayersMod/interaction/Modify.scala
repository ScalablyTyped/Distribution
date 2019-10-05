package typings.openlayers.openlayersMod.interaction

import typings.openlayers.openlayersMod.Collection
import typings.openlayers.openlayersMod.Feature
import typings.openlayers.openlayersMod.MapBrowserEvent
import typings.openlayers.openlayersMod.MapBrowserPointerEvent
import typings.openlayers.openlayersMod.ModifyEventType
import typings.openlayers.openlayersMod.olx.interaction.ModifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Interaction for modifying feature geometries.
  *
  * @param options Options.
  * @fires ol.interaction.ModifyEvent
  * @api
  */
@JSImport("openlayers", "interaction.Modify")
@js.native
class Modify protected () extends Pointer {
  /**
    * @classdesc
    * Interaction for modifying feature geometries.
    *
    * @param options Options.
    * @fires ol.interaction.ModifyEvent
    * @api
    */
  def this(options: ModifyOptions) = this()
  /**
    * Removes the vertex currently being pointed.
    * @return True when a vertex was removed.
    * @api
    */
  def removePoint(): Boolean = js.native
}

@JSImport("openlayers", "interaction.Modify")
@js.native
object Modify extends js.Object {
  /**
    * @classdesc
    * Events emitted by {@link ol.interaction.Modify} instances are instances of
    * this type.
    *
    * @param type Type.
    * @param features The features modified.
    * @param mapBrowserPointerEvent Associated
    *     {@link ol.MapBrowserPointerEvent}.
    */
  @js.native
  class Event protected ()
    extends typings.openlayers.openlayersMod.events.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Modify} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param features The features modified.
      * @param mapBrowserPointerEvent Associated
      *     {@link ol.MapBrowserPointerEvent}.
      */
    def this(
      `type`: ModifyEventType,
      features: Collection[Feature],
      mapBrowserPointerEvent: MapBrowserPointerEvent
    ) = this()
    /**
      * The features being modified.
      * @api
      */
    var features: Collection[Feature] = js.native
    /**
      * Associated {@link ol.MapBrowserEvent}.
      * @api
      */
    var mapBrowserEvent: MapBrowserEvent = js.native
  }
  
}

