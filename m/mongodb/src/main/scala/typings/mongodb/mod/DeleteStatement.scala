package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStatement extends StObject {
  
  /** Specifies the collation to use for the operation. */
  var collation: js.UndefOr[CollationOptions] = js.undefined
  
  /** A document or string that specifies the index to use to support the query predicate. */
  var hint: js.UndefOr[Hint] = js.undefined
  
  /** The number of matching documents to delete. */
  var limit: scala.Double
  
  /** The query that matches documents to delete. */
  var q: Document
}
object DeleteStatement {
  
  inline def apply(limit: scala.Double, q: Document): DeleteStatement = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteStatement] (val x: Self) extends AnyVal {
    
    inline def setCollation(value: CollationOptions): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setHint(value: Hint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setQ(value: Document): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
  }
}
