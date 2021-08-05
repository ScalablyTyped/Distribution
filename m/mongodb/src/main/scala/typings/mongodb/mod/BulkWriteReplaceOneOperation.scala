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
  
  inline def apply[TSchema](replaceOne: Collation[TSchema]): BulkWriteReplaceOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(replaceOne = replaceOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteReplaceOneOperation[TSchema]]
  }
  
  extension [Self <: BulkWriteReplaceOneOperation[?], TSchema](x: Self & BulkWriteReplaceOneOperation[TSchema]) {
    
    inline def setReplaceOne(value: Collation[TSchema]): Self = StObject.set(x, "replaceOne", value.asInstanceOf[js.Any])
  }
}
