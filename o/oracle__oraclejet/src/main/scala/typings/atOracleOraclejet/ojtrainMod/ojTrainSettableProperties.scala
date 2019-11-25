package typings.atOracleOraclejet.ojtrainMod

import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typings.atOracleOraclejet.ojtrainMod.ojTrain.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTrainSettableProperties extends baseComponentSettableProperties {
  var selectedStep: String
  var steps: js.Array[Step]
}

object ojTrainSettableProperties {
  @scala.inline
  def apply(selectedStep: String, steps: js.Array[Step], translations: js.Object = null): ojTrainSettableProperties = {
    val __obj = js.Dynamic.literal(selectedStep = selectedStep.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTrainSettableProperties]
  }
}

