package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkModifyDocsWrapper extends StObject {
  
  var docs: js.Array[Any]
}
object BulkModifyDocsWrapper {
  
  inline def apply(docs: js.Array[Any]): BulkModifyDocsWrapper = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkModifyDocsWrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkModifyDocsWrapper] (val x: Self) extends AnyVal {
    
    inline def setDocs(value: js.Array[Any]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsVarargs(value: Any*): Self = StObject.set(x, "docs", js.Array(value*))
  }
}
