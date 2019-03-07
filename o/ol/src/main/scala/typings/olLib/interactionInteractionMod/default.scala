package typings
package olLib.interactionInteractionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * User actions that change the state of the map. Some are similar to controls,
  * but are not associated with a DOM element.
  * For example, {@link ol.interaction.KeyboardZoom} is functionally the same as
  * {@link ol.control.Zoom}, but triggered by a keyboard event not a button
  * element event.
  * Although interactions do not have a DOM element, some of them do render
  * vectors and so are visible on the screen.
  *
  * @param options Options.
  * @api
  */
@JSImport("ol/interaction/Interaction", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.interactionNs.Interaction {
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * User actions that change the state of the map. Some are similar to controls,
    * but are not associated with a DOM element.
    * For example, {@link ol.interaction.KeyboardZoom} is functionally the same as
    * {@link ol.control.Zoom}, but triggered by a keyboard event not a button
    * element event.
    * Although interactions do not have a DOM element, some of them do render
    * vectors and so are visible on the screen.
    *
    * @param options Options.
    * @api
    */
  def this(options: openlayersLib.openlayersMod.olxNs.interactionNs.InteractionOptions) = this()
}

