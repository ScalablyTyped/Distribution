package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidStep extends js.Object {
  var invalidStep: js.UndefOr[String] = js.native
  var maxMin: js.UndefOr[String] = js.native
  var noValue: js.UndefOr[String] = js.native
  var optionNum: js.UndefOr[String] = js.native
  var valueRange: js.UndefOr[String] = js.native
}

object InvalidStep {
  @scala.inline
  def apply(): InvalidStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidStep]
  }
  @scala.inline
  implicit class InvalidStepOps[Self <: InvalidStep] (val x: Self) extends AnyVal {
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
    def setInvalidStep(value: String): Self = this.set("invalidStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidStep: Self = this.set("invalidStep", js.undefined)
    @scala.inline
    def setMaxMin(value: String): Self = this.set("maxMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMin: Self = this.set("maxMin", js.undefined)
    @scala.inline
    def setNoValue(value: String): Self = this.set("noValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoValue: Self = this.set("noValue", js.undefined)
    @scala.inline
    def setOptionNum(value: String): Self = this.set("optionNum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionNum: Self = this.set("optionNum", js.undefined)
    @scala.inline
    def setValueRange(value: String): Self = this.set("valueRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueRange: Self = this.set("valueRange", js.undefined)
  }
  
}

