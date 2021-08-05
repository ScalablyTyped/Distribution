package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkModifyDocsWrapper extends StObject {
  
  var docs: js.Array[js.Any]
}
object BulkModifyDocsWrapper {
  
  inline def apply(docs: js.Array[js.Any]): BulkModifyDocsWrapper = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkModifyDocsWrapper]
  }
  
  extension [Self <: BulkModifyDocsWrapper](x: Self) {
    
    inline def setDocs(value: js.Array[js.Any]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsVarargs(value: js.Any*): Self = StObject.set(x, "docs", js.Array(value :_*))
  }
}
