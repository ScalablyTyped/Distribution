package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriteDeleteOperation[TSchema] extends StObject {
  
  var collation: js.UndefOr[js.Object] = js.native
  
  var filter: FilterQuery[TSchema] = js.native
}
object BulkWriteDeleteOperation {
  
  @scala.inline
  def apply[TSchema](filter: FilterQuery[TSchema]): BulkWriteDeleteOperation[TSchema] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteOperation[TSchema]]
  }
  
  @scala.inline
  implicit class BulkWriteDeleteOperationMutableBuilder[Self <: BulkWriteDeleteOperation[_], TSchema] (val x: Self with BulkWriteDeleteOperation[TSchema]) extends AnyVal {
    
    @scala.inline
    def setCollation(value: js.Object): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    @scala.inline
    def setFilter(value: FilterQuery[TSchema]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
