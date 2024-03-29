package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.EnableOnEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sidebar extends StObject {
  
  def addTab(options: EnableOnEdit): Unit
  
  var config: SidebarConfig
  
  def containsTab(id: String): Boolean
  
  var context: SidebarContext
  
  var help: SidebarHelp
  
  var info: SidebarInfo
  
  def init(): Unit
  
  def removeTab(id: String): Unit
  
  def show(id: String): Unit
  
  def toggleSidebar(state: Boolean): Unit
  
  var versionControl: SidebarVersionControl
}
object Sidebar {
  
  inline def apply(
    addTab: EnableOnEdit => Unit,
    config: SidebarConfig,
    containsTab: String => Boolean,
    context: SidebarContext,
    help: SidebarHelp,
    info: SidebarInfo,
    init: () => Unit,
    removeTab: String => Unit,
    show: String => Unit,
    toggleSidebar: Boolean => Unit,
    versionControl: SidebarVersionControl
  ): Sidebar = {
    val __obj = js.Dynamic.literal(addTab = js.Any.fromFunction1(addTab), config = config.asInstanceOf[js.Any], containsTab = js.Any.fromFunction1(containsTab), context = context.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), removeTab = js.Any.fromFunction1(removeTab), show = js.Any.fromFunction1(show), toggleSidebar = js.Any.fromFunction1(toggleSidebar), versionControl = versionControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sidebar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sidebar] (val x: Self) extends AnyVal {
    
    inline def setAddTab(value: EnableOnEdit => Unit): Self = StObject.set(x, "addTab", js.Any.fromFunction1(value))
    
    inline def setConfig(value: SidebarConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setContainsTab(value: String => Boolean): Self = StObject.set(x, "containsTab", js.Any.fromFunction1(value))
    
    inline def setContext(value: SidebarContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setHelp(value: SidebarHelp): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: SidebarInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setRemoveTab(value: String => Unit): Self = StObject.set(x, "removeTab", js.Any.fromFunction1(value))
    
    inline def setShow(value: String => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    inline def setToggleSidebar(value: Boolean => Unit): Self = StObject.set(x, "toggleSidebar", js.Any.fromFunction1(value))
    
    inline def setVersionControl(value: SidebarVersionControl): Self = StObject.set(x, "versionControl", value.asInstanceOf[js.Any])
  }
}
