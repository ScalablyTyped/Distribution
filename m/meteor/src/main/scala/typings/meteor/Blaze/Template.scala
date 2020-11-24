package typings.meteor.Blaze

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Template extends js.Object {
  
  @JSName("$")
  var $: js.Any = js.native
  
  def constructView(): View = js.native
  
  var created: js.Function = js.native
  
  var destroyed: js.Function = js.native
  
  def events(eventsMap: EventsMap): Unit = js.native
  
  def find(selector: String): HTMLElement = js.native
  
  def findAll(selector: String): js.Array[HTMLElement] = js.native
  
  var head: Template = js.native
  
  def helpers(helpersMap: HelpersMap): Unit = js.native
  
  def onCreated(cb: js.Function): Unit = js.native
  
  def onDestroyed(cb: js.Function): Unit = js.native
  
  def onRendered(cb: js.Function): Unit = js.native
  
  var renderFunction: js.Function = js.native
  
  var rendered: js.Function = js.native
  
  var viewName: String = js.native
}
object Template {
  
  @scala.inline
  def apply(
    $: js.Any,
    constructView: () => View,
    created: js.Function,
    destroyed: js.Function,
    events: EventsMap => Unit,
    find: String => HTMLElement,
    findAll: String => js.Array[HTMLElement],
    head: Template,
    helpers: HelpersMap => Unit,
    onCreated: js.Function => Unit,
    onDestroyed: js.Function => Unit,
    onRendered: js.Function => Unit,
    renderFunction: js.Function,
    rendered: js.Function,
    viewName: String
  ): Template = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], constructView = js.Any.fromFunction0(constructView), created = created.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], events = js.Any.fromFunction1(events), find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), head = head.asInstanceOf[js.Any], helpers = js.Any.fromFunction1(helpers), onCreated = js.Any.fromFunction1(onCreated), onDestroyed = js.Any.fromFunction1(onDestroyed), onRendered = js.Any.fromFunction1(onRendered), renderFunction = renderFunction.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], viewName = viewName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    
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
    def set$(value: js.Any): Self = this.set("$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructView(value: () => View): Self = this.set("constructView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreated(value: js.Function): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyed(value: js.Function): Self = this.set("destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: EventsMap => Unit): Self = this.set("events", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFind(value: String => HTMLElement): Self = this.set("find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindAll(value: String => js.Array[HTMLElement]): Self = this.set("findAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHead(value: Template): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpers(value: HelpersMap => Unit): Self = this.set("helpers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCreated(value: js.Function => Unit): Self = this.set("onCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDestroyed(value: js.Function => Unit): Self = this.set("onDestroyed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRendered(value: js.Function => Unit): Self = this.set("onRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderFunction(value: js.Function): Self = this.set("renderFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendered(value: js.Function): Self = this.set("rendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewName(value: String): Self = this.set("viewName", value.asInstanceOf[js.Any])
  }
}
