package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBadge extends StObject {
  
  var __implements__sap_m_IBadge: Boolean
}
object IBadge {
  
  inline def apply(__implements__sap_m_IBadge: Boolean): IBadge = {
    val __obj = js.Dynamic.literal(__implements__sap_m_IBadge = __implements__sap_m_IBadge.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBadge]
  }
  
  extension [Self <: IBadge](x: Self) {
    
    inline def set__implements__sap_m_IBadge(value: Boolean): Self = StObject.set(x, "__implements__sap_m_IBadge", value.asInstanceOf[js.Any])
  }
}
