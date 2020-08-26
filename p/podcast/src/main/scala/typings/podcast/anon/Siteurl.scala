package typings.podcast.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Siteurl extends js.Object {
  var site_url: String = js.native
}

object Siteurl {
  @scala.inline
  def apply(site_url: String): Siteurl = {
    val __obj = js.Dynamic.literal(site_url = site_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Siteurl]
  }
  @scala.inline
  implicit class SiteurlOps[Self <: Siteurl] (val x: Self) extends AnyVal {
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
    def setSite_url(value: String): Self = this.set("site_url", value.asInstanceOf[js.Any])
  }
  
}

