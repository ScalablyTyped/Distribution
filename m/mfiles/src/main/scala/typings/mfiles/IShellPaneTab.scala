package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShellPaneTab extends js.Object {
  
  val Events: IShellPaneTabEvents = js.native
  
  val IsBuiltIn: Boolean = js.native
  
  def Remove(): Unit = js.native
  
  def Select(): Unit = js.native
  
  val Selected: Boolean = js.native
  
  def ShowDashboard(dashboardID: String, data: js.Any): Unit = js.native
  
  def ShowEmptyContent(): Unit = js.native
  
  def ShowFilePreview(file: String): Unit = js.native
  
  def ShowObjectVersionProperties(propertyValuesWithIcons: IPropertyValuesWithIconClues): Unit = js.native
  
  def ShowPersistentContent(sessionHandle: Double): Unit = js.native
  
  def ShowSSRSReport(reportURL: String): Unit = js.native
  
  val TabId: String = js.native
  
  var Title: String = js.native
  
  def Unselect(): Unit = js.native
  
  var Visible: Boolean = js.native
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
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], IsBuiltIn = IsBuiltIn.asInstanceOf[js.Any], Remove = js.Any.fromFunction0(Remove), Select = js.Any.fromFunction0(Select), Selected = Selected.asInstanceOf[js.Any], ShowDashboard = js.Any.fromFunction2(ShowDashboard), ShowEmptyContent = js.Any.fromFunction0(ShowEmptyContent), ShowFilePreview = js.Any.fromFunction1(ShowFilePreview), ShowObjectVersionProperties = js.Any.fromFunction1(ShowObjectVersionProperties), ShowPersistentContent = js.Any.fromFunction1(ShowPersistentContent), ShowSSRSReport = js.Any.fromFunction1(ShowSSRSReport), TabId = TabId.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Unselect = js.Any.fromFunction0(Unselect), Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellPaneTab]
  }
  
  @scala.inline
  implicit class IShellPaneTabOps[Self <: IShellPaneTab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvents(value: IShellPaneTabEvents): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBuiltIn(value: Boolean): Self = this.set("IsBuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("Remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("Selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDashboard(value: (String, js.Any) => Unit): Self = this.set("ShowDashboard", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowEmptyContent(value: () => Unit): Self = this.set("ShowEmptyContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowFilePreview(value: String => Unit): Self = this.set("ShowFilePreview", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowObjectVersionProperties(value: IPropertyValuesWithIconClues => Unit): Self = this.set("ShowObjectVersionProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowPersistentContent(value: Double => Unit): Self = this.set("ShowPersistentContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowSSRSReport(value: String => Unit): Self = this.set("ShowSSRSReport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTabId(value: String): Self = this.set("TabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselect(value: () => Unit): Self = this.set("Unselect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
}
