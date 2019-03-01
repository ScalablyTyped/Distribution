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

object IShellPaneTab {
  @scala.inline
  def apply(
    Events: IShellPaneTabEvents,
    IsBuiltIn: scala.Boolean,
    Remove: js.Function0[scala.Unit],
    Select: js.Function0[scala.Unit],
    Selected: scala.Boolean,
    ShowDashboard: js.Function2[java.lang.String, js.Any, scala.Unit],
    ShowEmptyContent: js.Function0[scala.Unit],
    ShowFilePreview: js.Function1[java.lang.String, scala.Unit],
    ShowObjectVersionProperties: js.Function1[IPropertyValuesWithIconClues, scala.Unit],
    ShowPersistentContent: js.Function1[scala.Double, scala.Unit],
    ShowSSRSReport: js.Function1[java.lang.String, scala.Unit],
    TabId: java.lang.String,
    Title: java.lang.String,
    Unselect: js.Function0[scala.Unit],
    Visible: scala.Boolean
  ): IShellPaneTab = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Events")(Events)
    __obj.updateDynamic("IsBuiltIn")(IsBuiltIn)
    __obj.updateDynamic("Remove")(Remove)
    __obj.updateDynamic("Select")(Select)
    __obj.updateDynamic("Selected")(Selected)
    __obj.updateDynamic("ShowDashboard")(ShowDashboard)
    __obj.updateDynamic("ShowEmptyContent")(ShowEmptyContent)
    __obj.updateDynamic("ShowFilePreview")(ShowFilePreview)
    __obj.updateDynamic("ShowObjectVersionProperties")(ShowObjectVersionProperties)
    __obj.updateDynamic("ShowPersistentContent")(ShowPersistentContent)
    __obj.updateDynamic("ShowSSRSReport")(ShowSSRSReport)
    __obj.updateDynamic("TabId")(TabId)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("Unselect")(Unselect)
    __obj.updateDynamic("Visible")(Visible)
    __obj.asInstanceOf[IShellPaneTab]
  }
}

