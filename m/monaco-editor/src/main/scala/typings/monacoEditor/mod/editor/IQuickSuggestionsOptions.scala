package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQuickSuggestionsOptions extends StObject {
  
  var comments: js.UndefOr[Boolean] = js.undefined
  
  var other: js.UndefOr[Boolean] = js.undefined
  
  var strings: js.UndefOr[Boolean] = js.undefined
}
object IQuickSuggestionsOptions {
  
  @scala.inline
  def apply(): IQuickSuggestionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQuickSuggestionsOptions]
  }
  
  @scala.inline
  implicit class IQuickSuggestionsOptionsMutableBuilder[Self <: IQuickSuggestionsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setOther(value: Boolean): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    
    @scala.inline
    def setStrings(value: Boolean): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
  }
}
