package typings.naudiodon.anon

import typings.naudiodon.mod.AudioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InOptions extends js.Object {
  var inOptions: AudioOptions
}

object InOptions {
  @scala.inline
  def apply(inOptions: AudioOptions): InOptions = {
    val __obj = js.Dynamic.literal(inOptions = inOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InOptions]
  }
}

