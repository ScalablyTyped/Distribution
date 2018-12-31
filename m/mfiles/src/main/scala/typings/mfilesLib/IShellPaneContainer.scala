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

