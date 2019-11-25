package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellPaneContainer extends js.Object {
  val Content: js.Any
  val Events: IShellPaneContainerEvents
  val IsFocused: Boolean
  var Minimized: Boolean
  val ShellFrame: IShellFrame
  var Size: Double
  val TabTitleSize: Double
  var Visible: Boolean
  def AddTab(TabId: String, tabTitle: String, insertBeforeTabId: String): IShellPaneTab
  def Focus(): Unit
  def GetSelectedTab(): IShellPaneTab
  def GetTab(TabId: String): IShellPaneTab
  def SetDefaultSize(defaultSize: Double, resizeToDefault: Boolean): Unit
  def SetDefaultVisibility(Visible: Boolean, resetToDefault: Boolean): Unit
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
}

