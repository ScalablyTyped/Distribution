package typings.modernizr

import typings.std.Boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssColumnsBoolean extends Boolean {
  var breakafter: scala.Boolean = js.native
  var breakbefore: scala.Boolean = js.native
  var breakinside: scala.Boolean = js.native
  var fill: scala.Boolean = js.native
  var gap: scala.Boolean = js.native
  var rule: scala.Boolean = js.native
  var rulecolor: scala.Boolean = js.native
  var rulestyle: scala.Boolean = js.native
  var rulewidth: scala.Boolean = js.native
  var span: scala.Boolean = js.native
  var width: scala.Boolean = js.native
}

object CssColumnsBoolean {
  @scala.inline
  def apply(
    breakafter: scala.Boolean,
    breakbefore: scala.Boolean,
    breakinside: scala.Boolean,
    fill: scala.Boolean,
    gap: scala.Boolean,
    rule: scala.Boolean,
    rulecolor: scala.Boolean,
    rulestyle: scala.Boolean,
    rulewidth: scala.Boolean,
    span: scala.Boolean,
    width: scala.Boolean
  ): CssColumnsBoolean = {
    val __obj = js.Dynamic.literal(breakafter = breakafter.asInstanceOf[js.Any], breakbefore = breakbefore.asInstanceOf[js.Any], breakinside = breakinside.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], rulecolor = rulecolor.asInstanceOf[js.Any], rulestyle = rulestyle.asInstanceOf[js.Any], rulewidth = rulewidth.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssColumnsBoolean]
  }
  @scala.inline
  implicit class CssColumnsBooleanOps[Self <: CssColumnsBoolean] (val x: Self) extends AnyVal {
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
    def setBreakafter(value: scala.Boolean): Self = this.set("breakafter", value.asInstanceOf[js.Any])
    @scala.inline
    def setBreakbefore(value: scala.Boolean): Self = this.set("breakbefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setBreakinside(value: scala.Boolean): Self = this.set("breakinside", value.asInstanceOf[js.Any])
    @scala.inline
    def setFill(value: scala.Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setGap(value: scala.Boolean): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule(value: scala.Boolean): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulecolor(value: scala.Boolean): Self = this.set("rulecolor", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulestyle(value: scala.Boolean): Self = this.set("rulestyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulewidth(value: scala.Boolean): Self = this.set("rulewidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpan(value: scala.Boolean): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: scala.Boolean): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

