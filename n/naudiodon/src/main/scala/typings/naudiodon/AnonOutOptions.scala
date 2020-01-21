package typings.naudiodon

import typings.naudiodon.mod.AudioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOutOptions extends js.Object {
  var outOptions: AudioOptions
}

object AnonOutOptions {
  @scala.inline
  def apply(outOptions: AudioOptions): AnonOutOptions = {
    val __obj = js.Dynamic.literal(outOptions = outOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOutOptions]
  }
}

