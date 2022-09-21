package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcsData extends StObject {
  
  /** Required. Cloud Storage bucket name. Must meet [Bucket Name Requirements](/storage/docs/naming#requirements). */
  var bucketName: js.UndefOr[String] = js.undefined
  
  /**
    * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with
    * a '/'. The root path value must meet [Object Name Requirements](/storage/docs/naming#objectnames).
    */
  var path: js.UndefOr[String] = js.undefined
}
object GcsData {
  
  inline def apply(): GcsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsData]
  }
  
  extension [Self <: GcsData](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
