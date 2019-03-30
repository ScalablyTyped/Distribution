package typings
package nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
   // total size that needs to be downloaded in bytes
  var downloaded: scala.Double
   // downloaded size in bytes
  var progress: scala.Double
   // progress porcentage 0-100%
  var speed: scala.Double
  var total: scala.Double
}

object Stats {
  @scala.inline
  def apply(downloaded: scala.Double, progress: scala.Double, speed: scala.Double, total: scala.Double): Stats = {
    val __obj = js.Dynamic.literal(downloaded = downloaded, progress = progress, speed = speed, total = total)
  
    __obj.asInstanceOf[Stats]
  }
}

