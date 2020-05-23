package typings.playerframework.PlayerFramework.Advertising

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MidrollAdvertisement extends AdvertisementBase {
  var time: Double
  var timePercentage: Double
}

object MidrollAdvertisement {
  @scala.inline
  def apply(source: js.Any, time: Double, timePercentage: Double): MidrollAdvertisement = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timePercentage = timePercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidrollAdvertisement]
  }
}

