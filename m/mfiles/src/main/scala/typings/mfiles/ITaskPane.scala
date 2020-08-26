package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaskPane extends js.Object {
  val Available: Boolean = js.native
  val Events: ITaskPaneEvents = js.native
  var Visible: Boolean = js.native
  def AddCustomCommandToGroup(customCommand: Double, group: Double, orderPriority: Double): Unit = js.native
  def CreateGroup(groupName: String, priority: Double): Double = js.native
  def DeleteGroup(groupID: Double): Unit = js.native
  def RemoveCustomCommandFromGroup(customCommand: Double, group: Double): Unit = js.native
  def SetLogo(filename: String): Unit = js.native
  def SetTheme(theme: ITheme): Unit = js.native
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
  @scala.inline
  implicit class ITaskPaneOps[Self <: ITaskPane] (val x: Self) extends AnyVal {
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
    def setAddCustomCommandToGroup(value: (Double, Double, Double) => Unit): Self = this.set("AddCustomCommandToGroup", js.Any.fromFunction3(value))
    @scala.inline
    def setAvailable(value: Boolean): Self = this.set("Available", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateGroup(value: (String, Double) => Double): Self = this.set("CreateGroup", js.Any.fromFunction2(value))
    @scala.inline
    def setDeleteGroup(value: Double => Unit): Self = this.set("DeleteGroup", js.Any.fromFunction1(value))
    @scala.inline
    def setEvents(value: ITaskPaneEvents): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveCustomCommandFromGroup(value: (Double, Double) => Unit): Self = this.set("RemoveCustomCommandFromGroup", js.Any.fromFunction2(value))
    @scala.inline
    def setSetLogo(value: String => Unit): Self = this.set("SetLogo", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTheme(value: ITheme => Unit): Self = this.set("SetTheme", js.Any.fromFunction1(value))
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
  
}

