package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWindow extends StObject {
  
  def Close(): Unit = js.native
  
  val Events: IWindowEvents = js.native
  
  def Focus(): Unit = js.native
  
  val Handle: Double = js.native
  
  var Height: Double = js.native
  
  val IsFocused: Boolean = js.native
  
  var Maximizable: Boolean = js.native
  
  def Maximize(): Unit = js.native
  
  var Minimizable: Boolean = js.native
  
  def Minimize(): Unit = js.native
  
  var Resizable: Boolean = js.native
  
  def Restore(): Unit = js.native
  
  def SetDefaultSize(defaultWidth: Double, defaultHeight: Double, resizeToDefault: Boolean): Unit = js.native
  
  var Title: String = js.native
  
  var Width: Double = js.native
}
object IWindow {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IWindowMutableBuilder[Self <: IWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEvents(value: IWindowEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: () => Unit): Self = StObject.set(x, "Focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandle(value: Double): Self = StObject.set(x, "Handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "IsFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximizable(value: Boolean): Self = StObject.set(x, "Maximizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximize(value: () => Unit): Self = StObject.set(x, "Maximize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinimizable(value: Boolean): Self = StObject.set(x, "Minimizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimize(value: () => Unit): Self = StObject.set(x, "Minimize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "Resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestore(value: () => Unit): Self = StObject.set(x, "Restore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDefaultSize(value: (Double, Double, Boolean) => Unit): Self = StObject.set(x, "SetDefaultSize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
