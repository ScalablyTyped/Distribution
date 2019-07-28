package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxTimeMSNumber extends js.Object {
  var maxTimeMS: js.UndefOr[Double] = js.undefined
}

object Anon_MaxTimeMSNumber {
  @scala.inline
  def apply(maxTimeMS: Int | Double = null): Anon_MaxTimeMSNumber = {
    val __obj = js.Dynamic.literal()
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxTimeMSNumber]
  }
}

