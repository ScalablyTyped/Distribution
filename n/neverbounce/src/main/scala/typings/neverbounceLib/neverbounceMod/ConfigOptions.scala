package typings
package neverbounceLib.neverbounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var acceptedType: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[neverbounceLib.Anon_ContentType] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    acceptedType: java.lang.String = null,
    headers: neverbounceLib.Anon_ContentType = null,
    host: java.lang.String = null,
    port: scala.Int | scala.Double = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (acceptedType != null) __obj.updateDynamic("acceptedType")(acceptedType)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

