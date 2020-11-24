package typings.openlayers.mod.interaction

import typings.openlayers.mod.Feature
import typings.openlayers.mod.olx.interaction.DragAndDropOptions
import typings.openlayers.mod.proj.Projection
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Handles input of vector data by drag and drop.
  *
  * @fires ol.interaction.DragAndDropEvent
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "interaction.DragAndDrop")
@js.native
/**
  * @classdesc
  * Handles input of vector data by drag and drop.
  *
  * @fires ol.interaction.DragAndDropEvent
  * @param opt_options Options.
  * @api stable
  */
class DragAndDrop () extends Interaction {
  def this(opt_options: DragAndDropOptions) = this()
}
/* static members */
@JSImport("openlayers", "interaction.DragAndDrop")
@js.native
object DragAndDrop extends js.Object {
  
  /**
    * Handles the {@link ol.MapBrowserEvent map browser event} unconditionally and
    * neither prevents the browser default nor stops event propagation.
    * @param mapBrowserEvent Map browser event.
    * @return `false` to stop event propagation.
    * @api
    */
  var handleEvent: js.Any = js.native
  
  /**
    * @classdesc
    * Events emitted by {@link ol.interaction.DragAndDrop} instances are instances
    * of this type.
    *
    * @param type Type.
    * @param file File.
    * @param opt_features Features.
    * @param opt_projection Projection.
    */
  @js.native
  class Event protected ()
    extends typings.openlayers.mod.events.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.DragAndDrop} instances are instances
      * of this type.
      *
      * @param type Type.
      * @param file File.
      * @param opt_features Features.
      * @param opt_projection Projection.
      */
    def this(`type`: DragAndDropEventType, file: File) = this()
    def this(`type`: DragAndDropEventType, file: File, opt_features: js.Array[Feature]) = this()
    def this(
      `type`: DragAndDropEventType,
      file: File,
      opt_features: js.UndefOr[scala.Nothing],
      opt_projection: Projection
    ) = this()
    def this(
      `type`: DragAndDropEventType,
      file: File,
      opt_features: js.Array[Feature],
      opt_projection: Projection
    ) = this()
    
    /**
      * The features parsed from dropped data.
      * @api stable
      */
    var features: js.Array[Feature] = js.native
    
    /**
      * The dropped file.
      * @api stable
      */
    var file: File = js.native
    
    /**
      * The feature projection.
      * @api
      */
    var projection: Projection = js.native
  }
}
