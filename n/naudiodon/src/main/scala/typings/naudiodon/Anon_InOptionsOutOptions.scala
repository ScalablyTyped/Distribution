package typings.naudiodon

import typings.naudiodon.naudiodonMod.AudioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InOptionsOutOptions extends js.Object {
  var inOptions: AudioOptions
  var outOptions: AudioOptions
}

object Anon_InOptionsOutOptions {
  @scala.inline
  def apply(inOptions: AudioOptions, outOptions: AudioOptions): Anon_InOptionsOutOptions = {
    val __obj = js.Dynamic.literal(inOptions = inOptions.asInstanceOf[js.Any], outOptions = outOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_InOptionsOutOptions]
  }
}

