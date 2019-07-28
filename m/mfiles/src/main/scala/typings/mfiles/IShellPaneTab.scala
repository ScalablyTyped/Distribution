package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellPaneTab extends js.Object {
  val Events: IShellPaneTabEvents
  val IsBuiltIn: Boolean
  val Selected: Boolean
  val TabId: String
  var Title: String
  var Visible: Boolean
  def Remove(): Unit
  def Select(): Unit
  def ShowDashboard(dashboardID: String, data: js.Any): Unit
  def ShowEmptyContent(): Unit
  def ShowFilePreview(file: String): Unit
  def ShowObjectVersionProperties(propertyValuesWithIcons: IPropertyValuesWithIconClues): Unit
  def ShowPersistentContent(sessionHandle: Double): Unit
  def ShowSSRSReport(reportURL: String): Unit
  def Unselect(): Unit
}

object IShellPaneTab {
  @scala.inline
  def apply(
    Events: IShellPaneTabEvents,
    IsBuiltIn: Boolean,
    Remove: () => Unit,
    Select: () => Unit,
    Selected: Boolean,
    ShowDashboard: (String, js.Any) => Unit,
    ShowEmptyContent: () => Unit,
    ShowFilePreview: String => Unit,
    ShowObjectVersionProperties: IPropertyValuesWithIconClues => Unit,
    ShowPersistentContent: Double => Unit,
    ShowSSRSReport: String => Unit,
    TabId: String,
    Title: String,
    Unselect: () => Unit,
    Visible: Boolean
  ): IShellPaneTab = {
    val __obj = js.Dynamic.literal(Events = Events, IsBuiltIn = IsBuiltIn, Remove = js.Any.fromFunction0(Remove), Select = js.Any.fromFunction0(Select), Selected = Selected, ShowDashboard = js.Any.fromFunction2(ShowDashboard), ShowEmptyContent = js.Any.fromFunction0(ShowEmptyContent), ShowFilePreview = js.Any.fromFunction1(ShowFilePreview), ShowObjectVersionProperties = js.Any.fromFunction1(ShowObjectVersionProperties), ShowPersistentContent = js.Any.fromFunction1(ShowPersistentContent), ShowSSRSReport = js.Any.fromFunction1(ShowSSRSReport), TabId = TabId, Title = Title, Unselect = js.Any.fromFunction0(Unselect), Visible = Visible)
  
    __obj.asInstanceOf[IShellPaneTab]
  }
}

