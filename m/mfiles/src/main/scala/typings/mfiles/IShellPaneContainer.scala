package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellPaneContainer extends js.Object {
  val Content: js.Any = js.native
  val Events: IShellPaneContainerEvents = js.native
  val IsFocused: Boolean = js.native
  var Minimized: Boolean = js.native
  val ShellFrame: IShellFrame = js.native
  var Size: Double = js.native
  val TabTitleSize: Double = js.native
  var Visible: Boolean = js.native
  def AddTab(TabId: String, tabTitle: String, insertBeforeTabId: String): IShellPaneTab = js.native
  def Focus(): Unit = js.native
  def GetSelectedTab(): IShellPaneTab = js.native
  def GetTab(TabId: String): IShellPaneTab = js.native
  def SetDefaultSize(defaultSize: Double, resizeToDefault: Boolean): Unit = js.native
  def SetDefaultVisibility(Visible: Boolean, resetToDefault: Boolean): Unit = js.native
}

object IShellPaneContainer {
  @scala.inline
  def apply(
    AddTab: (String, String, String) => IShellPaneTab,
    Content: js.Any,
    Events: IShellPaneContainerEvents,
    Focus: () => Unit,
    GetSelectedTab: () => IShellPaneTab,
    GetTab: String => IShellPaneTab,
    IsFocused: Boolean,
    Minimized: Boolean,
    SetDefaultSize: (Double, Boolean) => Unit,
    SetDefaultVisibility: (Boolean, Boolean) => Unit,
    ShellFrame: IShellFrame,
    Size: Double,
    TabTitleSize: Double,
    Visible: Boolean
  ): IShellPaneContainer = {
    val __obj = js.Dynamic.literal(AddTab = js.Any.fromFunction3(AddTab), Content = Content.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Focus = js.Any.fromFunction0(Focus), GetSelectedTab = js.Any.fromFunction0(GetSelectedTab), GetTab = js.Any.fromFunction1(GetTab), IsFocused = IsFocused.asInstanceOf[js.Any], Minimized = Minimized.asInstanceOf[js.Any], SetDefaultSize = js.Any.fromFunction2(SetDefaultSize), SetDefaultVisibility = js.Any.fromFunction2(SetDefaultVisibility), ShellFrame = ShellFrame.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TabTitleSize = TabTitleSize.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellPaneContainer]
  }
  @scala.inline
  implicit class IShellPaneContainerOps[Self <: IShellPaneContainer] (val x: Self) extends AnyVal {
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
    def setAddTab(value: (String, String, String) => IShellPaneTab): Self = this.set("AddTab", js.Any.fromFunction3(value))
    @scala.inline
    def setContent(value: js.Any): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvents(value: IShellPaneContainerEvents): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("Focus", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSelectedTab(value: () => IShellPaneTab): Self = this.set("GetSelectedTab", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTab(value: String => IShellPaneTab): Self = this.set("GetTab", js.Any.fromFunction1(value))
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("IsFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimized(value: Boolean): Self = this.set("Minimized", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetDefaultSize(value: (Double, Boolean) => Unit): Self = this.set("SetDefaultSize", js.Any.fromFunction2(value))
    @scala.inline
    def setSetDefaultVisibility(value: (Boolean, Boolean) => Unit): Self = this.set("SetDefaultVisibility", js.Any.fromFunction2(value))
    @scala.inline
    def setShellFrame(value: IShellFrame): Self = this.set("ShellFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabTitleSize(value: Double): Self = this.set("TabTitleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
  
}

