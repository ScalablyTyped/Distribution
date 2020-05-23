package typings.mochaPhantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaPhantomJSOptions extends js.Object {
  var cookies: js.UndefOr[js.Array[_]] = js.undefined
  var file: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var viewportSize: js.UndefOr[Double] = js.undefined
}

object MochaPhantomJSOptions {
  @scala.inline
  def apply(
    cookies: js.Array[_] = null,
    file: String = null,
    headers: js.Any = null,
    timeout: js.UndefOr[Double] = js.undefined,
    viewportSize: js.UndefOr[Double] = js.undefined
  ): MochaPhantomJSOptions = {
    val __obj = js.Dynamic.literal()
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportSize)) __obj.updateDynamic("viewportSize")(viewportSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaPhantomJSOptions]
  }
}

