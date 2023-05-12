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
  val deletedCount: scala.Double = js.native
  
  /**
    * Returns an array of all inserted ids
    * @deprecated Use insertedIds instead.
    */
  def getInsertedIds(): js.Array[Document] = js.native
  
  /** Returns raw internal result */
  def getRawResponse(): Document = js.native
  
  /** Returns the upserted id at the given index */
  def getUpsertedIdAt(index: scala.Double): js.UndefOr[Document] = js.native
  
  /**
    * Returns an array of all upserted ids
    * @deprecated Use upsertedIds instead.
    */
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
  
  /** Number of documents inserted. */
  val insertedCount: scala.Double = js.native
  
  /** Inserted document generated Id's, hash key is the index of the originating operation */
  val insertedIds: NumberDictionary[Any] = js.native
  
  def isOk(): Boolean = js.native
  
  /** Number of documents matched for update. */
  val matchedCount: scala.Double = js.native
  
  /** Number of documents modified. */
  val modifiedCount: scala.Double = js.native
  
  /**
    * The number of inserted documents
    * @deprecated Use insertedCount instead.
    */
  def nInserted: scala.Double = js.native
  
  /**
    * Number of matched documents
    * @deprecated Use matchedCount instead.
    */
  def nMatched: scala.Double = js.native
  
  /**
    * Number of documents updated physically on disk
    * @deprecated Use modifiedCount instead.
    */
  def nModified: scala.Double = js.native
  
  /**
    * Number of removed documents
    * @deprecated Use deletedCount instead.
    */
  def nRemoved: scala.Double = js.native
  
  /**
    * Number of upserted documents
    * @deprecated User upsertedCount instead.
    */
  def nUpserted: scala.Double = js.native
  
  /* Excluded from this release type: __constructor */
  /** Evaluates to true if the bulk operation correctly executes */
  def ok: scala.Double = js.native
  
  /* private */ val result: Any = js.native
  
  /** Number of documents upserted. */
  val upsertedCount: scala.Double = js.native
  
  /** Upserted document generated Id's, hash key is the index of the originating operation */
  val upsertedIds: NumberDictionary[Any] = js.native
}
/* static members */
object BulkWriteResult {
  
  @JSImport("mongodb", "BulkWriteResult")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mongodb", "BulkWriteResult.generateIdMap")
  @js.native
  def generateIdMap: Any = js.native
  inline def generateIdMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generateIdMap")(x.asInstanceOf[js.Any])
}
