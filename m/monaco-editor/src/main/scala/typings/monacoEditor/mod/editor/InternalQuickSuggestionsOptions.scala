package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalQuickSuggestionsOptions extends StObject {
  
  val comments: QuickSuggestionsValue
  
  val other: QuickSuggestionsValue
  
  val strings: QuickSuggestionsValue
}
object InternalQuickSuggestionsOptions {
  
  inline def apply(comments: QuickSuggestionsValue, other: QuickSuggestionsValue, strings: QuickSuggestionsValue): InternalQuickSuggestionsOptions = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalQuickSuggestionsOptions]
  }
  
  extension [Self <: InternalQuickSuggestionsOptions](x: Self) {
    
    inline def setComments(value: QuickSuggestionsValue): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setOther(value: QuickSuggestionsValue): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setStrings(value: QuickSuggestionsValue): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
  }
}
