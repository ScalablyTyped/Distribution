package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITaskPane extends StObject {
  
  def AddCustomCommandToGroup(customCommand: Double, group: Double, orderPriority: Double): Unit = js.native
  
  val Available: Boolean = js.native
  
  def CreateGroup(groupName: String, priority: Double): Double = js.native
  
  def DeleteGroup(groupID: Double): Unit = js.native
  
  val Events: ITaskPaneEvents = js.native
  
  def RemoveCustomCommandFromGroup(customCommand: Double, group: Double): Unit = js.native
  
  def SetLogo(filename: String): Unit = js.native
  
  def SetTheme(theme: ITheme): Unit = js.native
  
  var Visible: Boolean = js.native
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
  implicit class ITaskPaneMutableBuilder[Self <: ITaskPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCustomCommandToGroup(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "AddCustomCommandToGroup", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "Available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateGroup(value: (String, Double) => Double): Self = StObject.set(x, "CreateGroup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteGroup(value: Double => Unit): Self = StObject.set(x, "DeleteGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvents(value: ITaskPaneEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveCustomCommandFromGroup(value: (Double, Double) => Unit): Self = StObject.set(x, "RemoveCustomCommandFromGroup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetLogo(value: String => Unit): Self = StObject.set(x, "SetLogo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTheme(value: ITheme => Unit): Self = StObject.set(x, "SetTheme", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
