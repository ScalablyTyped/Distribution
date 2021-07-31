package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/text-edit/
trait TextEdit extends StObject {
  
  val newText: String
  
  val range: Range
}
object TextEdit {
  
  @scala.inline
  def apply(newText: String, range: Range): TextEdit = {
    val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEdit]
  }
  
  @scala.inline
  implicit class TextEditMutableBuilder[Self <: TextEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
