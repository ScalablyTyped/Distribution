package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStatement extends StObject {
  
  /** An array of filter documents that determines which array elements to modify for an update operation on an array field. */
  var arrayFilters: js.UndefOr[js.Array[Document]] = js.undefined
  
  /** Specifies the collation to use for the operation. */
  var collation: js.UndefOr[CollationOptions] = js.undefined
  
  /** A document or string that specifies the index to use to support the query predicate. */
  var hint: js.UndefOr[Hint] = js.undefined
  
  /** If true, updates all documents that meet the query criteria. */
  var multi: js.UndefOr[Boolean] = js.undefined
  
  /** The query that matches documents to update. */
  var q: Document
  
  /** The modifications to apply. */
  var u: Document | js.Array[Document]
  
  /**  If true, perform an insert if no documents match the query. */
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object UpdateStatement {
  
  inline def apply(q: Document, u: Document | js.Array[Document]): UpdateStatement = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStatement]
  }
  
  extension [Self <: UpdateStatement](x: Self) {
    
    inline def setArrayFilters(value: js.Array[Document]): Self = StObject.set(x, "arrayFilters", value.asInstanceOf[js.Any])
    
    inline def setArrayFiltersUndefined: Self = StObject.set(x, "arrayFilters", js.undefined)
    
    inline def setArrayFiltersVarargs(value: Document*): Self = StObject.set(x, "arrayFilters", js.Array(value*))
    
    inline def setCollation(value: CollationOptions): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setHint(value: Hint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setQ(value: Document): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setU(value: Document | js.Array[Document]): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    
    inline def setUVarargs(value: Document*): Self = StObject.set(x, "u", js.Array(value*))
    
    inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
