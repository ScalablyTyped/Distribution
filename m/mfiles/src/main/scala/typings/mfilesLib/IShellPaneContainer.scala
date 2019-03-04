package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellPaneContainer extends js.Object {
  val Content: js.Any
  val Events: IShellPaneContainerEvents
  val IsFocused: scala.Boolean
  var Minimized: scala.Boolean
  val ShellFrame: IShellFrame
  var Size: scala.Double
  val TabTitleSize: scala.Double
  var Visible: scala.Boolean
  def AddTab(TabId: java.lang.String, tabTitle: java.lang.String, insertBeforeTabId: java.lang.String): IShellPaneTab
  def Focus(): scala.Unit
  def GetSelectedTab(): IShellPaneTab
  def GetTab(TabId: java.lang.String): IShellPaneTab
  def SetDefaultSize(defaultSize: scala.Double, resizeToDefault: scala.Boolean): scala.Unit
  def SetDefaultVisibility(Visible: scala.Boolean, resetToDefault: scala.Boolean): scala.Unit
}

object IShellPaneContainer {
  @scala.inline
  def apply(
    AddTab: js.Function3[java.lang.String, java.lang.String, java.lang.String, IShellPaneTab],
    Content: js.Any,
    Events: IShellPaneContainerEvents,
    Focus: js.Function0[scala.Unit],
    GetSelectedTab: js.Function0[IShellPaneTab],
    GetTab: js.Function1[java.lang.String, IShellPaneTab],
    IsFocused: scala.Boolean,
    Minimized: scala.Boolean,
    SetDefaultSize: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    SetDefaultVisibility: js.Function2[scala.Boolean, scala.Boolean, scala.Unit],
    ShellFrame: IShellFrame,
    Size: scala.Double,
    TabTitleSize: scala.Double,
    Visible: scala.Boolean
  ): IShellPaneContainer = {
    val __obj = js.Dynamic.literal(AddTab = AddTab, Content = Content, Events = Events, Focus = Focus, GetSelectedTab = GetSelectedTab, GetTab = GetTab, IsFocused = IsFocused, Minimized = Minimized, SetDefaultSize = SetDefaultSize, SetDefaultVisibility = SetDefaultVisibility, ShellFrame = ShellFrame, Size = Size, TabTitleSize = TabTitleSize, Visible = Visible)
  
    __obj.asInstanceOf[IShellPaneContainer]
  }
}

