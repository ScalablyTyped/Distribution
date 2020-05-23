package typings.ngmap.angular.map

import typings.ngmap.anon.AnchorPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INgMapOptions extends js.Object {
  var marker: AnchorPoint
}

object INgMapOptions {
  @scala.inline
  def apply(marker: AnchorPoint): INgMapOptions = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[INgMapOptions]
  }
}

