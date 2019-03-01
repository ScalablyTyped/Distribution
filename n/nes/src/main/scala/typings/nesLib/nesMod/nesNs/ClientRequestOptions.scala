package typings
package nesLib.nesMod.nesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequestOptions
  extends nesLib.clientMod.ClientNs.ClientRequestOptions

object ClientRequestOptions {
  @scala.inline
  def apply(
    path: java.lang.String,
    headers: js.Object = null,
    method: java.lang.String = null,
    payload: js.Any = null
  ): ClientRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[ClientRequestOptions]
  }
}

