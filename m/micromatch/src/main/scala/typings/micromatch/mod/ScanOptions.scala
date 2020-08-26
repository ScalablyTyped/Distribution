package typings.micromatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanOptions extends Options {
  /**
    * When `true`, the returned object will include an array of strings representing each path "segment" in the scanned glob pattern.
    * This is automatically enabled when `options.tokens` is `true`.
    *
    * @default false
    */
  var parts: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, the returned object will include an array of `tokens` (objects), representing each path "segment" in the scanned glob pattern.
    *
    * @default false
    */
  var tokens: js.UndefOr[Boolean] = js.native
}

object ScanOptions {
  @scala.inline
  def apply(): ScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanOptions]
  }
  @scala.inline
  implicit class ScanOptionsOps[Self <: ScanOptions] (val x: Self) extends AnyVal {
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
    def setParts(value: Boolean): Self = this.set("parts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParts: Self = this.set("parts", js.undefined)
    @scala.inline
    def setTokens(value: Boolean): Self = this.set("tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
  }
  
}

