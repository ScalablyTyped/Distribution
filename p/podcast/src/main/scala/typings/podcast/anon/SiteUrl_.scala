package typings.podcast.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiteUrl_ extends js.Object {
  var siteUrl: String = js.native
}

object SiteUrl_ {
  @scala.inline
  def apply(siteUrl: String): SiteUrl_ = {
    val __obj = js.Dynamic.literal(siteUrl = siteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteUrl_]
  }
  @scala.inline
  implicit class SiteUrl_Ops[Self <: SiteUrl_] (val x: Self) extends AnyVal {
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
    def setSiteUrl(value: String): Self = this.set("siteUrl", value.asInstanceOf[js.Any])
  }
  
}

