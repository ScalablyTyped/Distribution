package typings.postmark.distClientModelsBouncesBounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BounceMetric extends js.Object {
  var Count: Double
  var Name: String
  var Type: js.UndefOr[String] = js.undefined
}

object BounceMetric {
  @scala.inline
  def apply(Count: Double, Name: String, Type: String = null): BounceMetric = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceMetric]
  }
}

