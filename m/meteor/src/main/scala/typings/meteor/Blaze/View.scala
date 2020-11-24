package typings.meteor.Blaze

import typings.meteor.Tracker.Computation
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View extends js.Object {
  
  def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
  
  def firstNode(): Node = js.native
  
  var isCreated: Boolean = js.native
  
  var isDestroyed: Boolean = js.native
  
  var isRendered: Boolean = js.native
  
  def lastNode(): Node = js.native
  
  var name: String = js.native
  
  def onViewCreated(func: js.Function): Unit = js.native
  
  def onViewDestroyed(func: js.Function): Unit = js.native
  
  def onViewReady(func: js.Function): Unit = js.native
  
  var parentView: View = js.native
  
  var renderCount: Double = js.native
  
  var template: Template = js.native
  
  def templateInstance(): TemplateInstance = js.native
}
object View {
  
  @scala.inline
  def apply(
    autorun: js.Function1[/* computation */ Computation, Unit] => Computation,
    firstNode: () => Node,
    isCreated: Boolean,
    isDestroyed: Boolean,
    isRendered: Boolean,
    lastNode: () => Node,
    name: String,
    onViewCreated: js.Function => Unit,
    onViewDestroyed: js.Function => Unit,
    onViewReady: js.Function => Unit,
    parentView: View,
    renderCount: Double,
    template: Template,
    templateInstance: () => TemplateInstance
  ): View = {
    val __obj = js.Dynamic.literal(autorun = js.Any.fromFunction1(autorun), firstNode = js.Any.fromFunction0(firstNode), isCreated = isCreated.asInstanceOf[js.Any], isDestroyed = isDestroyed.asInstanceOf[js.Any], isRendered = isRendered.asInstanceOf[js.Any], lastNode = js.Any.fromFunction0(lastNode), name = name.asInstanceOf[js.Any], onViewCreated = js.Any.fromFunction1(onViewCreated), onViewDestroyed = js.Any.fromFunction1(onViewDestroyed), onViewReady = js.Any.fromFunction1(onViewReady), parentView = parentView.asInstanceOf[js.Any], renderCount = renderCount.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateInstance = js.Any.fromFunction0(templateInstance))
    __obj.asInstanceOf[View]
  }
  
  @scala.inline
  implicit class ViewOps[Self <: View] (val x: Self) extends AnyVal {
    
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
    def setAutorun(value: js.Function1[/* computation */ Computation, Unit] => Computation): Self = this.set("autorun", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirstNode(value: () => Node): Self = this.set("firstNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCreated(value: Boolean): Self = this.set("isCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDestroyed(value: Boolean): Self = this.set("isDestroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRendered(value: Boolean): Self = this.set("isRendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNode(value: () => Node): Self = this.set("lastNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnViewCreated(value: js.Function => Unit): Self = this.set("onViewCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewDestroyed(value: js.Function => Unit): Self = this.set("onViewDestroyed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewReady(value: js.Function => Unit): Self = this.set("onViewReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParentView(value: View): Self = this.set("parentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderCount(value: Double): Self = this.set("renderCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: Template): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateInstance(value: () => TemplateInstance): Self = this.set("templateInstance", js.Any.fromFunction0(value))
  }
}
