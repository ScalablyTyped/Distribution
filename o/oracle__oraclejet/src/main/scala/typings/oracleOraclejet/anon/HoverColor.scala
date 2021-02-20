package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.inner
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.outer
import typings.oracleOraclejet.oracleOraclejetStrings.rotated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoverColor extends StObject {
  
  var borderColor: String = js.native
  
  var borderWidth: Double = js.native
  
  var hoverColor: String = js.native
  
  var labelDisplay: horizontal | rotated | off | auto = js.native
  
  var labelHalign: inner | outer | center = js.native
  
  var labelMinLength: Double = js.native
  
  var labelStyle: js.Object = js.native
  
  var selectedInnerColor: String = js.native
  
  var selectedOuterColor: String = js.native
  
  var showDisclosure: on | off = js.native
}
object HoverColor {
  
  @scala.inline
  def apply(
    borderColor: String,
    borderWidth: Double,
    hoverColor: String,
    labelDisplay: horizontal | rotated | off | auto,
    labelHalign: inner | outer | center,
    labelMinLength: Double,
    labelStyle: js.Object,
    selectedInnerColor: String,
    selectedOuterColor: String,
    showDisclosure: on | off
  ): HoverColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], hoverColor = hoverColor.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelMinLength = labelMinLength.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any], showDisclosure = showDisclosure.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverColor]
  }
  
  @scala.inline
  implicit class HoverColorMutableBuilder[Self <: HoverColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelDisplay(value: horizontal | rotated | off | auto): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHalign(value: inner | outer | center): Self = StObject.set(x, "labelHalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelMinLength(value: Double): Self = StObject.set(x, "labelMinLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedInnerColor(value: String): Self = StObject.set(x, "selectedInnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedOuterColor(value: String): Self = StObject.set(x, "selectedOuterColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDisclosure(value: on | off): Self = StObject.set(x, "showDisclosure", value.asInstanceOf[js.Any])
  }
}
