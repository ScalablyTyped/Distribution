package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2Volume extends StObject {
  
  /**
    * For Cloud SQL volumes, contains the specific instances that should be mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud
    * SQL and Cloud Run.
    */
  var cloudSqlInstance: js.UndefOr[GoogleCloudRunV2CloudSqlInstance] = js.undefined
  
  /** Required. Volume's name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret */
  var secret: js.UndefOr[GoogleCloudRunV2SecretVolumeSource] = js.undefined
}
object GoogleCloudRunV2Volume {
  
  inline def apply(): GoogleCloudRunV2Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2Volume]
  }
  
  extension [Self <: GoogleCloudRunV2Volume](x: Self) {
    
    inline def setCloudSqlInstance(value: GoogleCloudRunV2CloudSqlInstance): Self = StObject.set(x, "cloudSqlInstance", value.asInstanceOf[js.Any])
    
    inline def setCloudSqlInstanceUndefined: Self = StObject.set(x, "cloudSqlInstance", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecret(value: GoogleCloudRunV2SecretVolumeSource): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
