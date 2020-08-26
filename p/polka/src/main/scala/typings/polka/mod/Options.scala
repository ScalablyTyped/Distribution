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
@js.native
trait Options extends js.Object {
  /**
    * A catch-all error handler; executed whenever a middleware throws an error.
    */
  var onError: js.UndefOr[
    js.Function4[/* err */ Error, /* req */ Request, /* res */ ServerResponse, /* next */ Next, Unit]
  ] = js.native
  /**
    * A handler when no route definitions were matched.
    */
  var onNoMatch: js.UndefOr[js.Function2[/* req */ Request, /* res */ ServerResponse, Unit]] = js.native
  /**
    * The server instance to use when `polka.listen()` is called.
    */
  var server: js.UndefOr[Server] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnError(value: (/* err */ Error, /* req */ Request, /* res */ ServerResponse, /* next */ Next) => Unit): Self = this.set("onError", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnNoMatch(value: (/* req */ Request, /* res */ ServerResponse) => Unit): Self = this.set("onNoMatch", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnNoMatch: Self = this.set("onNoMatch", js.undefined)
    @scala.inline
    def setServer(value: Server): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
  
}

