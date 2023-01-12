package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorCommentsOptions>> */
trait ReadonlyRequiredIEditorCo extends StObject {
  
  val ignoreEmptyLines: Boolean
  
  val insertSpace: Boolean
}
object ReadonlyRequiredIEditorCo {
  
  inline def apply(ignoreEmptyLines: Boolean, insertSpace: Boolean): ReadonlyRequiredIEditorCo = {
    val __obj = js.Dynamic.literal(ignoreEmptyLines = ignoreEmptyLines.asInstanceOf[js.Any], insertSpace = insertSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIEditorCo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyRequiredIEditorCo] (val x: Self) extends AnyVal {
    
    inline def setIgnoreEmptyLines(value: Boolean): Self = StObject.set(x, "ignoreEmptyLines", value.asInstanceOf[js.Any])
    
    inline def setInsertSpace(value: Boolean): Self = StObject.set(x, "insertSpace", value.asInstanceOf[js.Any])
  }
}
