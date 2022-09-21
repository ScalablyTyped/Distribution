package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQuickSuggestionsOptions extends StObject {
  
  var comments: js.UndefOr[Boolean | QuickSuggestionsValue] = js.undefined
  
  var other: js.UndefOr[Boolean | QuickSuggestionsValue] = js.undefined
  
  var strings: js.UndefOr[Boolean | QuickSuggestionsValue] = js.undefined
}
object IQuickSuggestionsOptions {
  
  inline def apply(): IQuickSuggestionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQuickSuggestionsOptions]
  }
  
  extension [Self <: IQuickSuggestionsOptions](x: Self) {
    
    inline def setComments(value: Boolean | QuickSuggestionsValue): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setOther(value: Boolean | QuickSuggestionsValue): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    
    inline def setStrings(value: Boolean | QuickSuggestionsValue): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
  }
}
