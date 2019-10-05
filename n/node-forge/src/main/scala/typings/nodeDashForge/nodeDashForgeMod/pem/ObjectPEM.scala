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
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (contentDomain != null) __obj.updateDynamic("contentDomain")(contentDomain)
    if (dekInfo != null) __obj.updateDynamic("dekInfo")(dekInfo)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (procType != null) __obj.updateDynamic("procType")(procType)
    __obj.asInstanceOf[ObjectPEM]
  }
}

