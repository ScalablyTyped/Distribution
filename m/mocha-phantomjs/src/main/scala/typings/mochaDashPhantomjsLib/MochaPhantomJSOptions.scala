package typings
package mochaDashPhantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaPhantomJSOptions extends js.Object {
  var cookies: js.UndefOr[js.Array[_]] = js.undefined
  var file: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var viewportSize: js.UndefOr[scala.Double] = js.undefined
}

object MochaPhantomJSOptions {
  @scala.inline
  def apply(
    cookies: js.Array[_] = null,
    file: java.lang.String = null,
    headers: js.Any = null,
    timeout: scala.Int | scala.Double = null,
    viewportSize: scala.Int | scala.Double = null
  ): MochaPhantomJSOptions = {
    val __obj = js.Dynamic.literal()
    if (cookies != null) __obj.updateDynamic("cookies")(cookies)
    if (file != null) __obj.updateDynamic("file")(file)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (viewportSize != null) __obj.updateDynamic("viewportSize")(viewportSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaPhantomJSOptions]
  }
}

