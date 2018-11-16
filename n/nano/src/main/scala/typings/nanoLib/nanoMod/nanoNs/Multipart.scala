package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multipart[D] extends js.Object {
  def get(docname: java.lang.String): stdLib.Promise[_] = js.native
  def get(docname: java.lang.String, callback: Callback[_]): stdLib.Promise[_] = js.native
  def get(docname: java.lang.String, params: js.Any): stdLib.Promise[_] = js.native
  def get(docname: java.lang.String, params: js.Any, callback: Callback[_]): stdLib.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#creating-multiple-attachments
  def insert(doc: D, attachments: js.Array[AttachmentData]): stdLib.Promise[DocumentInsertResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#creating-multiple-attachments
  def insert(doc: D, attachments: js.Array[AttachmentData], callback: Callback[DocumentInsertResponse]): stdLib.Promise[DocumentInsertResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#creating-multiple-attachments
  def insert(doc: D, attachments: js.Array[AttachmentData], params: js.Any): stdLib.Promise[DocumentInsertResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#creating-multiple-attachments
  def insert(
    doc: D,
    attachments: js.Array[AttachmentData],
    params: js.Any,
    callback: Callback[DocumentInsertResponse]
  ): stdLib.Promise[DocumentInsertResponse] = js.native
}

