package typings.morgan.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("morgan", "format")
@js.native
object format extends js.Object {
  /**
    * Define a named custom format by specifying a format string in token
    * notation.
    */
  // tslint:disable-next-line
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](name: String, fmt: String): Morgan[Request, Response] = js.native
  /**
    * Define a named custom format by specifying a format function.
    */
  def apply[Request /* <: IncomingMessage */, Response /* <: ServerResponse */](name: String, fmt: FormatFn[Request, Response]): Morgan[Request, Response] = js.native
}

