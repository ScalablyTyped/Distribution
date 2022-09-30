package typings.mongodb.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "MongoBulkWriteError")
@js.native
open class MongoBulkWriteError protected () extends MongoServerError {
  /** Creates a new MongoBulkWriteError */
  def this(error: typings.mongodb.anon.Code, result: BulkWriteResult) = this()
  def this(error: AnyError, result: BulkWriteResult) = this()
  def this(error: WriteConcernError, result: BulkWriteResult) = this()
  
  /** Number of documents deleted. */
  def deletedCount: scala.Double = js.native
  
  var err: js.UndefOr[WriteConcernError] = js.native
  
  /** Number of documents inserted. */
  def insertedCount: scala.Double = js.native
  
  /** Inserted document generated Id's, hash key is the index of the originating operation */
  def insertedIds: NumberDictionary[Any] = js.native
  
  /** Number of documents matched for update. */
  def matchedCount: scala.Double = js.native
  
  /** Number of documents modified. */
  def modifiedCount: scala.Double = js.native
  
  @JSName("name")
  def name_MMongoBulkWriteError: String = js.native
  
  var result: BulkWriteResult = js.native
  
  /** Number of documents upserted. */
  def upsertedCount: scala.Double = js.native
  
  /** Upserted document generated Id's, hash key is the index of the originating operation */
  def upsertedIds: NumberDictionary[Any] = js.native
  
  var writeErrors: OneOrMore[WriteError] = js.native
}
