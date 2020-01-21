package typings.nodeGeocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfidence extends js.Object {
  var confidence: js.UndefOr[Double] = js.undefined
  var googlePlaceId: js.UndefOr[String] = js.undefined
}

object AnonConfidence {
  @scala.inline
  def apply(confidence: Int | Double = null, googlePlaceId: String = null): AnonConfidence = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (googlePlaceId != null) __obj.updateDynamic("googlePlaceId")(googlePlaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfidence]
  }
}

