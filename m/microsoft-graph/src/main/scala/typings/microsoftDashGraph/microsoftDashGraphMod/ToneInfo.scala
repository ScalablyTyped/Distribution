package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToneInfo extends js.Object {
  var sequenceId: js.UndefOr[Double] = js.undefined
  var tone: js.UndefOr[Tone] = js.undefined
}

object ToneInfo {
  @scala.inline
  def apply(sequenceId: Int | Double = null, tone: Tone = null): ToneInfo = {
    val __obj = js.Dynamic.literal()
    if (sequenceId != null) __obj.updateDynamic("sequenceId")(sequenceId.asInstanceOf[js.Any])
    if (tone != null) __obj.updateDynamic("tone")(tone)
    __obj.asInstanceOf[ToneInfo]
  }
}

