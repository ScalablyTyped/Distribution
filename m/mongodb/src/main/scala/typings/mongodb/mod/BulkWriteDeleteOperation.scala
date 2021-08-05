package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteDeleteOperation[TSchema] extends StObject {
  
  var collation: js.UndefOr[js.Object] = js.undefined
  
  var filter: FilterQuery[TSchema]
}
object BulkWriteDeleteOperation {
  
  inline def apply[TSchema](filter: FilterQuery[TSchema]): BulkWriteDeleteOperation[TSchema] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteOperation[TSchema]]
  }
  
  extension [Self <: BulkWriteDeleteOperation[?], TSchema](x: Self & BulkWriteDeleteOperation[TSchema]) {
    
    inline def setCollation(value: js.Object): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setFilter(value: FilterQuery[TSchema]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
