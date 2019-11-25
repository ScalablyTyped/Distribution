package typings.nodeDashForge.nodeDashForgeMod.pem

import typings.nodeDashForge.nodeDashForgeMod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectPEM extends js.Object {
  var body: Bytes
  var contentDomain: js.UndefOr[js.Any] = js.undefined
  var dekInfo: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Array[_]] = js.undefined
  var procType: js.UndefOr[js.Any] = js.undefined
  var `type`: String
}

object ObjectPEM {
  @scala.inline
  def apply(
    body: Bytes,
    `type`: String,
    contentDomain: js.Any = null,
    dekInfo: js.Any = null,
    headers: js.Array[_] = null,
    procType: js.Any = null
  ): ObjectPEM = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (contentDomain != null) __obj.updateDynamic("contentDomain")(contentDomain.asInstanceOf[js.Any])
    if (dekInfo != null) __obj.updateDynamic("dekInfo")(dekInfo.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (procType != null) __obj.updateDynamic("procType")(procType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPEM]
  }
}

