package typings.monacoEditor.mod.languages.css

import typings.monacoEditor.monacoEditorStrings.collapse
import typings.monacoEditor.monacoEditorStrings.expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSFormatConfiguration extends StObject {
  
  /** put braces on the same line as rules (`collapse`), or put braces on own line, Allman / ANSI style (`expand`). Default `collapse` */
  var braceStyle: js.UndefOr[collapse | expand] = js.undefined
  
  /** maximum number of line breaks to be preserved in one chunk. Default: unlimited */
  var maxPreserveNewLines: js.UndefOr[Double] = js.undefined
  
  /** add a new line after every css rule: Default: true */
  var newlineBetweenRules: js.UndefOr[Boolean] = js.undefined
  
  /** separate selectors with newline (e.g. "a,\nbr" or "a, br"): Default: true */
  var newlineBetweenSelectors: js.UndefOr[Boolean] = js.undefined
  
  /** whether existing line breaks before elements should be preserved. Default: true */
  var preserveNewLines: js.UndefOr[Boolean] = js.undefined
  
  /** ensure space around selector separators:  '>', '+', '~' (e.g. "a>b" -> "a > b"): Default: false */
  var spaceAroundSelectorSeparator: js.UndefOr[Boolean] = js.undefined
}
object CSSFormatConfiguration {
  
  inline def apply(): CSSFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSFormatConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSFormatConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBraceStyle(value: collapse | expand): Self = StObject.set(x, "braceStyle", value.asInstanceOf[js.Any])
    
    inline def setBraceStyleUndefined: Self = StObject.set(x, "braceStyle", js.undefined)
    
    inline def setMaxPreserveNewLines(value: Double): Self = StObject.set(x, "maxPreserveNewLines", value.asInstanceOf[js.Any])
    
    inline def setMaxPreserveNewLinesUndefined: Self = StObject.set(x, "maxPreserveNewLines", js.undefined)
    
    inline def setNewlineBetweenRules(value: Boolean): Self = StObject.set(x, "newlineBetweenRules", value.asInstanceOf[js.Any])
    
    inline def setNewlineBetweenRulesUndefined: Self = StObject.set(x, "newlineBetweenRules", js.undefined)
    
    inline def setNewlineBetweenSelectors(value: Boolean): Self = StObject.set(x, "newlineBetweenSelectors", value.asInstanceOf[js.Any])
    
    inline def setNewlineBetweenSelectorsUndefined: Self = StObject.set(x, "newlineBetweenSelectors", js.undefined)
    
    inline def setPreserveNewLines(value: Boolean): Self = StObject.set(x, "preserveNewLines", value.asInstanceOf[js.Any])
    
    inline def setPreserveNewLinesUndefined: Self = StObject.set(x, "preserveNewLines", js.undefined)
    
    inline def setSpaceAroundSelectorSeparator(value: Boolean): Self = StObject.set(x, "spaceAroundSelectorSeparator", value.asInstanceOf[js.Any])
    
    inline def setSpaceAroundSelectorSeparatorUndefined: Self = StObject.set(x, "spaceAroundSelectorSeparator", js.undefined)
  }
}
