package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SodaDocuments represents the document for SODA read and write operations.
  */
trait SodaDocument extends js.Object {
  /** Creation time of the document as a string in the UTC time zone using an ISO8601 format. */
  val createdOn: java.lang.String
  /** Unique key value for this document. */
  val key: java.lang.String
  /** Last modified time of the document as a string in the UTC time zone using an ISO8601 format. */
  val lastModified: java.lang.String
  /**
    * An arbitrary string value designating the content media type. The recommendation when creating documents is to use a MIME type for the media type.
    * By default, collections store only JSON document content and this property will be ‘application/json’. This property will be null if the media type
    * is unknown, which will only be in the rare case when a collection was created to store mixed or non-JSON content on top of a pre-existing database table,
    * and that table has NULLs in its mediaType column.
    */
  val mediaType: java.lang.String
  /** Version of the document. */
  val version: java.lang.String
  /**
    * A synchronous method that returns the document content as an object.
    *
    * An exception will occur if the document content is not JSON and cannot be converted to an object.
    *
    * @since 3.0
    */
  def getContent(): stdLib.Record[java.lang.String, _]
  /**
    * A synchronous method that returns the document content as a Buffer.
    *
    * If the documents were originally created with sodaDatabase.createDocument(), then documents are returned as they were created.
    *
    * For documents fetched from the database where the collection storage is BLOB (which is the default), and whose mediaType is ‘application/json’,
    * then the buffer returned is identical to that which was stored. If the storage is not BLOB, it is UTF-8 encoded.
    *
    * @since 3.0
    */
  def getContentAsBuffer(): nodeLib.Buffer
  /**
    * A synchronous method that returns JSON document content as a String.
    *
    * An exception will occur if the document content cannot be converted to a string.
    *
    * If the document encoding is not known, UTF8 will be used.
    *
    * @since 3.0
    */
  def getContentAsString(): java.lang.String
}

object SodaDocument {
  @scala.inline
  def apply(
    createdOn: java.lang.String,
    getContent: () => stdLib.Record[java.lang.String, _],
    getContentAsBuffer: () => nodeLib.Buffer,
    getContentAsString: () => java.lang.String,
    key: java.lang.String,
    lastModified: java.lang.String,
    mediaType: java.lang.String,
    version: java.lang.String
  ): SodaDocument = {
    val __obj = js.Dynamic.literal(createdOn = createdOn, getContent = js.Any.fromFunction0(getContent), getContentAsBuffer = js.Any.fromFunction0(getContentAsBuffer), getContentAsString = js.Any.fromFunction0(getContentAsString), key = key, lastModified = lastModified, mediaType = mediaType, version = version)
  
    __obj.asInstanceOf[SodaDocument]
  }
}

