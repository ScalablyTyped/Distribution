package typings
package olLib.controlOverviewMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverviewMap
  extends olLib.controlControlMod.default {
  def getCollapsed(): scala.Boolean = js.native
  def getCollapsible(): scala.Boolean = js.native
  def getOverviewMap(): olLib.pluggableMapMod.default = js.native
  def setCollapsed(collapsed: scala.Boolean): scala.Unit = js.native
  def setCollapsible(collapsible: scala.Boolean): scala.Unit = js.native
}

