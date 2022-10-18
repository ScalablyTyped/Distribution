package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectHeaderContainer extends StObject {
  
  var __implements__sap_m_ObjectHeaderContainer: Boolean
}
object ObjectHeaderContainer {
  
  inline def apply(__implements__sap_m_ObjectHeaderContainer: Boolean): ObjectHeaderContainer = {
    val __obj = js.Dynamic.literal(__implements__sap_m_ObjectHeaderContainer = __implements__sap_m_ObjectHeaderContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectHeaderContainer]
  }
  
  extension [Self <: ObjectHeaderContainer](x: Self) {
    
    inline def set__implements__sap_m_ObjectHeaderContainer(value: Boolean): Self = StObject.set(x, "__implements__sap_m_ObjectHeaderContainer", value.asInstanceOf[js.Any])
  }
}
