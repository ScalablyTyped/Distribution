package typings.mongodb.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "BulkWriteResult")
@js.native
open class BulkWriteResult () extends StObject {
  
  /** Number of documents deleted. */
  def deletedCount: scala.Double = js.native
  
  /** Returns an array of all inserted ids */
  def getInsertedIds(): js.Array[Document] = js.native
  
  /** Retrieve lastOp if available */
  def getLastOp(): js.UndefOr[Document] = js.native
  
  /** Returns raw internal result */
  def getRawResponse(): Document = js.native
  
  /** Returns the upserted id at the given index */
  def getUpsertedIdAt(index: scala.Double): js.UndefOr[Document] = js.native
  
  /** Returns an array of all upserted ids */
  def getUpsertedIds(): js.Array[Document] = js.native
  
  /** Retrieve the write concern error if one exists */
  def getWriteConcernError(): js.UndefOr[WriteConcernError] = js.native
  
  /** Returns a specific write error object */
  def getWriteErrorAt(index: scala.Double): js.UndefOr[WriteError] = js.native
  
  /** Returns the number of write errors off the bulk operation */
  def getWriteErrorCount(): scala.Double = js.native
  
  /** Retrieve all write errors */
  def getWriteErrors(): js.Array[WriteError] = js.native
  
  /** Returns true if the bulk operation contains a write error */
  def hasWriteErrors(): Boolean = js.native
  
  /* Excluded from this release type: __constructor */
  /** Number of documents inserted. */
  def insertedCount: scala.Double = js.native
  
  /** Inserted document generated Id's, hash key is the index of the originating operation */
  def insertedIds: NumberDictionary[Any] = js.native
  
  def isOk(): Boolean = js.native
  
  /** Number of documents matched for update. */
  def matchedCount: scala.Double = js.native
  
  /** Number of documents modified. */
  def modifiedCount: scala.Double = js.native
  
  /** The number of inserted documents */
  def nInserted: scala.Double = js.native
  
  /** Number of matched documents */
  def nMatched: scala.Double = js.native
  
  /** Number of documents updated physically on disk */
  def nModified: scala.Double = js.native
  
  /** Number of removed documents */
  def nRemoved: scala.Double = js.native
  
  /** Number of upserted documents */
  def nUpserted: scala.Double = js.native
  
  /** Evaluates to true if the bulk operation correctly executes */
  def ok: scala.Double = js.native
  
  var result: BulkResult = js.native
  
  def toJSON(): BulkResult = js.native
  
  /** Number of documents upserted. */
  def upsertedCount: scala.Double = js.native
  
  /** Upserted document generated Id's, hash key is the index of the originating operation */
  def upsertedIds: NumberDictionary[Any] = js.native
}
