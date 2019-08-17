package typings.micro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object microMod {
  import typings.node.httpMod.IncomingMessage
  import typings.node.httpMod.ServerResponse

  type RequestHandler = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, js.Any]
}
