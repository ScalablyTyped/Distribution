package typings.neverbounce.neverbounceMod

import typings.neverbounce.Anon_ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var acceptedType: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[Anon_ContentType] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    acceptedType: String = null,
    headers: Anon_ContentType = null,
    host: String = null,
    port: Int | Double = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (acceptedType != null) __obj.updateDynamic("acceptedType")(acceptedType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

