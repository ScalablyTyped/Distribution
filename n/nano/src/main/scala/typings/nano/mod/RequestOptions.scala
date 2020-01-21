package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var att: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var content_type: js.UndefOr[String] = js.undefined
  var db: js.UndefOr[String] = js.undefined
  var doc: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var multipart: js.UndefOr[js.Array[_]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var qs: js.UndefOr[js.Any] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    att: String = null,
    body: js.Any = null,
    content_type: String = null,
    db: String = null,
    doc: String = null,
    encoding: String = null,
    headers: js.Any = null,
    method: String = null,
    multipart: js.Array[_] = null,
    path: String = null,
    qs: js.Any = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (att != null) __obj.updateDynamic("att")(att.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (multipart != null) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (qs != null) __obj.updateDynamic("qs")(qs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

