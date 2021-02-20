package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudAppSecuritySessionControl extends ConditionalAccessSessionControl {
  
  /**
    * Possible values are: mcasConfigured, monitorOnly, blockDownloads, unknownFutureValue. For more information, see Deploy
    * Conditional Access App Control for featured apps.
    */
  var cloudAppSecurityType: js.UndefOr[NullableOption[CloudAppSecuritySessionControlType]] = js.native
}
object CloudAppSecuritySessionControl {
  
  @scala.inline
  def apply(): CloudAppSecuritySessionControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudAppSecuritySessionControl]
  }
  
  @scala.inline
  implicit class CloudAppSecuritySessionControlMutableBuilder[Self <: CloudAppSecuritySessionControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudAppSecurityType(value: NullableOption[CloudAppSecuritySessionControlType]): Self = StObject.set(x, "cloudAppSecurityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudAppSecurityTypeNull: Self = StObject.set(x, "cloudAppSecurityType", null)
    
    @scala.inline
    def setCloudAppSecurityTypeUndefined: Self = StObject.set(x, "cloudAppSecurityType", js.undefined)
  }
}
