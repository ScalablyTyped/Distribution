package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Multi-part HTTP functions */
@js.native
trait Multipart[D] extends StObject {
  
  /** Fetch document and its attachments as a multipart HTTP request. 
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/document/common.html#efficient-multiple-attachments-retrieving} */
  def get(docname: String): js.Promise[Any] = js.native
  def get(docname: String, callback: Callback[Any]): js.Promise[Any] = js.native
  /** Fetch document and its attachments as a multipart HTTP request with options.
    * @see Docs: {@link https://docs.couchdb.org/en/latest/api/document/common.html#efficient-multiple-attachments-retrieving} */
  def get(docname: String, params: Any): js.Promise[Any] = js.native
  def get(docname: String, params: Any, callback: Callback[Any]): js.Promise[Any] = js.native
  
  /** Create doc with multiple attachments using mutlipart HTTP request.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/document/common.html#creating-multiple-attachments} */
  def insert(doc: D, attachments: js.Array[AttachmentData]): js.Promise[DocumentInsertResponse] = js.native
  def insert(doc: D, attachments: js.Array[AttachmentData], callback: Callback[DocumentInsertResponse]): js.Promise[DocumentInsertResponse] = js.native
  /** Create doc with multiple attachments using mutlipart HTTP request with options.
    * @see Docs: {@link http://docs.couchdb.org/en/latest/api/document/common.html#creating-multiple-attachments} */
  def insert(doc: D, attachments: js.Array[AttachmentData], params: Any): js.Promise[DocumentInsertResponse] = js.native
  def insert(
    doc: D,
    attachments: js.Array[AttachmentData],
    params: Any,
    callback: Callback[DocumentInsertResponse]
  ): js.Promise[DocumentInsertResponse] = js.native
}
