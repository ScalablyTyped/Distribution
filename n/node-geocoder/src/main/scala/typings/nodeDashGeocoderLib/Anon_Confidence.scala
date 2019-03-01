package typings
package nodeDashGeocoderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Confidence extends js.Object {
  var confidence: js.UndefOr[scala.Double] = js.undefined
  var googlePlaceId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Confidence {
  @scala.inline
  def apply(confidence: scala.Int | scala.Double = null, googlePlaceId: java.lang.String = null): Anon_Confidence = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (googlePlaceId != null) __obj.updateDynamic("googlePlaceId")(googlePlaceId)
    __obj.asInstanceOf[Anon_Confidence]
  }
}

