package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2CloudSqlInstance extends StObject {
  
  /**
    * The Cloud SQL instance connection names, as can be found in https://console.cloud.google.com/sql/instances. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more
    * information on how to connect Cloud SQL and Cloud Run. Format: {project}:{location}:{instance}
    */
  var instances: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudRunV2CloudSqlInstance {
  
  inline def apply(): GoogleCloudRunV2CloudSqlInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2CloudSqlInstance]
  }
  
  extension [Self <: GoogleCloudRunV2CloudSqlInstance](x: Self) {
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
