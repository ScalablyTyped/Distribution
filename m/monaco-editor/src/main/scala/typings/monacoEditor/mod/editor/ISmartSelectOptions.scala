package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISmartSelectOptions extends StObject {
  
  var selectLeadingAndTrailingWhitespace: js.UndefOr[Boolean] = js.undefined
}
object ISmartSelectOptions {
  
  inline def apply(): ISmartSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISmartSelectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISmartSelectOptions] (val x: Self) extends AnyVal {
    
    inline def setSelectLeadingAndTrailingWhitespace(value: Boolean): Self = StObject.set(x, "selectLeadingAndTrailingWhitespace", value.asInstanceOf[js.Any])
    
    inline def setSelectLeadingAndTrailingWhitespaceUndefined: Self = StObject.set(x, "selectLeadingAndTrailingWhitespace", js.undefined)
  }
}
