package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.active
import typings.monacoEditor.monacoEditorStrings.always
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGuidesOptions extends StObject {
  
  /**
    * Enable rendering of bracket pair guides.
    * Defaults to false.
    */
  var bracketPairs: js.UndefOr[Boolean | active] = js.undefined
  
  /**
    * Enable rendering of vertical bracket pair guides.
    * Defaults to 'active'.
    */
  var bracketPairsHorizontal: js.UndefOr[Boolean | active] = js.undefined
  
  /**
    * Enable highlighting of the active bracket pair.
    * Defaults to true.
    */
  var highlightActiveBracketPair: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable highlighting of the active indent guide.
    * Defaults to true.
    */
  var highlightActiveIndentation: js.UndefOr[Boolean | always] = js.undefined
  
  /**
    * Enable rendering of indent guides.
    * Defaults to true.
    */
  var indentation: js.UndefOr[Boolean] = js.undefined
}
object IGuidesOptions {
  
  inline def apply(): IGuidesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGuidesOptions]
  }
  
  extension [Self <: IGuidesOptions](x: Self) {
    
    inline def setBracketPairs(value: Boolean | active): Self = StObject.set(x, "bracketPairs", value.asInstanceOf[js.Any])
    
    inline def setBracketPairsHorizontal(value: Boolean | active): Self = StObject.set(x, "bracketPairsHorizontal", value.asInstanceOf[js.Any])
    
    inline def setBracketPairsHorizontalUndefined: Self = StObject.set(x, "bracketPairsHorizontal", js.undefined)
    
    inline def setBracketPairsUndefined: Self = StObject.set(x, "bracketPairs", js.undefined)
    
    inline def setHighlightActiveBracketPair(value: Boolean): Self = StObject.set(x, "highlightActiveBracketPair", value.asInstanceOf[js.Any])
    
    inline def setHighlightActiveBracketPairUndefined: Self = StObject.set(x, "highlightActiveBracketPair", js.undefined)
    
    inline def setHighlightActiveIndentation(value: Boolean | always): Self = StObject.set(x, "highlightActiveIndentation", value.asInstanceOf[js.Any])
    
    inline def setHighlightActiveIndentationUndefined: Self = StObject.set(x, "highlightActiveIndentation", js.undefined)
    
    inline def setIndentation(value: Boolean): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
    
    inline def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
  }
}
