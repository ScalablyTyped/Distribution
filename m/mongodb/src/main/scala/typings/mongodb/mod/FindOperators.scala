package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "FindOperators")
@js.native
open class FindOperators () extends StObject {
  
  /** Specifies arrayFilters for UpdateOne or UpdateMany bulk operations. */
  def arrayFilters(arrayFilters: js.Array[Document]): this.type = js.native
  
  var bulkOperation: BulkOperationBase = js.native
  
  /** Specifies the collation for the query condition. */
  def collation(collation: CollationOptions): this.type = js.native
  
  /** Add a delete many operation to the bulk operation */
  def delete(): BulkOperationBase = js.native
  
  /** Add a delete one operation to the bulk operation */
  def deleteOne(): BulkOperationBase = js.native
  
  /** Specifies hint for the bulk operation. */
  def hint(hint: Hint): this.type = js.native
  
  /** Add a replace one operation to the bulk operation */
  def replaceOne(replacement: Document): BulkOperationBase = js.native
  
  def update(updateDocument: js.Array[Document]): BulkOperationBase = js.native
  /* Excluded from this release type: __constructor */
  /** Add a multiple update operation to the bulk operation */
  def update(updateDocument: Document): BulkOperationBase = js.native
  
  def updateOne(updateDocument: js.Array[Document]): BulkOperationBase = js.native
  /** Add a single update operation to the bulk operation */
  def updateOne(updateDocument: Document): BulkOperationBase = js.native
  
  /** Upsert modifier for update bulk operation, noting that this operation is an upsert. */
  def upsert(): this.type = js.native
}
