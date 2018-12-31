package typings
package olLib.interactionKeyboardpanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Allows the user to pan the map using keyboard arrows.
  * Note that, although this interaction is by default included in maps,
  * the keys can only be used when browser focus is on the element to which
  * the keyboard events are attached. By default, this is the map div,
  * though you can change this with the `keyboardEventTarget` in
  * {@link ol.Map}. `document` never loses focus but, for any other element,
  * focus will have to be on, and returned to, this element if the keys are to
  * function.
  * See also {@link ol.interaction.KeyboardZoom}.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("ol/interaction/keyboardpan", JSImport.Default)
@js.native
/**
  * @classdesc
  * Allows the user to pan the map using keyboard arrows.
  * Note that, although this interaction is by default included in maps,
  * the keys can only be used when browser focus is on the element to which
  * the keyboard events are attached. By default, this is the map div,
  * though you can change this with the `keyboardEventTarget` in
  * {@link ol.Map}. `document` never loses focus but, for any other element,
  * focus will have to be on, and returned to, this element if the keys are to
  * function.
  * See also {@link ol.interaction.KeyboardZoom}.
  *
  * @param opt_options Options.
  * @api stable
  */
class default ()
  extends openlayersLib.openlayersMod.interactionNs.KeyboardPan {
  def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.KeyboardPanOptions) = this()
}

/**
  * @classdesc
  * Allows the user to pan the map using keyboard arrows.
  * Note that, although this interaction is by default included in maps,
  * the keys can only be used when browser focus is on the element to which
  * the keyboard events are attached. By default, this is the map div,
  * though you can change this with the `keyboardEventTarget` in
  * {@link ol.Map}. `document` never loses focus but, for any other element,
  * focus will have to be on, and returned to, this element if the keys are to
  * function.
  * See also {@link ol.interaction.KeyboardZoom}.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("ol/interaction/keyboardpan", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Handles the {@link ol.MapBrowserEvent map browser event} if it was a
    * `KeyEvent`, and decides the direction to pan to (if an arrow key was
    * pressed).
    * @param mapBrowserEvent Map browser event.
    * @return `false` to stop event propagation.
    * @api
    */
  def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
}

