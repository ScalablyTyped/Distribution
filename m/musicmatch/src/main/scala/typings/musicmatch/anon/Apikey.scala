package typings.musicmatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apikey extends js.Object {
  var apikey: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
}

object Apikey {
  @scala.inline
  def apply(): Apikey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apikey]
  }
  @scala.inline
  implicit class ApikeyOps[Self <: Apikey] (val x: Self) extends AnyVal {
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
    def setApikey(value: String): Self = this.set("apikey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApikey: Self = this.set("apikey", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

