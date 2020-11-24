package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsS3Data extends js.Object {
  
  /**
    * Required. Input only. AWS access key used to sign the API requests to the AWS S3 bucket. Permissions on the bucket must be granted to the access ID of the AWS access key. For
    * information on our data retention policy for user credentials, see [User credentials](data-retention#user-credentials).
    */
  var awsAccessKey: js.UndefOr[AwsAccessKey] = js.native
  
  /** Required. S3 Bucket name (see [Creating a bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-example.html)). */
  var bucketName: js.UndefOr[String] = js.native
}
object AwsS3Data {
  
  @scala.inline
  def apply(): AwsS3Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3Data]
  }
  
  @scala.inline
  implicit class AwsS3DataOps[Self <: AwsS3Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwsAccessKey(value: AwsAccessKey): Self = this.set("awsAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsAccessKey: Self = this.set("awsAccessKey", js.undefined)
    
    @scala.inline
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketName: Self = this.set("bucketName", js.undefined)
  }
}
