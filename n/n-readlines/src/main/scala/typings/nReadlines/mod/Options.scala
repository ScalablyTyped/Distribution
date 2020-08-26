package typings.nReadlines.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var newLineCharacter: js.UndefOr[String] = js.native
  var readChunk: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setNewLineCharacter(value: String): Self = this.set("newLineCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewLineCharacter: Self = this.set("newLineCharacter", js.undefined)
    @scala.inline
    def setReadChunk(value: Double): Self = this.set("readChunk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadChunk: Self = this.set("readChunk", js.undefined)
  }
  
}

