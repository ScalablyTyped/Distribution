package typings.pinoHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait autoLoggingOptions extends js.Object {
  var ignorePaths: js.UndefOr[js.Array[String]] = js.undefined
}

object autoLoggingOptions {
  @scala.inline
  def apply(ignorePaths: js.Array[String] = null): autoLoggingOptions = {
    val __obj = js.Dynamic.literal()
    if (ignorePaths != null) __obj.updateDynamic("ignorePaths")(ignorePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[autoLoggingOptions]
  }
}

