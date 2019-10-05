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
    val __obj = js.Dynamic.literal(selectedStep = selectedStep, steps = steps)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojTrainSettableProperties]
  }
}

