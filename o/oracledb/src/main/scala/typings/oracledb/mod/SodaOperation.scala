package typings.oracledb.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * You can chain together SodaOperation methods, to specify read or write operations against a collection.
  *
  * Non-terminal SodaOperation methods return the same object on which they are invoked, allowing them to
  * be chained together.
  *
  * A terminal SodaOperation method always appears at the end of a method chain to execute the operation.
  *
  * A SodaOperation object is an internal object. You should not directly modify its properties.
  */
@js.native
trait SodaOperation extends StObject {
  
  /**
    * Finds the number of documents matching the given SodaOperation query criteria.
    *
    * If skip() or limit() are set, then count() will return an error.
    *
    * If oracledb.autoCommit is true, and count() succeeds, then any open transaction on the
    * connection is committed.
    */
  def count(): js.Promise[SodaCountResult] = js.native
  def count(callback: js.Function2[/* error */ DBError, /* result */ SodaCountResult, Unit]): Unit = js.native
  
  /**
    * This property sets the size of an internal buffer used for fetching documents from a collection
    * with the terminal SodaOperation methods getCursor() and getDocuments(). Changing size may affect
    * performance but does not affect how many documents are returned.
    * 
    * If fetchArraySize() is not used, the size defaults to the current value of oracledb.fetchArraySize.
    * 
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sodaqbesearches
    * @since 5.0
    */
  def fetchArraySize(size: Double): SodaOperation = js.native
  
  /**
    * Sets a filter specification for the operation, allowing for complex document queries and ordering
    * of JSON documents. Filter specifications can include comparisons, regular expressions, logical,
    * and spatial operators, among others.
    *
    * @param filterSpec
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sodaqbesearches
    * @since 3.0
    */
  def filter(filterSpec: Record[String, js.Any]): SodaOperation = js.native
  
  /**
    * Returns a SodaDocumentCursor for documents that match the SodaOperation query criteria.
    * The cursor can be iterated over with sodaDocumentCursor.getNext() to access each SodaDocument.
    *
    * When the application has completed using the cursor it must be closed with sodaDocumentCursor.close().
    *
    * If the number of documents is known to be small, it is recommended to use sodaOperation.getDocuments() instead.
    *
    * If oracledb.autoCommit is true, and getCursor() succeeds, then any open transaction on the connection is committed.
    *
    * @since 3.0
    */
  def getCursor(): js.Promise[SodaDocumentCursor] = js.native
  def getCursor(callback: js.Function2[/* error */ DBError, /* cursor */ SodaDocumentCursor, Unit]): Unit = js.native
  
  /**
    * Gets an array of SodaDocuments matching the SodaOperation query criteria. An empty array will be
    * returned when no documents match.
    *
    * Where the number of matching documents is known to be small, this API should be used in preference
    * to sodaOperation.getCursor().
    *
    * If oracledb.autoCommit is true, and getDocuments() succeeds, then any open transaction on the
    * connection is committed.
    *
    * @since 3.0
    */
  def getDocuments(): js.Promise[js.Array[SodaDocument]] = js.native
  def getDocuments(callback: js.Function2[/* error */ DBError, /* documents */ js.Array[SodaDocument], Unit]): Unit = js.native
  
  /**
    * Obtains one document matching the SodaOperation query criteria. If the criteria match more
    * than one document, then only the first is returned.
    *
    * Typically getone() should be used with key(k) or key(k).version(v) to ensure only one document is matched.
    *
    * If oracledb.autoCommit is true, and getOne() succeeds, then any open transaction on the connection
    * is committed.
    *
    * @since 3.0
    */
  def getOne(): js.Promise[js.UndefOr[SodaDocument]] = js.native
  def getOne(callback: js.Function2[/* error */ DBError, /* document */ js.UndefOr[SodaDocument], Unit]): Unit = js.native
  
  /**
    * Sets the key value to be used to match a document for the operation. Any previous calls made to this
    * method or keys() will be ignored.
    *
    * SODA document keys are unique.
    *
    * @param value The value to be set.
    *
    * @since 3.0
    */
  def key(value: String): SodaOperation = js.native
  
  /**
    * Sets the keys to be used to match multiple documents for the operation.
    * Any previous calls made to this method or key() will be ignored.
    *
    * SODA document keys are unique.
    *
    * A maximum of 1000 keys can be used.
    *
    * @param values An array of values to be set.
    *
    * @since 3.0
    */
  def keys(values: js.Array[String]): SodaOperation = js.native
  
  /**
    * Sets the maximum number of documents that a terminal method will apply to. The value of n must be
    * greater than 0. The limit is applied to documents that match the other SodaOperation criteria.
    * The limit() method only applies to SodaOperation read operations like getCursor() and getDocuments().
    * If a filter $orderby is not used, the document order is internally defined.
    *
    * The limit() method cannot be used in conjunction with count().
    *
    * @param limit Maximum number of documents that a terminal method will apply to.
    *
    * @since 3.0
    */
  def limit(limit: Double): SodaOperation = js.native
  
  /**
    * Removes a set of documents matching the SodaOperation query criteria.
    *
    * Note settings from skip() and limit() non-terminals are ignored because they only apply to read operations.
    *
    * If oracledb.autoCommit is true, and remove() succeeds, then removal and any open transaction on the
    * connection is committed.
    *
    * @since 3.0
    */
  def remove(): js.Promise[SodaRemoveResult] = js.native
  def remove(callback: js.Function2[/* error */ DBError, /* result */ SodaRemoveResult, Unit]): Unit = js.native
  
