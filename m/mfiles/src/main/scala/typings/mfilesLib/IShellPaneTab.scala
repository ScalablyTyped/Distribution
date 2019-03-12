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
    Remove: () => scala.Unit,
    Select: () => scala.Unit,
    Selected: scala.Boolean,
    ShowDashboard: (java.lang.String, js.Any) => scala.Unit,
    ShowEmptyContent: () => scala.Unit,
    ShowFilePreview: java.lang.String => scala.Unit,
    ShowObjectVersionProperties: IPropertyValuesWithIconClues => scala.Unit,
    ShowPersistentContent: scala.Double => scala.Unit,
    ShowSSRSReport: java.lang.String => scala.Unit,
    TabId: java.lang.String,
    Title: java.lang.String,
    Unselect: () => scala.Unit,
    Visible: scala.Boolean
  ): IShellPaneTab = {
    val __obj = js.Dynamic.literal(Events = Events, IsBuiltIn = IsBuiltIn, Remove = js.Any.fromFunction0(Remove), Select = js.Any.fromFunction0(Select), Selected = Selected, ShowDashboard = js.Any.fromFunction2(ShowDashboard), ShowEmptyContent = js.Any.fromFunction0(ShowEmptyContent), ShowFilePreview = js.Any.fromFunction1(ShowFilePreview), ShowObjectVersionProperties = js.Any.fromFunction1(ShowObjectVersionProperties), ShowPersistentContent = js.Any.fromFunction1(ShowPersistentContent), ShowSSRSReport = js.Any.fromFunction1(ShowSSRSReport), TabId = TabId, Title = Title, Unselect = js.Any.fromFunction0(Unselect), Visible = Visible)
  
    __obj.asInstanceOf[IShellPaneTab]
  }
}

