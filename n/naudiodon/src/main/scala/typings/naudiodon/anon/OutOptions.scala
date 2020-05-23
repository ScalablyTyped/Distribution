package typings.naudiodon.anon

import typings.naudiodon.mod.AudioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutOptions extends js.Object {
  var outOptions: AudioOptions
}

object OutOptions {
  @scala.inline
  def apply(outOptions: AudioOptions): OutOptions = {
    val __obj = js.Dynamic.literal(outOptions = outOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutOptions]
  }
}

