package typings.ol.overviewMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverviewMap
  extends typings.ol.controlControlMod.default {
  
  /**
    * Determine if the overview map is collapsed.
    */
  def getCollapsed(): Boolean = js.native
  
  /**
    * Return true if the overview map is collapsible, false otherwise.
    */
  def getCollapsible(): Boolean = js.native
  
  /**
    * Return the overview map.
    */
  def getOverviewMap(): typings.ol.pluggableMapMod.default = js.native
  
  /**
    * Return true if the overview map view can rotate, false otherwise.
    */
  def getRotateWithView(): Boolean = js.native
  
  /**
    * Collapse or expand the overview map according to the passed parameter. Will
    * not do anything if the overview map isn't collapsible or if the current
    * collapsed state is already the one requested.
    */
  def setCollapsed(collapsed: Boolean): Unit = js.native
  
  /**
    * Set whether the overview map should be collapsible.
    */
  def setCollapsible(collapsible: Boolean): Unit = js.native
  
  /**
    * Set whether the overview map view should rotate with the main map view.
    */
  def setRotateWithView(rotateWithView: Boolean): Unit = js.native
}
