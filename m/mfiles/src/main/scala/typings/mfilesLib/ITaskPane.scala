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

object ITaskPane {
  @scala.inline
  def apply(
    AddCustomCommandToGroup: (scala.Double, scala.Double, scala.Double) => scala.Unit,
    Available: scala.Boolean,
    CreateGroup: (java.lang.String, scala.Double) => scala.Double,
    DeleteGroup: scala.Double => scala.Unit,
    Events: ITaskPaneEvents,
    RemoveCustomCommandFromGroup: (scala.Double, scala.Double) => scala.Unit,
    SetLogo: java.lang.String => scala.Unit,
    SetTheme: ITheme => scala.Unit,
    Visible: scala.Boolean
  ): ITaskPane = {
    val __obj = js.Dynamic.literal(AddCustomCommandToGroup = js.Any.fromFunction3(AddCustomCommandToGroup), Available = Available, CreateGroup = js.Any.fromFunction2(CreateGroup), DeleteGroup = js.Any.fromFunction1(DeleteGroup), Events = Events, RemoveCustomCommandFromGroup = js.Any.fromFunction2(RemoveCustomCommandFromGroup), SetLogo = js.Any.fromFunction1(SetLogo), SetTheme = js.Any.fromFunction1(SetTheme), Visible = Visible)
  
    __obj.asInstanceOf[ITaskPane]
  }
}

