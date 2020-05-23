package typings.oracleOraclejet.ojtrainMod

import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojtrainMod.ojTrain.Step
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
    val __obj = js.Dynamic.literal(selectedStep = selectedStep.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTrainSettableProperties]
  }
}

