package typings.modernizr

import typings.std.Boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssColumnsBoolean
  extends StObject
     with Boolean {
  
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
    val __obj = js.Dynamic.literal(breakafter = breakafter.asInstanceOf[js.Any], breakbefore = breakbefore.asInstanceOf[js.Any], breakinside = breakinside.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], rulecolor = rulecolor.asInstanceOf[js.Any], rulestyle = rulestyle.asInstanceOf[js.Any], rulewidth = rulewidth.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssColumnsBoolean]
  }
  
  @scala.inline
  implicit class CssColumnsBooleanMutableBuilder[Self <: CssColumnsBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakafter(value: scala.Boolean): Self = StObject.set(x, "breakafter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakbefore(value: scala.Boolean): Self = StObject.set(x, "breakbefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakinside(value: scala.Boolean): Self = StObject.set(x, "breakinside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: scala.Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGap(value: scala.Boolean): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: scala.Boolean): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulecolor(value: scala.Boolean): Self = StObject.set(x, "rulecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulestyle(value: scala.Boolean): Self = StObject.set(x, "rulestyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulewidth(value: scala.Boolean): Self = StObject.set(x, "rulewidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpan(value: scala.Boolean): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: scala.Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
