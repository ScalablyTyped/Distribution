package typings.navermaps.naver.maps.drawing

import typings.navermaps.naver.maps.CircleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlPointOptions_ extends js.Object {
  var anchorPointOptions: CircleOptions
  var midPointOptions: CircleOptions
}

object ControlPointOptions_ {
  @scala.inline
  def apply(anchorPointOptions: CircleOptions, midPointOptions: CircleOptions): ControlPointOptions_ = {
    val __obj = js.Dynamic.literal(anchorPointOptions = anchorPointOptions.asInstanceOf[js.Any], midPointOptions = midPointOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ControlPointOptions_]
  }
}

