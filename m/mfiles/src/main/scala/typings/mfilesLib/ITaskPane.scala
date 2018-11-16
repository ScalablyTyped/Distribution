package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITaskPane extends js.Object {
  val Available: scala.Boolean
  val Events: ITaskPaneEvents
  var Visible: scala.Boolean
  def AddCustomCommandToGroup(customCommand: scala.Double, group: scala.Double, orderPriority: scala.Double): scala.Unit
  def CreateGroup(groupName: java.lang.String, priority: scala.Double): scala.Double
  def DeleteGroup(groupID: scala.Double): scala.Unit
  def RemoveCustomCommandFromGroup(customCommand: scala.Double, group: scala.Double): scala.Unit
  def SetLogo(filename: java.lang.String): scala.Unit
  def SetTheme(theme: ITheme): scala.Unit
}

