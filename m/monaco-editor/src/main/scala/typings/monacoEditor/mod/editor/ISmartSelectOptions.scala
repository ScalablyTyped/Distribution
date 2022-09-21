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
  
  extension [Self <: ISmartSelectOptions](x: Self) {
    
    inline def setSelectLeadingAndTrailingWhitespace(value: Boolean): Self = StObject.set(x, "selectLeadingAndTrailingWhitespace", value.asInstanceOf[js.Any])
    
    inline def setSelectLeadingAndTrailingWhitespaceUndefined: Self = StObject.set(x, "selectLeadingAndTrailingWhitespace", js.undefined)
  }
}
