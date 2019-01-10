package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachment extends js.Object {
  def destroy(docname: java.lang.String, attname: java.lang.String): js.Promise[_] = js.native
  def destroy(docname: java.lang.String, attname: java.lang.String, callback: Callback[_]): js.Promise[_] = js.native
  def destroy(docname: java.lang.String, attname: java.lang.String, params: js.Any): js.Promise[_] = js.native
  def destroy(docname: java.lang.String, attname: java.lang.String, params: js.Any, callback: Callback[_]): js.Promise[_] = js.native
  def get(docname: java.lang.String, attname: java.lang.String): js.Promise[_] = js.native
  def get(docname: java.lang.String, attname: java.lang.String, callback: Callback[_]): js.Promise[_] = js.native
  def get(docname: java.lang.String, attname: java.lang.String, params: js.Any): js.Promise[_] = js.native
  def get(docname: java.lang.String, attname: java.lang.String, params: js.Any, callback: Callback[_]): js.Promise[_] = js.native
  def getAsStream(docname: java.lang.String, attname: java.lang.String): requestLib.requestMod.requestNs.Request = js.native
  def insert(docname: java.lang.String, attname: java.lang.String, att: js.Any, contenttype: java.lang.String): js.Promise[DocumentInsertResponse] = js.native
  def insert(
    docname: java.lang.String,
    attname: java.lang.String,
    att: js.Any,
    contenttype: java.lang.String,
    callback: Callback[DocumentInsertResponse]
  ): js.Promise[DocumentInsertResponse] = js.native
  def insert(
    docname: java.lang.String,
    attname: java.lang.String,
    att: js.Any,
    contenttype: java.lang.String,
    params: js.Any
  ): js.Promise[DocumentInsertResponse] = js.native
  def insert(
    docname: java.lang.String,
    attname: java.lang.String,
    att: js.Any,
    contenttype: java.lang.String,
    params: js.Any,
    callback: Callback[DocumentInsertResponse]
  ): js.Promise[DocumentInsertResponse] = js.native
  // NodeJS.WritableStream
  def insert(
    docname: java.lang.String,
    attname: java.lang.String,
    att: scala.Null,
    contenttype: java.lang.String
  ): js.Promise[DocumentInsertResponse] = js.native
  def insert(
    docname: java.lang.String,
    attname: java.lang.String,
    att: scala.Null,
    contenttype: java.lang.String,
    params: js.Any
  ): js.Promise[DocumentInsertResponse] = js.native
  def insertAsStream(docname: java.lang.String, attname: java.lang.String, att: js.Any, contenttype: java.lang.String): requestLib.requestMod.requestNs.Request = js.native
  def insertAsStream(
    docname: java.lang.String,
    attname: java.lang.String,
    att: js.Any,
    contenttype: java.lang.String,
    params: js.Any
  ): requestLib.requestMod.requestNs.Request = js.native
}

