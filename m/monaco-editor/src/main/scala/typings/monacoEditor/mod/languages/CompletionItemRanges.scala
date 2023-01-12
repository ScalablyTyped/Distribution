package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionItemRanges extends StObject {
  
  var insert: IRange
  
  var replace: IRange
}
object CompletionItemRanges {
  
  inline def apply(insert: IRange, replace: IRange): CompletionItemRanges = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItemRanges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompletionItemRanges] (val x: Self) extends AnyVal {
    
    inline def setInsert(value: IRange): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: IRange): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
  }
}
