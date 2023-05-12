package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("mongodb", "BulkOperationBase")
@js.native
open class BulkOperationBase () extends StObject {
  
  /* Excluded from this release type: handleWriteError */
  def addToOperationsList(batchType: BatchType, document: Document): this.type = js.native
  def addToOperationsList(batchType: BatchType, document: DeleteStatement): this.type = js.native
  def addToOperationsList(batchType: BatchType, document: UpdateStatement): this.type = js.native
  
  def batches: js.Array[Batch[Document]] = js.native
  
  def bsonOptions: BSONSerializeOptions = js.native
  
  def execute(): js.Promise[BulkWriteResult] = js.native
  def execute(options: BulkWriteOptions): js.Promise[BulkWriteResult] = js.native
  
  /**
    * Builds a find operation for an update/updateOne/delete/deleteOne/replaceOne.
    * Returns a builder object used to complete the definition of the operation.
    *
    * @example
    * ```ts
    * const bulkOp = collection.initializeOrderedBulkOp();
    *
    * // Add an updateOne to the bulkOp
    * bulkOp.find({ a: 1 }).updateOne({ $set: { b: 2 } });
    *
    * // Add an updateMany to the bulkOp
    * bulkOp.find({ c: 3 }).update({ $set: { d: 4 } });
    *
    * // Add an upsert
    * bulkOp.find({ e: 5 }).upsert().updateOne({ $set: { f: 6 } });
    *
    * // Add a deletion
    * bulkOp.find({ g: 7 }).deleteOne();
    *
    * // Add a multi deletion
    * bulkOp.find({ h: 8 }).delete();
    *
    * // Add a replaceOne
    * bulkOp.find({ i: 9 }).replaceOne({writeConcern: { j: 10 }});
    *
    * // Update using a pipeline (requires Mongodb 4.2 or higher)
    * bulk.find({ k: 11, y: { $exists: true }, z: { $exists: true } }).updateOne([
    *   { $set: { total: { $sum: [ '$y', '$z' ] } } }
    * ]);
    *
    * // All of the ops will now be executed
    * await bulkOp.execute();
    * ```
    */
  def find(selector: Document): FindOperators = js.native
  
  /* Excluded from this release type: __constructor */
  /**
    * Add a single insert document to the bulk operation
    *
    * @example
    * ```ts
    * const bulkOp = collection.initializeOrderedBulkOp();
    *
    * // Adds three inserts to the bulkOp.
    * bulkOp
    *   .insert({ a: 1 })
    *   .insert({ b: 2 })
    *   .insert({ c: 3 });
    * await bulkOp.execute();
    * ```
    */
  def insert(document: Document): BulkOperationBase = js.native
  
  var isOrdered: Boolean = js.native
  
  /* Excluded from this release type: s */
  var operationId: js.UndefOr[scala.Double] = js.native
  
  /** Specifies a raw operation to perform in the bulk write. */
  def raw(op: AnyBulkWriteOperation[Document]): this.type = js.native
  
  def writeConcern: js.UndefOr[WriteConcern] = js.native
}
