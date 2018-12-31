package typings
package olLib.interactionDraganddropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Handles input of vector data by drag and drop.
  *
  * @fires ol.interaction.DragAndDropEvent
  * @param opt_options Options.
  * @api stable
  */
@JSImport("ol/interaction/draganddrop", JSImport.Default)
@js.native
/**
  * @classdesc
  * Handles input of vector data by drag and drop.
  *
  * @fires ol.interaction.DragAndDropEvent
  * @param opt_options Options.
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.interactionNs.DragAndDrop {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DragAndDropOptions) = this()
}

/**
  * @classdesc
  * Handles input of vector data by drag and drop.
  *
  * @fires ol.interaction.DragAndDropEvent
  * @param opt_options Options.
  * @api stable
  */
@JSImport("ol/interaction/draganddrop", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Handles the {@link ol.MapBrowserEvent map browser event} unconditionally and
    * neither prevents the browser default nor stops event propagation.
    * @param mapBrowserEvent Map browser event.
    * @return `false` to stop event propagation.
    * @api
    */
  var handleEvent: js.Any = js.native
}

