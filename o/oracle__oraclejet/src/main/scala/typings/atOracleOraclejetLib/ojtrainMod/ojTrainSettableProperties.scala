package typings
package atOracleOraclejetLib.ojtrainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTrainSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var selectedStep: java.lang.String
  var steps: js.Array[atOracleOraclejetLib.ojtrainMod.ojTrainNs.Step]
}

object ojTrainSettableProperties {
  @scala.inline
  def apply(
    selectedStep: java.lang.String,
    steps: js.Array[atOracleOraclejetLib.ojtrainMod.ojTrainNs.Step],
    translations: js.Object = null
  ): ojTrainSettableProperties = {
    val __obj = js.Dynamic.literal(selectedStep = selectedStep, steps = steps)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojTrainSettableProperties]
  }
}

