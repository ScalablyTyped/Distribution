package typings.naudiodon

import typings.naudiodon.mod.AudioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInOptions extends js.Object {
  var inOptions: AudioOptions
}

object AnonInOptions {
  @scala.inline
  def apply(inOptions: AudioOptions): AnonInOptions = {
    val __obj = js.Dynamic.literal(inOptions = inOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInOptions]
  }
}

