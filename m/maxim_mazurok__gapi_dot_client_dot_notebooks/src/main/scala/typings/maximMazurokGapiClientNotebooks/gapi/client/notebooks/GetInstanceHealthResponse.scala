package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceHealthResponse extends StObject {
  
  /**
    * Output only. Additional information about instance health. Example: healthInfo": { "docker_proxy_agent_status": "1", "docker_status": "1", "jupyterlab_api_status": "-1",
    * "jupyterlab_status": "-1", "updated": "2020-10-18 09:40:03.573409" }
    */
  var healthInfo: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Output only. Runtime health_state. */
  var healthState: js.UndefOr[String] = js.undefined
}
object GetInstanceHealthResponse {
  
  inline def apply(): GetInstanceHealthResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceHealthResponse]
  }
  
  extension [Self <: GetInstanceHealthResponse](x: Self) {
    
    inline def setHealthInfo(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "healthInfo", value.asInstanceOf[js.Any])
    
    inline def setHealthInfoUndefined: Self = StObject.set(x, "healthInfo", js.undefined)
    
    inline def setHealthState(value: String): Self = StObject.set(x, "healthState", value.asInstanceOf[js.Any])
    
    inline def setHealthStateUndefined: Self = StObject.set(x, "healthState", js.undefined)
  }
}
