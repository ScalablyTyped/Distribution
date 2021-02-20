package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedInnerColor extends StObject {
  
  var borderColor: js.UndefOr[String] = js.native
  
  var hoverColor: js.UndefOr[String] = js.native
  
  var selectedInnerColor: js.UndefOr[String] = js.native
  
  var selectedOuterColor: js.UndefOr[String] = js.native
}
object SelectedInnerColor {
  
  @scala.inline
  def apply(): SelectedInnerColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedInnerColor]
  }
  
  @scala.inline
  implicit class SelectedInnerColorMutableBuilder[Self <: SelectedInnerColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
    
    @scala.inline
    def setSelectedInnerColor(value: String): Self = StObject.set(x, "selectedInnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedInnerColorUndefined: Self = StObject.set(x, "selectedInnerColor", js.undefined)
    
    @scala.inline
    def setSelectedOuterColor(value: String): Self = StObject.set(x, "selectedOuterColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedOuterColorUndefined: Self = StObject.set(x, "selectedOuterColor", js.undefined)
  }
}
