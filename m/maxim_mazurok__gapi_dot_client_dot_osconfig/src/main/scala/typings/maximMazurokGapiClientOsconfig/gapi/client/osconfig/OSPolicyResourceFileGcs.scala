package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourceFileGcs extends StObject {
  
  /** Required. Bucket of the Cloud Storage object. */
  var bucket: js.UndefOr[String] = js.undefined
  
  /** Generation number of the Cloud Storage object. */
  var generation: js.UndefOr[String] = js.undefined
  
  /** Required. Name of the Cloud Storage object. */
  var `object`: js.UndefOr[String] = js.undefined
}
object OSPolicyResourceFileGcs {
  
  inline def apply(): OSPolicyResourceFileGcs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourceFileGcs]
  }
  
  extension [Self <: OSPolicyResourceFileGcs](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
