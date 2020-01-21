package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxTimeMSNumber extends js.Object {
  var maxTimeMS: js.UndefOr[Double] = js.undefined
}

object AnonMaxTimeMSNumber {
  @scala.inline
  def apply(maxTimeMS: Int | Double = null): AnonMaxTimeMSNumber = {
    val __obj = js.Dynamic.literal()
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxTimeMSNumber]
  }
}