  /**
    * Replaces a document in a collection. The input document can be either a JavaScript object representing the
    * data content, or it can be an existing SodaDocument.
    *
    * The mediaType document component and content of the document that matches the SodaOperation query criteria
    * will be replaced by the content and any mediaType document component of the new document.
    * Any other document components will not be affected. The lastModified and version document components
    * of the replaced document will be updated.
    *
    * The key() non-terminal must be used when using replaceOne().
    *
    * No error is reported if the operation criteria do not match any document.
    *
    * Note settings from skip() and limit() non-terminals are ignored because they only apply to read operations.
    *
    * If oracledb.autoCommit is true, and replaceOne() succeeds, then any open transaction on the connection
    * is committed.
    *
    * @param newDocumentContent New document to create.
    *
    * @since 3.0
    */
  def replaceOne(newDocumentContent: Record[String, js.Any]): js.Promise[SodaReplaceOneResult] = js.native
  def replaceOne(
    newDocumentContent: Record[String, js.Any],
    callback: js.Function2[/* error */ DBError, /* result */ SodaReplaceOneResult, Unit]
  ): Unit = js.native
  /**
    * Replaces a document in a collection. The input document can be either a JavaScript object representing the
    * data content, or it can be an existing SodaDocument.
    *
    * The mediaType document component and content of the document that matches the SodaOperation query criteria
    * will be replaced by the content and any mediaType document component of the new document.
    * Any other document components will not be affected. The lastModified and version document components
    * of the replaced document will be updated.
    *
    * The key() non-terminal must be used when using replaceOne().
    *
    * No error is reported if the operation criteria do not match any document.
    *
    * Note settings from skip() and limit() non-terminals are ignored because they only apply to read operations.
    *
    * If oracledb.autoCommit is true, and replaceOne() succeeds, then any open transaction on the connection
    * is committed.
    *
    * @param newDocument New document to create.
    *
    * @since 3.0
    */
  def replaceOne(newDocument: SodaDocument): js.Promise[SodaReplaceOneResult] = js.native
  def replaceOne(
    newDocument: SodaDocument,
    callback: js.Function2[/* error */ DBError, /* result */ SodaReplaceOneResult, Unit]
  ): Unit = js.native
  
  /**
    * Replaces a document in a collection. This is similar to replaceOne(), but also returns the result document,
    * which contains all SodaDocument components (key, version, etc.) except for content.
    * Content is not returned for performance reasons. The result document has new values for components that
    * are updated as part of the replace operation (such as version, last-modified timestamp, and media type)
    *
    * If oracledb.autoCommit is true, and replaceOneAndGet() succeeds, then any open transaction on the connection
    * is committed.
    *
    * @param newDocument New document to create.
    *
    * @since 3.0
    */
  def replaceOneAndGet(newDocumentContent: Record[String, js.Any]): js.Promise[SodaDocument] = js.native
  def replaceOneAndGet(
    newDocumentContent: Record[String, js.Any],
    callback: js.Function2[/* error */ DBError, /* document */ SodaDocument, Unit]
  ): Unit = js.native
  /**
    * Replaces a document in a collection. This is similar to replaceOne(), but also returns the result document,
    * which contains all SodaDocument components (key, version, etc.) except for content.
    * Content is not returned for performance reasons. The result document has new values for components that
    * are updated as part of the replace operation (such as version, last-modified timestamp, and media type)
    *
    * If oracledb.autoCommit is true, and replaceOneAndGet() succeeds, then any open transaction on the connection
    * is committed.
    *
    * @param newDocument New document to create.
    *
    * @since 3.0
    */
  def replaceOneAndGet(newDocument: SodaDocument): js.Promise[js.UndefOr[SodaDocument]] = js.native
  def replaceOneAndGet(
    newDocument: SodaDocument,
    callback: js.Function2[/* error */ DBError, /* document */ js.UndefOr[SodaDocument], Unit]
  ): Unit = js.native
  
  /**
    * Sets the number of documents that will be skipped before the terminal method is applied.
    * The value of n must be greater or equal to 0. The skip applies to documents that match the other
    * SodaOperation criteria.
    *
    * If a filter $orderby is not used, the document order (and hence which documents are skipped) is
    * internally defined.
    *
    * The skip() method only applies to SodaOperation read operations like getDocuments().
    * It cannot be used with count().
    *
    * @param skip The number of documents that will be skipped.
    *
    * @since 3.0
    */
  def skip(skip: Double): SodaOperation = js.native
  
  /**
    * Sets the document version that documents must have.
    *
    * This is typically used in conjunction with a key, for example
    *
    *      collection.find().key("k").version("v").replaceOne(doc)
    *
    * Using version() allows for optimistic locking, so that the subsequent SodaOperation terminal method
    * does not affect a document that someone else has already modified.
    * If the requested document version is not matched, then your terminal operation will not impact any document.
    * The application can then query to find the latest document version and apply any desired change.
    *
    * @param version Version that documents must have.
    *
    * @since 3.0
    */
  def version(version: String): SodaOperation = js.native
}
