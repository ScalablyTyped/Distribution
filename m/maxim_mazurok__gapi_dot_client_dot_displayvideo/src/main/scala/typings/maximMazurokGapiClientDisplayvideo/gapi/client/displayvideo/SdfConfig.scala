package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SdfConfig extends StObject {
  
  /** An administrator email address to which the SDF processing status reports will be sent. */
  var adminEmail: js.UndefOr[String] = js.native
  
  /** Required. The version of SDF being used. */
  var version: js.UndefOr[String] = js.native
}
object SdfConfig {
  
  @scala.inline
  def apply(): SdfConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdfConfig]
  }
  
  @scala.inline
  implicit class SdfConfigMutableBuilder[Self <: SdfConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminEmail(value: String): Self = StObject.set(x, "adminEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminEmailUndefined: Self = StObject.set(x, "adminEmail", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
