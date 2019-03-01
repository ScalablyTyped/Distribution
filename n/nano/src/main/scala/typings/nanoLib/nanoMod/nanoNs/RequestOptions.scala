package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var att: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var content_type: js.UndefOr[java.lang.String] = js.undefined
  var db: js.UndefOr[java.lang.String] = js.undefined
  var doc: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var multipart: js.UndefOr[js.Array[_]] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var qs: js.UndefOr[js.Any] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    att: java.lang.String = null,
    body: js.Any = null,
    content_type: java.lang.String = null,
    db: java.lang.String = null,
    doc: java.lang.String = null,
    encoding: java.lang.String = null,
    headers: js.Any = null,
    method: java.lang.String = null,
    multipart: js.Array[_] = null,
    path: java.lang.String = null,
    qs: js.Any = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (att != null) __obj.updateDynamic("att")(att)
    if (body != null) __obj.updateDynamic("body")(body)
    if (content_type != null) __obj.updateDynamic("content_type")(content_type)
    if (db != null) __obj.updateDynamic("db")(db)
    if (doc != null) __obj.updateDynamic("doc")(doc)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (multipart != null) __obj.updateDynamic("multipart")(multipart)
    if (path != null) __obj.updateDynamic("path")(path)
    if (qs != null) __obj.updateDynamic("qs")(qs)
    __obj.asInstanceOf[RequestOptions]
  }
}

