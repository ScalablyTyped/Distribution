package typings.nano.mod

import typings.node.Buffer
import typings.node.processMod.global.NodeJS.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachment extends js.Object {
  
  def destroy(docname: String, attname: String): js.Promise[_] = js.native
  def destroy(docname: String, attname: String, callback: Callback[_]): js.Promise[_] = js.native
  def destroy(docname: String, attname: String, params: js.Any): js.Promise[_] = js.native
  def destroy(docname: String, attname: String, params: js.Any, callback: Callback[_]): js.Promise[_] = js.native
  
  def get(docname: String, attname: String): js.Promise[Buffer] = js.native
  def get(docname: String, attname: String, callback: Callback[Buffer]): js.Promise[Buffer] = js.native
  def get(docname: String, attname: String, params: js.Any): js.Promise[Buffer] = js.native
  def get(docname: String, attname: String, params: js.Any, callback: Callback[Buffer]): js.Promise[Buffer] = js.native
  
  def getAsStream(docname: String, attname: String): ReadStream = js.native
  
  def insert(docname: String, attname: String, att: js.Any, contenttype: String): js.Promise[DocumentInsertResponse] = js.native
  def insert(
    docname: String,
    attname: String,
    att: js.Any,
    contenttype: String,
    callback: Callback[DocumentInsertResponse]
  ): js.Promise[DocumentInsertResponse] = js.native
  def insert(docname: String, attname: String, att: js.Any, contenttype: String, params: js.Any): js.Promise[DocumentInsertResponse] = js.native
  def insert(
    docname: String,
    attname: String,
    att: js.Any,
    contenttype: String,
    params: js.Any,
    callback: Callback[DocumentInsertResponse]
  ): js.Promise[DocumentInsertResponse] = js.native
  // NodeJS.WritableStream
  def insert(docname: String, attname: String, att: Null, contenttype: String): js.Promise[DocumentInsertResponse] = js.native
  def insert(docname: String, attname: String, att: Null, contenttype: String, params: js.Any): js.Promise[DocumentInsertResponse] = js.native
}
