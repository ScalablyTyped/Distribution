package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBar extends StObject {
  
  var __implements__sap_m_IBar: Boolean
}
object IBar {
  
  inline def apply(__implements__sap_m_IBar: Boolean): IBar = {
    val __obj = js.Dynamic.literal(__implements__sap_m_IBar = __implements__sap_m_IBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBar]
  }
  
  extension [Self <: IBar](x: Self) {
    
    inline def set__implements__sap_m_IBar(value: Boolean): Self = StObject.set(x, "__implements__sap_m_IBar", value.asInstanceOf[js.Any])
  }
}
