package typings
package modernizrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssColumnsBoolean
  extends stdLib.Boolean {
  var breakafter: scala.Boolean
  var breakbefore: scala.Boolean
  var breakinside: scala.Boolean
  var fill: scala.Boolean
  var gap: scala.Boolean
  var rule: scala.Boolean
  var rulecolor: scala.Boolean
  var rulestyle: scala.Boolean
  var rulewidth: scala.Boolean
  var span: scala.Boolean
  var width: scala.Boolean
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("breakafter")(breakafter)
    __obj.updateDynamic("breakbefore")(breakbefore)
    __obj.updateDynamic("breakinside")(breakinside)
    __obj.updateDynamic("fill")(fill)
    __obj.updateDynamic("gap")(gap)
    __obj.updateDynamic("rule")(rule)
    __obj.updateDynamic("rulecolor")(rulecolor)
    __obj.updateDynamic("rulestyle")(rulestyle)
    __obj.updateDynamic("rulewidth")(rulewidth)
    __obj.updateDynamic("span")(span)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[CssColumnsBoolean]
  }
}

