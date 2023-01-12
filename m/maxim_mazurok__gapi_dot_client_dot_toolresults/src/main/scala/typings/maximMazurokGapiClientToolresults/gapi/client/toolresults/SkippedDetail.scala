package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkippedDetail extends StObject {
  
  /** If the App doesn't support the specific API level. */
  var incompatibleAppVersion: js.UndefOr[Boolean] = js.undefined
  
  /** If the App doesn't run on the specific architecture, for example, x86. */
  var incompatibleArchitecture: js.UndefOr[Boolean] = js.undefined
  
  /** If the requested OS version doesn't run on the specific device model. */
  var incompatibleDevice: js.UndefOr[Boolean] = js.undefined
}
object SkippedDetail {
  
  inline def apply(): SkippedDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkippedDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SkippedDetail] (val x: Self) extends AnyVal {
    
    inline def setIncompatibleAppVersion(value: Boolean): Self = StObject.set(x, "incompatibleAppVersion", value.asInstanceOf[js.Any])
    
    inline def setIncompatibleAppVersionUndefined: Self = StObject.set(x, "incompatibleAppVersion", js.undefined)
    
    inline def setIncompatibleArchitecture(value: Boolean): Self = StObject.set(x, "incompatibleArchitecture", value.asInstanceOf[js.Any])
    
    inline def setIncompatibleArchitectureUndefined: Self = StObject.set(x, "incompatibleArchitecture", js.undefined)
    
    inline def setIncompatibleDevice(value: Boolean): Self = StObject.set(x, "incompatibleDevice", value.asInstanceOf[js.Any])
    
    inline def setIncompatibleDeviceUndefined: Self = StObject.set(x, "incompatibleDevice", js.undefined)
  }
}
