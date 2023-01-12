package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellPaneContainer extends StObject {
  
  def AddTab(TabId: String, tabTitle: String, insertBeforeTabId: String): IShellPaneTab
  
  val Content: Any
  
  val Events: IShellPaneContainerEvents
  
  def Focus(): Unit
  
  def GetSelectedTab(): IShellPaneTab
  
  def GetTab(TabId: String): IShellPaneTab
  
  val IsFocused: Boolean
  
  var Minimized: Boolean
  
  def SetDefaultSize(defaultSize: Double, resizeToDefault: Boolean): Unit
  
  def SetDefaultVisibility(Visible: Boolean, resetToDefault: Boolean): Unit
  
  val ShellFrame: IShellFrame
  
  var Size: Double
  
  val TabTitleSize: Double
  
  var Visible: Boolean
}
object IShellPaneContainer {
  
  inline def apply(
    AddTab: (String, String, String) => IShellPaneTab,
    Content: Any,
    Events: IShellPaneContainerEvents,
    Focus: () => Unit,
    GetSelectedTab: () => IShellPaneTab,
    GetTab: String => IShellPaneTab,
    IsFocused: Boolean,
    Minimized: Boolean,
    SetDefaultSize: (Double, Boolean) => Unit,
    SetDefaultVisibility: (Boolean, Boolean) => Unit,
    ShellFrame: IShellFrame,
    Size: Double,
    TabTitleSize: Double,
    Visible: Boolean
  ): IShellPaneContainer = {
    val __obj = js.Dynamic.literal(AddTab = js.Any.fromFunction3(AddTab), Content = Content.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Focus = js.Any.fromFunction0(Focus), GetSelectedTab = js.Any.fromFunction0(GetSelectedTab), GetTab = js.Any.fromFunction1(GetTab), IsFocused = IsFocused.asInstanceOf[js.Any], Minimized = Minimized.asInstanceOf[js.Any], SetDefaultSize = js.Any.fromFunction2(SetDefaultSize), SetDefaultVisibility = js.Any.fromFunction2(SetDefaultVisibility), ShellFrame = ShellFrame.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TabTitleSize = TabTitleSize.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellPaneContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IShellPaneContainer] (val x: Self) extends AnyVal {
    
    inline def setAddTab(value: (String, String, String) => IShellPaneTab): Self = StObject.set(x, "AddTab", js.Any.fromFunction3(value))
    
    inline def setContent(value: Any): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: IShellPaneContainerEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: () => Unit): Self = StObject.set(x, "Focus", js.Any.fromFunction0(value))
    
    inline def setGetSelectedTab(value: () => IShellPaneTab): Self = StObject.set(x, "GetSelectedTab", js.Any.fromFunction0(value))
    
    inline def setGetTab(value: String => IShellPaneTab): Self = StObject.set(x, "GetTab", js.Any.fromFunction1(value))
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "IsFocused", value.asInstanceOf[js.Any])
    
    inline def setMinimized(value: Boolean): Self = StObject.set(x, "Minimized", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultSize(value: (Double, Boolean) => Unit): Self = StObject.set(x, "SetDefaultSize", js.Any.fromFunction2(value))
    
    inline def setSetDefaultVisibility(value: (Boolean, Boolean) => Unit): Self = StObject.set(x, "SetDefaultVisibility", js.Any.fromFunction2(value))
    
    inline def setShellFrame(value: IShellFrame): Self = StObject.set(x, "ShellFrame", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setTabTitleSize(value: Double): Self = StObject.set(x, "TabTitleSize", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
