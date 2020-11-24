package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.EnableOnEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sidebar extends js.Object {
  
  def addTab(options: EnableOnEdit): Unit = js.native
  
  var config: SidebarConfig = js.native
  
  def containsTab(id: String): Boolean = js.native
  
  var context: SidebarContext = js.native
  
  var help: SidebarHelp = js.native
  
  var info: SidebarInfo = js.native
  
  def init(): Unit = js.native
  
  def removeTab(id: String): Unit = js.native
  
  def show(id: String): Unit = js.native
  
  def toggleSidebar(state: Boolean): Unit = js.native
  
  var versionControl: SidebarVersionControl = js.native
}
object Sidebar {
  
  @scala.inline
  def apply(
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
  implicit class SidebarOps[Self <: Sidebar] (val x: Self) extends AnyVal {
    
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
    def setAddTab(value: EnableOnEdit => Unit): Self = this.set("addTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConfig(value: SidebarConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsTab(value: String => Boolean): Self = this.set("containsTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: SidebarContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp(value: SidebarHelp): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: SidebarInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveTab(value: String => Unit): Self = this.set("removeTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: String => Unit): Self = this.set("show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleSidebar(value: Boolean => Unit): Self = this.set("toggleSidebar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVersionControl(value: SidebarVersionControl): Self = this.set("versionControl", value.asInstanceOf[js.Any])
  }
}
