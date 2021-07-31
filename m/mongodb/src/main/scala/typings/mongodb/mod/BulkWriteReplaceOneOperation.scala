package typings.mongodb.mod

import typings.mongodb.anon.Collation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteReplaceOneOperation[TSchema]
  extends StObject
     with BulkWriteOperation[TSchema] {
  
  var replaceOne: Collation[TSchema]
}
object BulkWriteReplaceOneOperation {
  
  @scala.inline
  def apply[TSchema](replaceOne: Collation[TSchema]): BulkWriteReplaceOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(replaceOne = replaceOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteReplaceOneOperation[TSchema]]
  }
  
  @scala.inline
  implicit class BulkWriteReplaceOneOperationMutableBuilder[Self <: BulkWriteReplaceOneOperation[?], TSchema] (val x: Self & BulkWriteReplaceOneOperation[TSchema]) extends AnyVal {
    
    @scala.inline
    def setReplaceOne(value: Collation[TSchema]): Self = StObject.set(x, "replaceOne", value.asInstanceOf[js.Any])
  }
}
