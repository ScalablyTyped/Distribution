package typings.nodeGeocoder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Confidence extends js.Object {
  var confidence: js.UndefOr[Double] = js.undefined
  var googlePlaceId: js.UndefOr[String] = js.undefined
}

object Confidence {
  @scala.inline
  def apply(confidence: js.UndefOr[Double] = js.undefined, googlePlaceId: String = null): Confidence = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    if (googlePlaceId != null) __obj.updateDynamic("googlePlaceId")(googlePlaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confidence]
  }
}

