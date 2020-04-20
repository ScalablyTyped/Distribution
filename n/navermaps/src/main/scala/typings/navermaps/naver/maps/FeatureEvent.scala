package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureEvent extends js.Object {
  var feature: Feature
}

object FeatureEvent {
  @scala.inline
  def apply(feature: Feature): FeatureEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureEvent]
  }
}

