package typings.oracledb.oracledbMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SODA can be used with Oracle Client 18.5 and Oracle Client 19.3, or later.
  */
@js.native
trait SodaCollection extends js.Object {
  /**
    * Metadata of the current collection.
    *
    * @since 3.0
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sodaclientkeys
    */
  val metaData: SodaMetadata = js.native
  /**
    * Name of the current collection.
    *
    * @since 3.0
    */
  val name: String = js.native
  /**
    * Creates an index on a SODA collection, to improve the performance of SODA query-by-examples (QBE) or
    * enable text searches. An index is defined by a specification, which is a JSON object that specifies
    * how particular QBE patterns are to be indexed for quicker matching.
    *
    * Note that a commit should be performed before attempting to create an index.
    *
    * @param indexSpec
    *
    * @since 3.0
    * @see https://www.oracle.com/pls/topic/lookup?ctx=dblatest&id=GUID-4848E6A0-58A7-44FD-8D6D-A033D0CCF9CB
    */
  def createIndex(indexSpec: BTreeIndex): js.Promise[Unit] = js.native
  def createIndex(indexSpec: BTreeIndex, callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  def createIndex(indexSpec: SearchIndex): js.Promise[Unit] = js.native
  def createIndex(indexSpec: SearchIndex, callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  def createIndex(indexSpec: SpatialIndex): js.Promise[Unit] = js.native
  def createIndex(indexSpec: SpatialIndex, callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  /**
    * Drops the current collection.
    *
    * An error such as ORA-40626 will be returned and the collection will not be dropped if there are
    * uncommitted writes to the collection in the current transaction.
    *
    * If the collection was created with mode oracledb.SODA_COLL_MAP_MODE, then drop() will not physically
    * delete the database storage containing the collection, and won’t drop SODA indexes. Instead it will simply
    * unmap the collection, making it inaccessible to SODA operations.
    *
    * If oracledb.autoCommit is true, and drop() succeeds, then any open user transaction is committed.
    * Note SODA operations do not commit an open transaction the way that SQL always does for DDL statements.
    *
    * If the collection was created with custom metadata changing the key assignment method to SEQUENCE,
    * the drop() method will not delete the underlying Oracle sequence. This is in case it was created outside SODA.
    * To drop the sequence, use the SQL command DROP SEQUENCE after drop() has completed.
    *
    * Note you should never use SQL DROP TABLE command on the database table underlying a collection. This will
    * not clean up SODA’s metadata. If you do accidentally execute DROP SQL, you should cleanup the metadata with
    * drop() or execute the SQL statement: SELECT DBMS_SODA.DROP_COLLECTION('myCollection') FROM DUAL;.
    *
    * @since 3.0
    */
  def drop(): js.Promise[DropCollectionResult] = js.native
  def drop(callback: js.Function2[/* error */ DBError, /* result */ DropCollectionResult, Unit]): Unit = js.native
  /**
    * Drops the specified index.
    *
    * If oracledb.autoCommit is true, and dropIndex() succeeds, then any open user transaction is committed.
    * Note SODA operations do not commit an open transaction the way that SQL always does for DDL statements.
    *
    * @param indexName Name of the index to be dropped.
    * @param options
    *
    * @since 3.0
    */
  def dropIndex(indexName: String): js.Promise[DropCollectionResult] = js.native
  def dropIndex(indexName: String, options: DropIndexOptions): js.Promise[DropCollectionResult] = js.native
  def dropIndex(
    indexName: String,
    options: DropIndexOptions,
    callback: js.Function2[/* error */ DBError, /* result */ DropCollectionResult, Unit]
  ): Unit = js.native
  /**
    * The synchronous find() method is used to locate and order a set of SODA documents for retrieval,
    * replacement, or removal. It creates and returns a SodaOperation object which is used via method
    * chaining with non-terminal and terminal methods described below. Note that SodaOperation is an
    * internal object whose attributes should not be accessed directly.
    *
    * @since 3.0
    */
  def find(): SodaOperation = js.native
  /**
    * Infers the schema of a collection of JSON documents at the current time. A JSON data guide shows details
    * like the JSON property names, data types and lengths. It is useful for exploring the schema of a collection.
    * The data guide is represented as JSON content in a SodaDocument.
    *
    * This method is supported for JSON-only collections which have a JSON Search index where the “dataguide”
    * option is “on”. An error will be returned if a data guide cannot be created.
    *
    * A data guide is a best effort heuristic and should not be used as a schema to validate new JSON documents.
    * The data guide is always additive, and does not update itself when documents are deleted.
    * There are some limits such as the maximum number of children under one node, and the maximum length of a path.
    *
    * If oracledb.autoCommit is true, and getDataGuide() succeeds, then any open user transaction is committed.
    *
    * @since 3.0
    */
  def getDataGuide(): js.Promise[SodaDocument] = js.native
  def getDataGuide(callback: js.Function2[/* error */ DBError, /* document */ SodaDocument, Unit]): Unit = js.native
  /**
    * Inserts a given document to the collection. The input document can be either a JavaScript object representing
    * the data content, or it can be an existing SodaDocument.
    *
    * Note SodaDocuments returned from sodaCollection.insertOneAndGet() or from sodaOperation.replaceOneAndGet()
    * cannot be passed to insertOne(), since these do not contain any document content. Instead, create a
    * JavaScript object using the desired attribute values, or use sodaDatabase.createDocument(), or use a
    * SodaDocument returned by a sodaCollection.find() query.
    *
    * If oracledb.autoCommit is true, and insertOne() succeeds, then the new document and any open transaction
    * on the connection is committed.
    *
    * @param newDocumentContent The document to insert.
    *
    * @since 3.0
    */
  def insertOne(newDocumentContent: Record[String, _]): js.Promise[Unit] = js.native
  def insertOne(newDocumentContent: Record[String, _], callback: js.Function1[/* error */ DBError, Unit]): js.Promise[Unit] = js.native
  /**
    * Inserts a given document to the collection. The input document can be either a JavaScript object representing
    * the data content, or it can be an existing SodaDocument.
    *
    * Note SodaDocuments returned from sodaCollection.insertOneAndGet() or from sodaOperation.replaceOneAndGet()
    * cannot be passed to insertOne(), since these do not contain any document content. Instead, create a
    * JavaScript object using the desired attribute values, or use sodaDatabase.createDocument(), or use a
    * SodaDocument returned by a sodaCollection.find() query.
    *
    * If oracledb.autoCommit is true, and insertOne() succeeds, then the new document and any open transaction
    * on the connection is committed.
    *
    * @param newDocument The document to insert.
    *
    * @since 3.0
    */
  def insertOne(newDocument: SodaDocument): js.Promise[Unit] = js.native
  def insertOne(newDocument: SodaDocument, callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  /**
    * Similar to sodaCollection.insertOne() but also returns the inserted document so system managed properties,
    * such as the key (in default collections), can be found.
    *
    * Inserts a document in a collection. This is similar to sodaCollection.insertOne(), but also returns the
    * result document, which contains all SodaDocument components (key, version, etc.) except for content.
    * Content is not returned for performance reasons. The result document has new values for components that
    * are updated as part of the replace operation (such as version, last-modified timestamp, and media type)
    *
    * If you want to insert the returned document again, use the original newDocumentContent or newDocument.
    * Alternatively construct a new object from the returned document and add content.
    *
    * If oracledb.autoCommit is true, and insertOneAndGet() succeeds, then any open transaction on the connection
    * is committed.
    *
    * @param newDocumentContent The document to insert.
    *
    * @since 3.0
    */
  def insertOneAndGet(newDocumentContent: Record[String, _]): js.Promise[SodaDocument] = js.native
  def insertOneAndGet(
    newDocumentContent: Record[String, _],
    callback: js.Function2[/* error */ DBError, /* document */ SodaDocument, Unit]
  ): js.Promise[Unit] = js.native
  /**
    * Similar to sodaCollection.insertOne() but also returns the inserted document so system managed properties,
    * such as the key (in default collections), can be found.
    *
    * Inserts a document in a collection. This is similar to sodaCollection.insertOne(), but also returns the
    * result document, which contains all SodaDocument components (key, version, etc.) except for content.
    * Content is not returned for performance reasons. The result document has new values for components that
    * are updated as part of the replace operation (such as version, last-modified timestamp, and media type)
    *
    * If you want to insert the returned document again, use the original newDocumentContent or newDocument.
    * Alternatively construct a new object from the returned document and add content.
    *
    * If oracledb.autoCommit is true, and insertOneAndGet() succeeds, then any open transaction on the connection
    * is committed.
    *
    * @param newDocument The document to insert.
    *
    * @since 3.0
    */
  def insertOneAndGet(newDocument: SodaDocument): js.Promise[SodaDocument] = js.native
  def insertOneAndGet(
    newDocument: SodaDocument,
    callback: js.Function2[/* error */ DBError, /* document */ SodaDocument, Unit]
  ): Unit = js.native
}

