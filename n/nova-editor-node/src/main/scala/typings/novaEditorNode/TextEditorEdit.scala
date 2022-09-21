package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/text-editor-edit/
trait TextEditorEdit extends StObject {
  
  def delete(range: Range): Unit
  
  def insert(position: Double, text: String): Unit
  
  def replace(range: Range, text: String): Unit
}
object TextEditorEdit {
  
  inline def apply(delete: Range => Unit, insert: (Double, String) => Unit, replace: (Range, String) => Unit): TextEditorEdit = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction2(insert), replace = js.Any.fromFunction2(replace))
    __obj.asInstanceOf[TextEditorEdit]
  }
  
  extension [Self <: TextEditorEdit](x: Self) {
    
    inline def setDelete(value: Range => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setInsert(value: (Double, String) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setReplace(value: (Range, String) => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
  }
}
