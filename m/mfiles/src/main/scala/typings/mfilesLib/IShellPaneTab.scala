package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellPaneTab extends js.Object {
  val Events: IShellPaneTabEvents
  val IsBuiltIn: scala.Boolean
  val Selected: scala.Boolean
  val TabId: java.lang.String
  var Title: java.lang.String
  var Visible: scala.Boolean
  def Remove(): scala.Unit
  def Select(): scala.Unit
  def ShowDashboard(dashboardID: java.lang.String, data: js.Any): scala.Unit
  def ShowEmptyContent(): scala.Unit
  def ShowFilePreview(file: java.lang.String): scala.Unit
  def ShowObjectVersionProperties(propertyValuesWithIcons: IPropertyValuesWithIconClues): scala.Unit
  def ShowPersistentContent(sessionHandle: scala.Double): scala.Unit
  def ShowSSRSReport(reportURL: java.lang.String): scala.Unit
  def Unselect(): scala.Unit
}

