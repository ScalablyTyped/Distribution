package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tarballurl extends js.Object {
  var commit: ShaUrl = js.native
  var name: String = js.native
  var tarball_url: String = js.native
  var zipball_url: String = js.native
}

object Tarballurl {
  @scala.inline
  def apply(commit: ShaUrl, name: String, tarball_url: String, zipball_url: String): Tarballurl = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tarball_url = tarball_url.asInstanceOf[js.Any], zipball_url = zipball_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tarballurl]
  }
  @scala.inline
  implicit class TarballurlOps[Self <: Tarballurl] (val x: Self) extends AnyVal {
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
    def setCommit(value: ShaUrl): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarball_url(value: String): Self = this.set("tarball_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setZipball_url(value: String): Self = this.set("zipball_url", value.asInstanceOf[js.Any])
  }
  
}

