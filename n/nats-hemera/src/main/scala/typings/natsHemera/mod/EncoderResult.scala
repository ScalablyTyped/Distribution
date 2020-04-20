package typings.natsHemera.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncoderResult extends js.Object {
  var error: Error
  var value: String | Buffer
}

object EncoderResult {
  @scala.inline
  def apply(error: Error, value: String | Buffer): EncoderResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncoderResult]
  }
}

