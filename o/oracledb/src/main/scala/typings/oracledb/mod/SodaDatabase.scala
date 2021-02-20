package typings.oracledb.mod

import typings.node.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SodaDatabase class is the top level object for node-oracledb SODA operations.
  * A ‘SODA database’ is an abstraction, allowing access to SODA collections in that ‘SODA database’,
  * which then allow access to documents in those collections.
  *
  * A SODA database object is created by calling connection.getSodaDatabase().
  *
  * @see https://www.oracle.com/pls/topic/lookup?ctx=dblatest&id=GUID-BE42F8D3-B86B-43B4-B2A3-5760A4DF79FB
  * @see https://oracle.github.io/node-oracledb/doc/api.html#sodaoverview
  */
@js.native
trait SodaDatabase extends StObject {
  
  /**
    * Creates a SODA collection of the given name. If you try to create a collection, and a collection with the
    * same name already exists, then that existing collection is opened without error.
    *
    * Optional metadata allows collection customization. If metadata is not supplied, a default collection
    * will be created.
    *
    * Most users will allow createCollection() to create the Oracle Database table used internally to store
    * SODA documents. However the option mode can be used to indicate the collection should be stored in a
    * table that was previously manually created.
    *
    * By default, createCollection() first attempts to create the Oracle Database table used internally to store
    * the collection. If the table exists already, it will attempt to use it as the table underlying the collection.
    *
    * If the optional mode parameter is oracledb.SODA_COLL_MAP_MODE, SODA will attempt to use a pre-existing
    * table as the table underlying the collection.
    *
    * If oracledb.autoCommit is true, and createCollection() succeeds, then any open transaction on the connection
    * is committed. Note SODA operations do not commit an open transaction the way that SQL always does for DDL
    * statements.
    *
    * @param collectionName Name of the collection to be created.
    * @param options
    *
    * @since 3.0
    */
  def createCollection(collectionName: String): js.Promise[SodaCollection] = js.native
  def createCollection(
    collectionName: String,
    callback: js.Function2[/* error */ DBError, /* collection */ SodaCollection, Unit]
  ): Unit = js.native
  def createCollection(collectionName: String, options: SodaCollectionOptions): js.Promise[SodaCollection] = js.native
  def createCollection(
    collectionName: String,
    options: SodaCollectionOptions,
    callback: js.Function2[/* error */ DBError, /* collection */ SodaCollection, Unit]
  ): Unit = js.native
  
  /**
    * A synchronous method that constructs a proto SodaDocument object usable for SODA insert and replace methods.
    * SodaDocument attributes like createdOn will not be defined, and neither will attributes valid in options but not specified.
    * The document will not be stored in the database until an insert or replace method is called.
    *
    * You only need to call createDocument() if your collection requires client-assigned keys or has non-JSON content,
    * otherwise you can pass your JSON content directly to the SODA insert and replace methods.
    *
    * @param content The document content.
    * @param options Optional properties for the document to be created.
    */
  def createDocument(content: String): SodaDocument = js.native
  def createDocument(content: String, options: SodaDocumentOptions): SodaDocument = js.native
  def createDocument(content: Buffer): SodaDocument = js.native
  def createDocument(content: Buffer, options: SodaDocumentOptions): SodaDocument = js.native
  def createDocument(content: Record[String, _]): SodaDocument = js.native
  def createDocument(content: Record[String, _], options: SodaDocumentOptions): SodaDocument = js.native
  
  /**
    * Gets an array of collection names in alphabetical order.
    *
    * If oracledb.autoCommit is true, and getCollectionNames() succeeds, then any open transaction on the connection is committed.
    *
    * @param options If options is undefined, then all collection names will be returned.
    *
    * @since 3.0
    */
  def getCollectionNames(): js.Array[String] = js.native
  def getCollectionNames(callback: js.Function2[/* error */ DBError, /* names */ js.Array[String], Unit]): Unit = js.native
  def getCollectionNames(options: SodaCollectionNamesOptions): js.Array[String] = js.native
  def getCollectionNames(
    options: SodaCollectionNamesOptions,
    callback: js.Function2[/* error */ DBError, /* names */ js.Array[String], Unit]
  ): Unit = js.native
  
  /**
    * Opens an existing SodaCollection of the given name. The collection can then be used to access documents.
    *
    * If the requested collection does not exist, it is not an error. Instead, the returned collection value
    * will be undefined.
    *
    * If oracledb.autoCommit is true, and openCollection() succeeds, then any open transaction on the
    * connection is committed.
    *
    * @param collectionName Name of the collection to open.
    *
    * @since 3.0
    */
  def openCollection(collectionName: String): js.Promise[js.UndefOr[SodaCollection]] = js.native
  def openCollection(
    collectionName: String,
    callback: js.Function2[/* error */ DBError, /* collection */ js.UndefOr[SodaCollection], Unit]
  ): Unit = js.native
}
