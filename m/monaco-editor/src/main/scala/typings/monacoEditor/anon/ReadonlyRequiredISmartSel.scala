package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.ISmartSelectOptions>> */
trait ReadonlyRequiredISmartSel extends StObject {
  
  val selectLeadingAndTrailingWhitespace: Boolean
}
object ReadonlyRequiredISmartSel {
  
  inline def apply(selectLeadingAndTrailingWhitespace: Boolean): ReadonlyRequiredISmartSel = {
    val __obj = js.Dynamic.literal(selectLeadingAndTrailingWhitespace = selectLeadingAndTrailingWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredISmartSel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyRequiredISmartSel] (val x: Self) extends AnyVal {
    
    inline def setSelectLeadingAndTrailingWhitespace(value: Boolean): Self = StObject.set(x, "selectLeadingAndTrailingWhitespace", value.asInstanceOf[js.Any])
  }
}
