package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.dashed
import typings.oracleOraclejet.oracleOraclejetStrings.dotted
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaselineColor extends StObject {
  
  var baselineColor: inherit | auto = js.native
  
  var baselineStyle: dotted | dashed | solid = js.native
  
  var baselineWidth: Double = js.native
  
  var lineColor: String = js.native
  
  var lineStyle: dotted | dashed | solid = js.native
  
  var lineWidth: Double = js.native
  
  var rendered: on | off | auto = js.native
}
object BaselineColor {
  
  @scala.inline
  def apply(
    baselineColor: inherit | auto,
    baselineStyle: dotted | dashed | solid,
    baselineWidth: Double,
    lineColor: String,
    lineStyle: dotted | dashed | solid,
    lineWidth: Double,
    rendered: on | off | auto
  ): BaselineColor = {
    val __obj = js.Dynamic.literal(baselineColor = baselineColor.asInstanceOf[js.Any], baselineStyle = baselineStyle.asInstanceOf[js.Any], baselineWidth = baselineWidth.asInstanceOf[js.Any], lineColor = lineColor.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaselineColor]
  }
  
  @scala.inline
  implicit class BaselineColorMutableBuilder[Self <: BaselineColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineColor(value: inherit | auto): Self = StObject.set(x, "baselineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineStyle(value: dotted | dashed | solid): Self = StObject.set(x, "baselineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineWidth(value: Double): Self = StObject.set(x, "baselineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyle(value: dotted | dashed | solid): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendered(value: on | off | auto): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
  }
}
