package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudAppSecuritySessionControl
  extends StObject
     with ConditionalAccessSessionControl {
  
  /**
    * Possible values are: mcasConfigured, monitorOnly, blockDownloads, unknownFutureValue. For more information, see Deploy
    * Conditional Access App Control for featured apps.
    */
  var cloudAppSecurityType: js.UndefOr[NullableOption[CloudAppSecuritySessionControlType]] = js.undefined
}
object CloudAppSecuritySessionControl {
  
  inline def apply(): CloudAppSecuritySessionControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudAppSecuritySessionControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudAppSecuritySessionControl] (val x: Self) extends AnyVal {
    
    inline def setCloudAppSecurityType(value: NullableOption[CloudAppSecuritySessionControlType]): Self = StObject.set(x, "cloudAppSecurityType", value.asInstanceOf[js.Any])
    
    inline def setCloudAppSecurityTypeNull: Self = StObject.set(x, "cloudAppSecurityType", null)
    
    inline def setCloudAppSecurityTypeUndefined: Self = StObject.set(x, "cloudAppSecurityType", js.undefined)
  }
}
