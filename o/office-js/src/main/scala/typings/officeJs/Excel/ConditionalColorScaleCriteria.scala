package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the criteria of the color scale.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalColorScaleCriteria extends js.Object {
  /**
    *
    * The maximum point Color Scale Criterion.
    *
    * [Api set: ExcelApi 1.6]
    */
  var maximum: ConditionalColorScaleCriterion = js.native
  /**
    *
    * The midpoint Color Scale Criterion if the color scale is a 3-color scale.
    *
    * [Api set: ExcelApi 1.6]
    */
  var midpoint: js.UndefOr[ConditionalColorScaleCriterion] = js.native
  /**
    *
    * The minimum point Color Scale Criterion.
    *
    * [Api set: ExcelApi 1.6]
    */
  var minimum: ConditionalColorScaleCriterion = js.native
}

object ConditionalColorScaleCriteria {
  @scala.inline
  def apply(maximum: ConditionalColorScaleCriterion, minimum: ConditionalColorScaleCriterion): ConditionalColorScaleCriteria = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalColorScaleCriteria]
  }
  @scala.inline
  implicit class ConditionalColorScaleCriteriaOps[Self <: ConditionalColorScaleCriteria] (val x: Self) extends AnyVal {
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
    def setMaximum(value: ConditionalColorScaleCriterion): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimum(value: ConditionalColorScaleCriterion): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def setMidpoint(value: ConditionalColorScaleCriterion): Self = this.set("midpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMidpoint: Self = this.set("midpoint", js.undefined)
  }
  
}

