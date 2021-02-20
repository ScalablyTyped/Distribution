package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icon extends StObject {
  
  var icon: BorderRadius = js.native
  
  var labelStyle: js.Object = js.native
  
  var showDisclosure: off | on = js.native
}
object Icon {
  
  @scala.inline
  def apply(icon: BorderRadius, labelStyle: js.Object, showDisclosure: off | on): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], showDisclosure = showDisclosure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: BorderRadius): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDisclosure(value: off | on): Self = StObject.set(x, "showDisclosure", value.asInstanceOf[js.Any])
  }
}
