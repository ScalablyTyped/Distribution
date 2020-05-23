package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToneInfo extends js.Object {
  var sequenceId: js.UndefOr[Double] = js.undefined
  var tone: js.UndefOr[Tone] = js.undefined
}

object ToneInfo {
  @scala.inline
  def apply(sequenceId: js.UndefOr[Double] = js.undefined, tone: Tone = null): ToneInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sequenceId)) __obj.updateDynamic("sequenceId")(sequenceId.get.asInstanceOf[js.Any])
    if (tone != null) __obj.updateDynamic("tone")(tone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneInfo]
  }
}

