package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2BinaryAuthorization extends StObject {
  
  /**
    * If present, indicates to use Breakglass using this justification. If use_default is False, then it must be empty. For more information on breakglass, see
    * https://cloud.google.com/binary-authorization/docs/using-breakglass
    */
  var breakglassJustification: js.UndefOr[String] = js.undefined
  
  /** If True, indicates to use the default project's binary authorization policy. If False, binary authorization will be disabled. */
  var useDefault: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudRunV2BinaryAuthorization {
  
  inline def apply(): GoogleCloudRunV2BinaryAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2BinaryAuthorization]
  }
  
  extension [Self <: GoogleCloudRunV2BinaryAuthorization](x: Self) {
    
    inline def setBreakglassJustification(value: String): Self = StObject.set(x, "breakglassJustification", value.asInstanceOf[js.Any])
    
    inline def setBreakglassJustificationUndefined: Self = StObject.set(x, "breakglassJustification", js.undefined)
    
    inline def setUseDefault(value: Boolean): Self = StObject.set(x, "useDefault", value.asInstanceOf[js.Any])
    
    inline def setUseDefaultUndefined: Self = StObject.set(x, "useDefault", js.undefined)
  }
}
