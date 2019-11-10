package typings.natsDashHemera.natsDashHemeraMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoderResult extends js.Object {
  var error: Error
  var value: js.Object
}

object DecoderResult {
  @scala.inline
  def apply(error: Error, value: js.Object): DecoderResult = {
    val __obj = js.Dynamic.literal(error = error, value = value)
  
    __obj.asInstanceOf[DecoderResult]
  }
}

