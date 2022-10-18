package typings.nano.mod

import typings.node.bufferMod.global.Buffer
import typings.node.processMod.global.NodeJS.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Attachment functions */
@js.native
trait Attachment extends StObject {
  
  /** Delete an attachment.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/document/attachments.html#delete--db-docid-attname} */
  def destroy(docname: String, attname: String): js.Promise[Any] = js.native
  def destroy(docname: String, attname: String, callback: Callback[Any]): js.Promise[Any] = js.native
  /** Delete an attachment with options.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/document/attachments.html#delete--db-docid-attname} */
  def destroy(docname: String, attname: String, params: Any): js.Promise[Any] = js.native
  def destroy(docname: String, attname: String, params: Any, callback: Callback[Any]): js.Promise[Any] = js.native
  
  /** Get an attachment.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/document/attachments.html#get--db-docid-attname} */
  def get(docname: String, attname: String): js.Promise[Buffer] = js.native
  def get(docname: String, attname: String, callback: Callback[Buffer]): js.Promise[Buffer] = js.native
  /** Get an attachment with options.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/document/attachments.html#get--db-docid-attname} */
  def get(docname: String, attname: String, params: Any): js.Promise[Buffer] = js.native
  def get(docname: String, attname: String, params: Any, callback: Callback[Buffer]): js.Promise[Buffer] = js.native
  
  /** Get an attachment as a stream.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/document/attachments.html#get--db-docid-attname} */
  def getAsStream(docname: String, attname: String): ReadStream = js.native
  
  /** Insert an attachment.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/document/attachments.html#put--db-docid-attname} */
  def insert(docname: String, attname: String, att: Any, contenttype: String): js.Promise[DocumentInsertResponse] = js.native
  def insert(
    docname: String,
    attname: String,
    att: Any,
    contenttype: String,
    callback: Callback[DocumentInsertResponse]
  ): js.Promise[DocumentInsertResponse] = js.native
  /** Insert an attachment with options.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/document/attachments.html#put--db-docid-attname} */
  def insert(docname: String, attname: String, att: Any, contenttype: String, params: Any): js.Promise[DocumentInsertResponse] = js.native
  def insert(
    docname: String,
    attname: String,
    att: Any,
    contenttype: String,
    params: Any,
    callback: Callback[DocumentInsertResponse]
  ): js.Promise[DocumentInsertResponse] = js.native
}
