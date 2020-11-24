package typings.pell.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait pellConfig[T /* <: HTMLElement */] extends js.Object {
  
  var actions: js.Array[pellAction] = js.native
  
  var classes: js.UndefOr[pellClasses] = js.native
  
  var defaultParagraphSeparator: js.UndefOr[String] = js.native
  
  var element: T = js.native
  
  def onChange(html: String): Unit = js.native
  
  var styleWithCSS: js.UndefOr[Boolean] = js.native
}
object pellConfig {
  
  @scala.inline
  def apply[T /* <: HTMLElement */](actions: js.Array[pellAction], element: T, onChange: String => Unit): pellConfig[T] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[pellConfig[T]]
  }
  
  @scala.inline
  implicit class pellConfigOps[Self <: pellConfig[_], T /* <: HTMLElement */] (val x: Self with pellConfig[T]) extends AnyVal {
    
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
    def setActionsVarargs(value: pellAction*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[pellAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: T): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClasses(value: pellClasses): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setDefaultParagraphSeparator(value: String): Self = this.set("defaultParagraphSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultParagraphSeparator: Self = this.set("defaultParagraphSeparator", js.undefined)
    
    @scala.inline
    def setStyleWithCSS(value: Boolean): Self = this.set("styleWithCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleWithCSS: Self = this.set("styleWithCSS", js.undefined)
  }
}
