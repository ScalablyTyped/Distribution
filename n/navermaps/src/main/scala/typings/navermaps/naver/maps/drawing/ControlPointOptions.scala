package typings.navermaps.naver.maps.drawing

import typings.navermaps.naver.maps.CircleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlPointOptions extends js.Object {
  var anchorPointOptions: CircleOptions
  var midPointOptions: CircleOptions
}

object ControlPointOptions {
  @scala.inline
  def apply(anchorPointOptions: CircleOptions, midPointOptions: CircleOptions): ControlPointOptions = {
    val __obj = js.Dynamic.literal(anchorPointOptions = anchorPointOptions.asInstanceOf[js.Any], midPointOptions = midPointOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ControlPointOptions]
  }
}

