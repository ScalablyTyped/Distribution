package typings.nodeDownloaderHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
   // total size that needs to be downloaded in bytes
  var downloaded: Double
   // downloaded size in bytes
  var progress: Double
   // progress porcentage 0-100%
  var speed: Double
  var total: Double
}

object Stats {
  @scala.inline
  def apply(downloaded: Double, progress: Double, speed: Double, total: Double): Stats = {
    val __obj = js.Dynamic.literal(downloaded = downloaded.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

