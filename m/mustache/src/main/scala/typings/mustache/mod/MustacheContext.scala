package typings.mustache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
  */
@js.native
trait MustacheContext extends js.Object {
  
  /**
    * Returns the value of the given name in this context, traversing up the context hierarchy if the value is absent in this context's view.
    *
    * @param name
    * The name to look up.
    */
  def lookup(name: String): js.Any = js.native
  
  var parentContext: js.UndefOr[MustacheContext] = js.native
  
  /**
    * Creates a new context using the given view with this context as the parent.
    *
    * @param view
    * The view to create the new context with.
    */
  def push(view: js.Any): MustacheContext = js.native
  
  var view: js.Any = js.native
}
object MustacheContext {
  
  @scala.inline
  def apply(lookup: String => js.Any, push: js.Any => MustacheContext, view: js.Any): MustacheContext = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), push = js.Any.fromFunction1(push), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[MustacheContext]
  }
  
  @scala.inline
  implicit class MustacheContextOps[Self <: MustacheContext] (val x: Self) extends AnyVal {
    
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
    def setLookup(value: String => js.Any): Self = this.set("lookup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPush(value: js.Any => MustacheContext): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setView(value: js.Any): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentContext(value: MustacheContext): Self = this.set("parentContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentContext: Self = this.set("parentContext", js.undefined)
  }
}
