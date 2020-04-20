package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITaskPane extends js.Object {
  val Available: Boolean
  val Events: ITaskPaneEvents
  var Visible: Boolean
  def AddCustomCommandToGroup(customCommand: Double, group: Double, orderPriority: Double): Unit
  def CreateGroup(groupName: String, priority: Double): Double
  def DeleteGroup(groupID: Double): Unit
  def RemoveCustomCommandFromGroup(customCommand: Double, group: Double): Unit
  def SetLogo(filename: String): Unit
  def SetTheme(theme: ITheme): Unit
}

object ITaskPane {
  @scala.inline
  def apply(
    AddCustomCommandToGroup: (Double, Double, Double) => Unit,
    Available: Boolean,
    CreateGroup: (String, Double) => Double,
    DeleteGroup: Double => Unit,
    Events: ITaskPaneEvents,
    RemoveCustomCommandFromGroup: (Double, Double) => Unit,
    SetLogo: String => Unit,
    SetTheme: ITheme => Unit,
    Visible: Boolean
  ): ITaskPane = {
    val __obj = js.Dynamic.literal(AddCustomCommandToGroup = js.Any.fromFunction3(AddCustomCommandToGroup), Available = Available.asInstanceOf[js.Any], CreateGroup = js.Any.fromFunction2(CreateGroup), DeleteGroup = js.Any.fromFunction1(DeleteGroup), Events = Events.asInstanceOf[js.Any], RemoveCustomCommandFromGroup = js.Any.fromFunction2(RemoveCustomCommandFromGroup), SetLogo = js.Any.fromFunction1(SetLogo), SetTheme = js.Any.fromFunction1(SetTheme), Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskPane]
  }
}

