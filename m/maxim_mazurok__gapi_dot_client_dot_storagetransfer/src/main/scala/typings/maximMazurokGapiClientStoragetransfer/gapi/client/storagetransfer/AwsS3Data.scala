package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3Data extends StObject {
  
  /**
    * Input only. AWS access key used to sign the API requests to the AWS S3 bucket. Permissions on the bucket must be granted to the access ID of the AWS access key. For information on
    * our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
    */
  var awsAccessKey: js.UndefOr[AwsAccessKey] = js.undefined
  
  /** Required. S3 Bucket name (see [Creating a bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-example.html)). */
  var bucketName: js.UndefOr[String] = js.undefined
  
  /**
    * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with
    * a '/'.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role to support temporary credentials via `AssumeRoleWithWebIdentity`. For more information about ARNs, see [IAM
    * ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for
    * the session using a `AssumeRoleWithWebIdentity` call for the provided role using the GoogleServiceAccount for this project.
    */
  var roleArn: js.UndefOr[String] = js.undefined
}
object AwsS3Data {
  
  inline def apply(): AwsS3Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsS3Data] (val x: Self) extends AnyVal {
    
    inline def setAwsAccessKey(value: AwsAccessKey): Self = StObject.set(x, "awsAccessKey", value.asInstanceOf[js.Any])
    
    inline def setAwsAccessKeyUndefined: Self = StObject.set(x, "awsAccessKey", js.undefined)
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
