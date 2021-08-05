package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWindow extends StObject {
  
  def Close(): Unit
  
  val Events: IWindowEvents
  
  def Focus(): Unit
  
  val Handle: Double
  
  var Height: Double
  
  val IsFocused: Boolean
  
  var Maximizable: Boolean
  
  def Maximize(): Unit
  
  var Minimizable: Boolean
  
  def Minimize(): Unit
  
  var Resizable: Boolean
  
  def Restore(): Unit
  
  def SetDefaultSize(defaultWidth: Double, defaultHeight: Double, resizeToDefault: Boolean): Unit
  
  var Title: String
  
  var Width: Double
}
object IWindow {
  
  inline def apply(
    Close: () => Unit,
    Events: IWindowEvents,
    Focus: () => Unit,
    Handle: Double,
    Height: Double,
    IsFocused: Boolean,
    Maximizable: Boolean,
    Maximize: () => Unit,
    Minimizable: Boolean,
    Minimize: () => Unit,
    Resizable: Boolean,
    Restore: () => Unit,
    SetDefaultSize: (Double, Double, Boolean) => Unit,
    Title: String,
    Width: Double
  ): IWindow = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Events = Events.asInstanceOf[js.Any], Focus = js.Any.fromFunction0(Focus), Handle = Handle.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsFocused = IsFocused.asInstanceOf[js.Any], Maximizable = Maximizable.asInstanceOf[js.Any], Maximize = js.Any.fromFunction0(Maximize), Minimizable = Minimizable.asInstanceOf[js.Any], Minimize = js.Any.fromFunction0(Minimize), Resizable = Resizable.asInstanceOf[js.Any], Restore = js.Any.fromFunction0(Restore), SetDefaultSize = js.Any.fromFunction3(SetDefaultSize), Title = Title.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindow]
  }
  
  extension [Self <: IWindow](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
    
    inline def setEvents(value: IWindowEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: () => Unit): Self = StObject.set(x, "Focus", js.Any.fromFunction0(value))
    
    inline def setHandle(value: Double): Self = StObject.set(x, "Handle", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "IsFocused", value.asInstanceOf[js.Any])
    
    inline def setMaximizable(value: Boolean): Self = StObject.set(x, "Maximizable", value.asInstanceOf[js.Any])
    
    inline def setMaximize(value: () => Unit): Self = StObject.set(x, "Maximize", js.Any.fromFunction0(value))
    
    inline def setMinimizable(value: Boolean): Self = StObject.set(x, "Minimizable", value.asInstanceOf[js.Any])
    
    inline def setMinimize(value: () => Unit): Self = StObject.set(x, "Minimize", js.Any.fromFunction0(value))
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "Resizable", value.asInstanceOf[js.Any])
    
    inline def setRestore(value: () => Unit): Self = StObject.set(x, "Restore", js.Any.fromFunction0(value))
    
    inline def setSetDefaultSize(value: (Double, Double, Boolean) => Unit): Self = StObject.set(x, "SetDefaultSize", js.Any.fromFunction3(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
