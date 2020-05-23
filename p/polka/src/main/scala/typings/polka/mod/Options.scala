package typings.polka.mod

import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Polka options
  */
trait Options extends js.Object {
  /**
    * A catch-all error handler; executed whenever a middleware throws an error.
    */
  var onError: js.UndefOr[
    js.Function4[/* err */ Error, /* req */ Request, /* res */ ServerResponse, /* next */ Next, Unit]
  ] = js.undefined
  /**
    * A handler when no route definitions were matched.
    */
  var onNoMatch: js.UndefOr[js.Function2[/* req */ Request, /* res */ ServerResponse, Unit]] = js.undefined
  /**
    * The server instance to use when `polka.listen()` is called.
    */
  var server: js.UndefOr[Server] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    onError: (/* err */ Error, /* req */ Request, /* res */ ServerResponse, /* next */ Next) => Unit = null,
    onNoMatch: (/* req */ Request, /* res */ ServerResponse) => Unit = null,
    server: Server = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction4(onError))
    if (onNoMatch != null) __obj.updateDynamic("onNoMatch")(js.Any.fromFunction2(onNoMatch))
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

