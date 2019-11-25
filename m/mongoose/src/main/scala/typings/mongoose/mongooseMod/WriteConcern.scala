package typings.mongoose.mongooseMod

import typings.mongoose.mongooseStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteConcern extends js.Object {
  var j: js.UndefOr[Boolean] = js.undefined
  var w: js.UndefOr[Double | majority | TagSet] = js.undefined
  var wtimeout: js.UndefOr[Double] = js.undefined
}

object WriteConcern {
  @scala.inline
  def apply(
    j: js.UndefOr[Boolean] = js.undefined,
    w: Double | majority | TagSet = null,
    wtimeout: Int | Double = null
  ): WriteConcern = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteConcern]
  }
}

