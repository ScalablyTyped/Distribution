package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdfConfig extends StObject {
  
  /** An administrator email address to which the SDF processing status reports will be sent. */
  var adminEmail: js.UndefOr[String] = js.undefined
  
  /** Required. The version of SDF being used. */
  var version: js.UndefOr[String] = js.undefined
}
object SdfConfig {
  
  inline def apply(): SdfConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdfConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SdfConfig] (val x: Self) extends AnyVal {
    
    inline def setAdminEmail(value: String): Self = StObject.set(x, "adminEmail", value.asInstanceOf[js.Any])
    
    inline def setAdminEmailUndefined: Self = StObject.set(x, "adminEmail", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
