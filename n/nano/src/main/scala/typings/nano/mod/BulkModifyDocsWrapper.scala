package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkModifyDocsWrapper extends StObject {
  
  var docs: js.Array[_] = js.native
}
object BulkModifyDocsWrapper {
  
  @scala.inline
  def apply(docs: js.Array[_]): BulkModifyDocsWrapper = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkModifyDocsWrapper]
  }
  
  @scala.inline
  implicit class BulkModifyDocsWrapperMutableBuilder[Self <: BulkModifyDocsWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocs(value: js.Array[_]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsVarargs(value: js.Any*): Self = StObject.set(x, "docs", js.Array(value :_*))
  }
}
