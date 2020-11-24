package typings.ol.attributionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attribution
  extends typings.ol.controlControlMod.default {
  
  /**
    * Return true when the attribution is currently collapsed or false
    * otherwise.
    */
  def getCollapsed(): Boolean = js.native
  
  /**
    * Return true if the attribution is collapsible, false otherwise.
    */
  def getCollapsible(): Boolean = js.native
  
  /**
    * Collapse or expand the attribution according to the passed parameter. Will
    * not do anything if the attribution isn't collapsible or if the current
    * collapsed state is already the one requested.
    */
  def setCollapsed(collapsed: Boolean): Unit = js.native
  
  /**
    * Set whether the attribution should be collapsible.
    */
  def setCollapsible(collapsible: Boolean): Unit = js.native
}
