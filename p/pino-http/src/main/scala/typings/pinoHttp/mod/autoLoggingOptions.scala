package typings.pinoHttp.mod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait autoLoggingOptions extends js.Object {
  var getPath: js.UndefOr[js.Function1[/* req */ IncomingMessage, js.UndefOr[String]]] = js.undefined
  var ignorePaths: js.UndefOr[js.Array[String]] = js.undefined
}

object autoLoggingOptions {
  @scala.inline
  def apply(
    getPath: /* req */ IncomingMessage => js.UndefOr[String] = null,
    ignorePaths: js.Array[String] = null
  ): autoLoggingOptions = {
    val __obj = js.Dynamic.literal()
    if (getPath != null) __obj.updateDynamic("getPath")(js.Any.fromFunction1(getPath))
    if (ignorePaths != null) __obj.updateDynamic("ignorePaths")(ignorePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[autoLoggingOptions]
  }
}

