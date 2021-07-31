package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchPane extends StObject {
  
  val Available: Boolean
  
  val Events: ISearchPaneEvents
  
  def SetTheme(theme: ITheme): Unit
  
  var Visible: Boolean
}
object ISearchPane {
  
  @scala.inline
  def apply(Available: Boolean, Events: ISearchPaneEvents, SetTheme: ITheme => Unit, Visible: Boolean): ISearchPane = {
    val __obj = js.Dynamic.literal(Available = Available.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], SetTheme = js.Any.fromFunction1(SetTheme), Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPane]
  }
  
  @scala.inline
  implicit class ISearchPaneMutableBuilder[Self <: ISearchPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "Available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: ISearchPaneEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetTheme(value: ITheme => Unit): Self = StObject.set(x, "SetTheme", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
