package typings.openpgp

import typings.openpgp.mod.NodeStream
import typings.openpgp.mod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataNodeStream extends js.Object {
  var data: String | ReadableStream[String] | NodeStream
}

object AnonDataNodeStream {
  @scala.inline
  def apply(data: String | ReadableStream[String] | NodeStream): AnonDataNodeStream = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataNodeStream]
  }
}

