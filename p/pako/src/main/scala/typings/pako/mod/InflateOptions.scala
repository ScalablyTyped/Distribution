package typings.pako.mod

import typings.pako.pakoStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InflateOptions extends js.Object {
  var chunkSize: js.UndefOr[Double] = js.native
  var dictionary: js.UndefOr[js.Any] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var to: js.UndefOr[string] = js.native
  var windowBits: js.UndefOr[Double] = js.native
}

object InflateOptions {
  @scala.inline
  def apply(): InflateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InflateOptions]
  }
  @scala.inline
  implicit class InflateOptionsOps[Self <: InflateOptions] (val x: Self) extends AnyVal {
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
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    @scala.inline
    def setDictionary(value: js.Any): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDictionary: Self = this.set("dictionary", js.undefined)
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setTo(value: string): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setWindowBits(value: Double): Self = this.set("windowBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowBits: Self = this.set("windowBits", js.undefined)
  }
  
}

