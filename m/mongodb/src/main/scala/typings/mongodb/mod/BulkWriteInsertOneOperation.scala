package typings.mongodb.mod

import typings.mongodb.anon.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriteInsertOneOperation[TSchema] extends BulkWriteOperation[TSchema] {
  
  var insertOne: Document[TSchema] = js.native
}
object BulkWriteInsertOneOperation {
  
  @scala.inline
  def apply[TSchema](insertOne: Document[TSchema]): BulkWriteInsertOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(insertOne = insertOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteInsertOneOperation[TSchema]]
  }
  
  @scala.inline
  implicit class BulkWriteInsertOneOperationMutableBuilder[Self <: BulkWriteInsertOneOperation[_], TSchema] (val x: Self with BulkWriteInsertOneOperation[TSchema]) extends AnyVal {
    
    @scala.inline
    def setInsertOne(value: Document[TSchema]): Self = StObject.set(x, "insertOne", value.asInstanceOf[js.Any])
  }
}
