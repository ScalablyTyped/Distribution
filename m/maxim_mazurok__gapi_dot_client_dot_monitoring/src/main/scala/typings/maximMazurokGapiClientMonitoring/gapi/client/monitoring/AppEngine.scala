package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppEngine extends StObject {
  
  /**
    * The ID of the App Engine module underlying this service. Corresponds to the module_id resource label in the gae_app monitored resource
    * (https://cloud.google.com/monitoring/api/resources#tag_gae_app).
    */
  var moduleId: js.UndefOr[String] = js.undefined
}
object AppEngine {
  
  inline def apply(): AppEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEngine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppEngine] (val x: Self) extends AnyVal {
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
  }
}
