package typings.naudiodon

import typings.naudiodon.mod.AudioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInOptionsOutOptions extends js.Object {
  var inOptions: AudioOptions
  var outOptions: AudioOptions
}

object AnonInOptionsOutOptions {
  @scala.inline
  def apply(inOptions: AudioOptions, outOptions: AudioOptions): AnonInOptionsOutOptions = {
    val __obj = js.Dynamic.literal(inOptions = inOptions.asInstanceOf[js.Any], outOptions = outOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInOptionsOutOptions]
  }
}

