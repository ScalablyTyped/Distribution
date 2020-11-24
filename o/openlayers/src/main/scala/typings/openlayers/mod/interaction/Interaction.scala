package typings.openlayers.mod.interaction

import typings.openlayers.mod.Map
import typings.openlayers.mod.Object
import typings.openlayers.mod.olx.interaction.InteractionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("openlayers", "interaction.Interaction")
@js.native
class Interaction protected () extends Object {
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
  def this(options: InteractionOptions) = this()
  
  /**
    * Return whether the interaction is currently active.
    * @return `true` if the interaction is active, `false` otherwise.
    * @observable
    * @api
    */
  def getActive(): Boolean = js.native
  
  /**
    * Get the map associated with this interaction.
    * @return Map.
    * @api
    */
  def getMap(): Map = js.native
  
  /**
    * Activate or deactivate the interaction.
    * @param active Active.
    * @observable
    * @api
    */
  def setActive(active: Boolean): Unit = js.native
}
