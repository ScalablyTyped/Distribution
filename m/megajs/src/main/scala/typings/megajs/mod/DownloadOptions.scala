package typings.megajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadOptions extends js.Object {
  var chunkSizeIncrement: js.UndefOr[Double] = js.native
  var end: js.UndefOr[js.Any] = js.native
  var initialChunkSize: js.UndefOr[Double] = js.native
  var maxChunkSize: js.UndefOr[Double] = js.native
  var maxConnections: js.UndefOr[Double] = js.native
  var returnCiphertext: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[js.Any] = js.native
}

object DownloadOptions {
  @scala.inline
  def apply(): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadOptions]
  }
  @scala.inline
  implicit class DownloadOptionsOps[Self <: DownloadOptions] (val x: Self) extends AnyVal {
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
    def setChunkSizeIncrement(value: Double): Self = this.set("chunkSizeIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkSizeIncrement: Self = this.set("chunkSizeIncrement", js.undefined)
    @scala.inline
    def setEnd(value: js.Any): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setInitialChunkSize(value: Double): Self = this.set("initialChunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialChunkSize: Self = this.set("initialChunkSize", js.undefined)
    @scala.inline
    def setMaxChunkSize(value: Double): Self = this.set("maxChunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxChunkSize: Self = this.set("maxChunkSize", js.undefined)
    @scala.inline
    def setMaxConnections(value: Double): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConnections: Self = this.set("maxConnections", js.undefined)
    @scala.inline
    def setReturnCiphertext(value: Boolean): Self = this.set("returnCiphertext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnCiphertext: Self = this.set("returnCiphertext", js.undefined)
    @scala.inline
    def setStart(value: js.Any): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

