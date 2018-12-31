package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multipart[D] extends js.Object {
  def get(docname: java.lang.String): js.Promise[_] = js.native
  def get(docname: java.lang.String, callback: Callback[_]): js.Promise[_] = js.native
  def get(docname: java.lang.String, params: js.Any): js.Promise[_] = js.native
  def get(docname: java.lang.String, params: js.Any, callback: Callback[_]): js.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#creating-multiple-attachments
  def insert(doc: D, attachments: js.Array[AttachmentData]): js.Promise[DocumentInsertResponse] = js.native
  def insert(doc: D, attachments: js.Array[AttachmentData], callback: Callback[DocumentInsertResponse]): js.Promise[DocumentInsertResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#creating-multiple-attachments
  def insert(doc: D, attachments: js.Array[AttachmentData], params: js.Any): js.Promise[DocumentInsertResponse] = js.native
  def insert(
    doc: D,
    attachments: js.Array[AttachmentData],
    params: js.Any,
    callback: Callback[DocumentInsertResponse]
  ): js.Promise[DocumentInsertResponse] = js.native
}

