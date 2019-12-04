package typings.openpgp

import typings.openpgp.openpgpMod.NodeStream
import typings.openpgp.openpgpMod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataNodeStream extends js.Object {
  var data: String | ReadableStream[String] | NodeStream
}

object Anon_DataNodeStream {
  @scala.inline
  def apply(data: String | ReadableStream[String] | NodeStream): Anon_DataNodeStream = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataNodeStream]
  }
}

