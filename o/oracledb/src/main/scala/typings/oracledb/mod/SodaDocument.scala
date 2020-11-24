package typings.oracledb.mod

import typings.node.Buffer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SodaDocuments represents the document for SODA read and write operations.
  */
@js.native
trait SodaDocument extends js.Object {
  
  /** Creation time of the document as a string in the UTC time zone using an ISO8601 format. */
  val createdOn: js.UndefOr[String] = js.native
  
  /**
    * A synchronous method that returns the document content as an object.
    *
    * An exception will occur if the document content is not JSON and cannot be converted to an object.
    *
    * @since 3.0
    */
  def getContent(): Record[String, _] = js.native
  
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
  def getContentAsBuffer(): Buffer = js.native
  
  /**
    * A synchronous method that returns JSON document content as a String.
    *
    * An exception will occur if the document content cannot be converted to a string.
    *
    * If the document encoding is not known, UTF8 will be used.
    *
    * @since 3.0
    */
  def getContentAsString(): String = js.native
  
  /** Unique key value for this document. */
  val key: js.UndefOr[String] = js.native
  
  /** Last modified time of the document as a string in the UTC time zone using an ISO8601 format. */
  val lastModified: String = js.native
  
  /**
    * An arbitrary string value designating the content media type. The recommendation when creating documents is to use a MIME type for the media type.
    * By default, collections store only JSON document content and this property will be ‘application/json’. This property will be null if the media type
    * is unknown, which will only be in the rare case when a collection was created to store mixed or non-JSON content on top of a pre-existing database table,
    * and that table has NULLs in its mediaType column.
    * 
    * @default 'application/json'
    */
  val mediaType: js.UndefOr[String] = js.native
  
  /** Version of the document. */
  val version: String = js.native
}
object SodaDocument {
  
  @scala.inline
  def apply(
    getContent: () => Record[String, _],
    getContentAsBuffer: () => Buffer,
    getContentAsString: () => String,
    lastModified: String,
    version: String
  ): SodaDocument = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), getContentAsBuffer = js.Any.fromFunction0(getContentAsBuffer), getContentAsString = js.Any.fromFunction0(getContentAsString), lastModified = lastModified.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SodaDocument]
  }
  
  @scala.inline
  implicit class SodaDocumentOps[Self <: SodaDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetContent(value: () => Record[String, _]): Self = this.set("getContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContentAsBuffer(value: () => Buffer): Self = this.set("getContentAsBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContentAsString(value: () => String): Self = this.set("getContentAsString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastModified(value: String): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOn(value: String): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedOn: Self = this.set("createdOn", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
  }
}
