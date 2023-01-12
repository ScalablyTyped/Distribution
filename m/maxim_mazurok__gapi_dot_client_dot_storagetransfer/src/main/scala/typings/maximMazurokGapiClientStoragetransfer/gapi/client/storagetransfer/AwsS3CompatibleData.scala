package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3CompatibleData extends StObject {
  
  /** Required. Specifies the name of the bucket. */
  var bucketName: js.UndefOr[String] = js.undefined
  
  /** Required. Specifies the endpoint of the storage service. */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally
    * not begin with a '/'.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /** Specifies the region to sign requests with. This can be left blank if requests should be signed with an empty region. */
  var region: js.UndefOr[String] = js.undefined
  
  /** A S3 compatible metadata. */
  var s3Metadata: js.UndefOr[S3CompatibleMetadata] = js.undefined
}
object AwsS3CompatibleData {
  
  inline def apply(): AwsS3CompatibleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3CompatibleData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsS3CompatibleData] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setS3Metadata(value: S3CompatibleMetadata): Self = StObject.set(x, "s3Metadata", value.asInstanceOf[js.Any])
    
    inline def setS3MetadataUndefined: Self = StObject.set(x, "s3Metadata", js.undefined)
  }
}
