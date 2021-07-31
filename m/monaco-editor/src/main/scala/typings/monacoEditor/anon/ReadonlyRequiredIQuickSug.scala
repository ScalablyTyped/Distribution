package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IQuickSuggestionsOptions>> */
trait ReadonlyRequiredIQuickSug extends StObject {
  
  val comments: Boolean
  
  val other: Boolean
  
  val strings: Boolean
}
object ReadonlyRequiredIQuickSug {
  
  @scala.inline
  def apply(comments: Boolean, other: Boolean, strings: Boolean): ReadonlyRequiredIQuickSug = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIQuickSug]
  }
  
  @scala.inline
  implicit class ReadonlyRequiredIQuickSugMutableBuilder[Self <: ReadonlyRequiredIQuickSug] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: Boolean): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrings(value: Boolean): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
  }
}
