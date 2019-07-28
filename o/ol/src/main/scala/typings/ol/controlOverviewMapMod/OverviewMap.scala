package typings.ol.controlOverviewMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverviewMap
  extends typings.ol.controlControlMod.default {
  def getCollapsed(): Boolean = js.native
  def getCollapsible(): Boolean = js.native
  def getOverviewMap(): typings.ol.pluggableMapMod.default = js.native
  def setCollapsed(collapsed: Boolean): Unit = js.native
  def setCollapsible(collapsible: Boolean): Unit = js.native
}

