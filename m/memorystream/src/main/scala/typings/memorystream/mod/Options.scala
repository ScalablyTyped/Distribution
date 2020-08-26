package typings.memorystream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var bufoverflow: Double = js.native
  var frequence: Double = js.native
  var maxbufsize: Double = js.native
  var readable: Boolean = js.native
  var writeable: Boolean = js.native
}

object Options {
  @scala.inline
  def apply(bufoverflow: Double, frequence: Double, maxbufsize: Double, readable: Boolean, writeable: Boolean): Options = {
    val __obj = js.Dynamic.literal(bufoverflow = bufoverflow.asInstanceOf[js.Any], frequence = frequence.asInstanceOf[js.Any], maxbufsize = maxbufsize.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writeable = writeable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBufoverflow(value: Double): Self = this.set("bufoverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrequence(value: Double): Self = this.set("frequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxbufsize(value: Double): Self = this.set("maxbufsize", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadable(value: Boolean): Self = this.set("readable", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriteable(value: Boolean): Self = this.set("writeable", value.asInstanceOf[js.Any])
  }
  
}

