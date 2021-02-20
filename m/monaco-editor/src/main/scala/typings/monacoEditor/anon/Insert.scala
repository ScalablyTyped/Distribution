package typings.monacoEditor.anon

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Insert extends StObject {
  
  var insert: IRange = js.native
  
  var replace: IRange = js.native
}
object Insert {
  
  @scala.inline
  def apply(insert: IRange, replace: IRange): Insert = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insert]
  }
  
  @scala.inline
  implicit class InsertMutableBuilder[Self <: Insert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsert(value: IRange): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: IRange): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
  }
}
