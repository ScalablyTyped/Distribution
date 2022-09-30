package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessDescription extends StObject {
  
  /**
    * The accessLocation field specifies the location of the information
    */
  var accessLocation: GeneralName
  
  /**
    * The type and format of the information are specified by the accessMethod field. This profile defines two accessMethod OIDs: id-ad-caIssuers and id-ad-ocsp
    */
  var accessMethod: String
}
object IAccessDescription {
  
  inline def apply(accessLocation: GeneralName, accessMethod: String): IAccessDescription = {
    val __obj = js.Dynamic.literal(accessLocation = accessLocation.asInstanceOf[js.Any], accessMethod = accessMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessDescription]
  }
  
  extension [Self <: IAccessDescription](x: Self) {
    
    inline def setAccessLocation(value: GeneralName): Self = StObject.set(x, "accessLocation", value.asInstanceOf[js.Any])
    
    inline def setAccessMethod(value: String): Self = StObject.set(x, "accessMethod", value.asInstanceOf[js.Any])
  }
}
