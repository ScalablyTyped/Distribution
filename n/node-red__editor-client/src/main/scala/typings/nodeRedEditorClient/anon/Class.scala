package typings.nodeRedEditorClient.anon

import typings.jquery.JQuery.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Class extends StObject {
  
  var `class`: js.UndefOr[String] = js.native
  
  def click(event: Event): Unit = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var text: String = js.native
}
object Class {
  
  @scala.inline
  def apply(click: Event => Unit, text: String): Class = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  
  @scala.inline
  implicit class ClassMutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setClick(value: Event => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
