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
    AddCustomCommandToGroup: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit],
    Available: scala.Boolean,
    CreateGroup: js.Function2[java.lang.String, scala.Double, scala.Double],
    DeleteGroup: js.Function1[scala.Double, scala.Unit],
    Events: ITaskPaneEvents,
    RemoveCustomCommandFromGroup: js.Function2[scala.Double, scala.Double, scala.Unit],
    SetLogo: js.Function1[java.lang.String, scala.Unit],
    SetTheme: js.Function1[ITheme, scala.Unit],
    Visible: scala.Boolean
  ): ITaskPane = {
    val __obj = js.Dynamic.literal(AddCustomCommandToGroup = AddCustomCommandToGroup, Available = Available, CreateGroup = CreateGroup, DeleteGroup = DeleteGroup, Events = Events, RemoveCustomCommandFromGroup = RemoveCustomCommandFromGroup, SetLogo = SetLogo, SetTheme = SetTheme, Visible = Visible)
  
    __obj.asInstanceOf[ITaskPane]
  }
}

