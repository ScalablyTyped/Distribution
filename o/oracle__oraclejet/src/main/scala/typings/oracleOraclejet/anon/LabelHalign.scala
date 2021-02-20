package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelHalign extends StObject {
  
  var labelHalign: center | end | start = js.native
  
  var labelStyle: js.Object = js.native
  
  var maximizedSvgStyle: js.Object = js.native
  
  var minimizedSvgStyle: js.Object = js.native
  
  var showCount: on | off | auto = js.native
  
  var svgStyle: js.Object = js.native
}
object LabelHalign {
  
  @scala.inline
  def apply(
    labelHalign: center | end | start,
    labelStyle: js.Object,
    maximizedSvgStyle: js.Object,
    minimizedSvgStyle: js.Object,
    showCount: on | off | auto,
    svgStyle: js.Object
  ): LabelHalign = {
    val __obj = js.Dynamic.literal(labelHalign = labelHalign.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], maximizedSvgStyle = maximizedSvgStyle.asInstanceOf[js.Any], minimizedSvgStyle = minimizedSvgStyle.asInstanceOf[js.Any], showCount = showCount.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelHalign]
  }
  
  @scala.inline
  implicit class LabelHalignMutableBuilder[Self <: LabelHalign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelHalign(value: center | end | start): Self = StObject.set(x, "labelHalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximizedSvgStyle(value: js.Object): Self = StObject.set(x, "maximizedSvgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimizedSvgStyle(value: js.Object): Self = StObject.set(x, "minimizedSvgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCount(value: on | off | auto): Self = StObject.set(x, "showCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
  }
}
