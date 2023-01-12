package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITaskPane extends StObject {
  
  def AddCustomCommandToGroup(customCommand: Double, group: Double, orderPriority: Double): Unit
  
  val Available: Boolean
  
  def CreateGroup(groupName: String, priority: Double): Double
  
  def DeleteGroup(groupID: Double): Unit
  
  val Events: ITaskPaneEvents
  
  def RemoveCustomCommandFromGroup(customCommand: Double, group: Double): Unit
  
  def SetLogo(filename: String): Unit
  
  def SetTheme(theme: ITheme): Unit
  
  var Visible: Boolean
}
object ITaskPane {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ITaskPane] (val x: Self) extends AnyVal {
    
    inline def setAddCustomCommandToGroup(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "AddCustomCommandToGroup", js.Any.fromFunction3(value))
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "Available", value.asInstanceOf[js.Any])
    
    inline def setCreateGroup(value: (String, Double) => Double): Self = StObject.set(x, "CreateGroup", js.Any.fromFunction2(value))
    
    inline def setDeleteGroup(value: Double => Unit): Self = StObject.set(x, "DeleteGroup", js.Any.fromFunction1(value))
    
    inline def setEvents(value: ITaskPaneEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomCommandFromGroup(value: (Double, Double) => Unit): Self = StObject.set(x, "RemoveCustomCommandFromGroup", js.Any.fromFunction2(value))
    
    inline def setSetLogo(value: String => Unit): Self = StObject.set(x, "SetLogo", js.Any.fromFunction1(value))
    
    inline def setSetTheme(value: ITheme => Unit): Self = StObject.set(x, "SetTheme", js.Any.fromFunction1(value))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
