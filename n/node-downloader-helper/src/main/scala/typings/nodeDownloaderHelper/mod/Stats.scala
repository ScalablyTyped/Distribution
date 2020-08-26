package typings.nodeDownloaderHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
   // name of file
  var downloaded: Double = js.native
   // total size that needs to be downloaded in bytes
  var name: String = js.native
   // downloaded size in bytes
  var progress: Double = js.native
   // progress porcentage 0-100%
  var speed: Double = js.native
  var total: Double = js.native
}

object Stats {
  @scala.inline
  def apply(downloaded: Double, name: String, progress: Double, speed: Double, total: Double): Stats = {
    val __obj = js.Dynamic.literal(downloaded = downloaded.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
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
    def setDownloaded(value: Double): Self = this.set("downloaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

