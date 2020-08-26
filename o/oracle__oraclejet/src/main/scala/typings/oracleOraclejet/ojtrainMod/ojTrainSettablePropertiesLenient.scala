package typings.oracleOraclejet.ojtrainMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojtrainMod.ojTrain.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtrain.ojTrainSettableProperties> */
@js.native
trait ojTrainSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var selectedStep: js.UndefOr[String] = js.native
  var steps: js.UndefOr[js.Array[Step]] = js.native
  var translations: js.UndefOr[js.Object | Null] = js.native
}

object ojTrainSettablePropertiesLenient {
  @scala.inline
  def apply(): ojTrainSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojTrainSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojTrainSettablePropertiesLenientOps[Self <: ojTrainSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def deleteSelectedStep: Self = this.set("selectedStep", js.undefined)
    @scala.inline
    def setStepsVarargs(value: Step*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[Step]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    @scala.inline
    def setTranslations(value: js.Object): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setTranslationsNull: Self = this.set("translations", null)
  }
  
}

