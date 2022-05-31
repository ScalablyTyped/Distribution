package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultRootLabel extends StObject {
  
  var defaultRootLabel: js.UndefOr[String] = js.undefined
  
  var hierMenuBtnLabel: js.UndefOr[String] = js.undefined
  
  var previousIcon: js.UndefOr[String] = js.undefined
}
object DefaultRootLabel {
  
  inline def apply(): DefaultRootLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRootLabel]
  }
  
  extension [Self <: DefaultRootLabel](x: Self) {
    
    inline def setDefaultRootLabel(value: String): Self = StObject.set(x, "defaultRootLabel", value.asInstanceOf[js.Any])
    
    inline def setDefaultRootLabelUndefined: Self = StObject.set(x, "defaultRootLabel", js.undefined)
    
    inline def setHierMenuBtnLabel(value: String): Self = StObject.set(x, "hierMenuBtnLabel", value.asInstanceOf[js.Any])
    
    inline def setHierMenuBtnLabelUndefined: Self = StObject.set(x, "hierMenuBtnLabel", js.undefined)
    
    inline def setPreviousIcon(value: String): Self = StObject.set(x, "previousIcon", value.asInstanceOf[js.Any])
    
    inline def setPreviousIconUndefined: Self = StObject.set(x, "previousIcon", js.undefined)
  }
}
