package typings.openlayers.mod.control

import typings.openlayers.mod.Map
import typings.openlayers.mod.MapEvent
import typings.openlayers.mod.olx.control.OverviewMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new control with a map acting as an overview map for an other
  * defined map.
  * @param opt_options OverviewMap options.
  * @api
  */
@JSImport("openlayers", "control.OverviewMap")
@js.native
/**
  * Create a new control with a map acting as an overview map for an other
  * defined map.
  * @param opt_options OverviewMap options.
  * @api
  */
class OverviewMap () extends Control {
  def this(opt_options: OverviewMapOptions) = this()
  
  /**
    * Determine if the overview map is collapsed.
    * @return The overview map is collapsed.
    * @api stable
    */
  def getCollapsed(): Boolean = js.native
  
  /**
    * Return `true` if the overview map is collapsible, `false` otherwise.
    * @return True if the widget is collapsible.
    * @api stable
    */
  def getCollapsible(): Boolean = js.native
  
  /**
    * Return the overview map.
    * @return Overview map.
    * @api
    */
  def getOverviewMap(): Map = js.native
  
  /**
    * Collapse or expand the overview map according to the passed parameter. Will
    * not do anything if the overview map isn't collapsible or if the current
    * collapsed state is already the one requested.
    * @param collapsed True if the widget is collapsed.
    * @api stable
    */
  def setCollapsed(collapsed: Boolean): Unit = js.native
  
  /**
    * Set whether the overview map should be collapsible.
    * @param collapsible True if the widget is collapsible.
    * @api stable
    */
  def setCollapsible(collapsible: Boolean): Unit = js.native
}
/* static members */
@JSImport("openlayers", "control.OverviewMap")
@js.native
object OverviewMap extends js.Object {
  
  /**
    * Update the overview map element.
    * @param mapEvent Map event.
    * @api
    */
  def render(mapEvent: MapEvent): Unit = js.native
}
