package typings.naudiodon.anon

import typings.naudiodon.mod.AudioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InOptions extends js.Object {
  var inOptions: AudioOptions = js.native
}

object InOptions {
  @scala.inline
  def apply(inOptions: AudioOptions): InOptions = {
    val __obj = js.Dynamic.literal(inOptions = inOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InOptions]
  }
  @scala.inline
  implicit class InOptionsOps[Self <: InOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInOptions(value: AudioOptions): Self = this.set("inOptions", value.asInstanceOf[js.Any])
  }
  
}

