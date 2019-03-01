package typings
package officeDashJsLib.OfficeExtensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedOptions extends js.Object {
  var container: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var sessionKey: js.UndefOr[java.lang.String] = js.undefined
  var timeoutInMilliseconds: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object EmbeddedOptions {
  @scala.inline
  def apply(
    container: stdLib.HTMLElement = null,
    height: java.lang.String = null,
    id: java.lang.String = null,
    sessionKey: java.lang.String = null,
    timeoutInMilliseconds: scala.Int | scala.Double = null,
    width: java.lang.String = null
  ): EmbeddedOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (height != null) __obj.updateDynamic("height")(height)
    if (id != null) __obj.updateDynamic("id")(id)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (timeoutInMilliseconds != null) __obj.updateDynamic("timeoutInMilliseconds")(timeoutInMilliseconds.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[EmbeddedOptions]
  }
}

