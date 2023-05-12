package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattingOptions extends StObject {
  
  /**
    * Prefer spaces over tabs.
    */
  var insertSpaces: Boolean
  
  /**
    * The list of multiple ranges to format at once, if the provider supports it.
    */
  var ranges: js.UndefOr[js.Array[Range]] = js.undefined
  
  /**
    * Size of a tab in spaces.
    */
  var tabSize: Double
}
object FormattingOptions {
  
  inline def apply(insertSpaces: Boolean, tabSize: Double): FormattingOptions = {
    val __obj = js.Dynamic.literal(insertSpaces = insertSpaces.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormattingOptions] (val x: Self) extends AnyVal {
    
    inline def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
    
    inline def setRanges(value: js.Array[Range]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: Range*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
  }
}
