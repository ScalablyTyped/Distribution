package typings.oracleOraclejet.ojtrainMod

import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojtrainMod.ojTrain.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojTrainSettableProperties extends baseComponentSettableProperties {
  
  var selectedStep: String = js.native
  
  var steps: js.Array[Step] = js.native
}
object ojTrainSettableProperties {
  
  @scala.inline
  def apply(selectedStep: String, steps: js.Array[Step]): ojTrainSettableProperties = {
    val __obj = js.Dynamic.literal(selectedStep = selectedStep.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTrainSettableProperties]
  }
  
  @scala.inline
  implicit class ojTrainSettablePropertiesOps[Self <: ojTrainSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSelectedStep(value: String): Self = this.set("selectedStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: Step*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[Step]): Self = this.set("steps", value.asInstanceOf[js.Any])
  }
}
