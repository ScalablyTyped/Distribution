package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteConcern extends js.Object {
  var j: js.UndefOr[scala.Boolean] = js.undefined
  var w: js.UndefOr[scala.Double | mongooseLib.mongooseLibStrings.majority | TagSet] = js.undefined
  var wtimeout: js.UndefOr[scala.Double] = js.undefined
}

object WriteConcern {
  @scala.inline
  def apply(
    j: js.UndefOr[scala.Boolean] = js.undefined,
    w: scala.Double | mongooseLib.mongooseLibStrings.majority | TagSet = null,
    wtimeout: scala.Int | scala.Double = null
  ): WriteConcern = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteConcern]
  }
}

