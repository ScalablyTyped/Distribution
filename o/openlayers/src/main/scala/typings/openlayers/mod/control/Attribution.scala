package typings.openlayers.mod.control

import typings.openlayers.mod.MapEvent
import typings.openlayers.mod.olx.control.AttributionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Control to show all the attributions associated with the layer sources
  * in the map. This control is one of the default controls included in maps.
  * By default it will show in the bottom right portion of the map, but this can
  * be changed by using a css selector for `.ol-attribution`.
  *
  * @param opt_options Attribution options.
  * @api stable
  */
@JSImport("openlayers", "control.Attribution")
@js.native
/**
  * @classdesc
  * Control to show all the attributions associated with the layer sources
  * in the map. This control is one of the default controls included in maps.
  * By default it will show in the bottom right portion of the map, but this can
  * be changed by using a css selector for `.ol-attribution`.
  *
  * @param opt_options Attribution options.
  * @api stable
  */
class Attribution () extends Control {
  def this(opt_options: AttributionOptions) = this()
  
  /**
    * Return `true` when the attribution is currently collapsed or `false`
    * otherwise.
    * @return True if the widget is collapsed.
    * @api stable
    */
  def getCollapsed(): Boolean = js.native
  
  /**
    * Return `true` if the attribution is collapsible, `false` otherwise.
    * @return True if the widget is collapsible.
    * @api stable
    */
  def getCollapsible(): Boolean = js.native
  
  /**
    * Collapse or expand the attribution according to the passed parameter. Will
    * not do anything if the attribution isn't collapsible or if the current
    * collapsed state is already the one requested.
    * @param collapsed True if the widget is collapsed.
    * @api stable
    */
  def setCollapsed(collapsed: Boolean): Unit = js.native
  
  /**
    * Set whether the attribution should be collapsible.
    * @param collapsible True if the widget is collapsible.
    * @api stable
    */
  def setCollapsible(collapsible: Boolean): Unit = js.native
}
/* static members */
@JSImport("openlayers", "control.Attribution")
@js.native
object Attribution extends js.Object {
  
  /**
    * Update the attribution element.
    * @param mapEvent Map event.
    * @api
    */
  def render(mapEvent: MapEvent): Unit = js.native
}
