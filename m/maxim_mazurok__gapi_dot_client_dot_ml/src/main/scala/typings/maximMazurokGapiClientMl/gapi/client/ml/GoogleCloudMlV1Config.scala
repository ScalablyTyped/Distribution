package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1Config extends StObject {
  
  /** The service account Cloud ML uses to run on TPU node. */
  var tpuServiceAccount: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1Config {
  
  @scala.inline
  def apply(): GoogleCloudMlV1Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Config]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ConfigMutableBuilder[Self <: GoogleCloudMlV1Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTpuServiceAccount(value: String): Self = StObject.set(x, "tpuServiceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpuServiceAccountUndefined: Self = StObject.set(x, "tpuServiceAccount", js.undefined)
  }
}
