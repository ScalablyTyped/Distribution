package typings.mockDashAwsDashS3.mockDashAwsDashS3Mod

import typings.awsDashSdk.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.ManagedUploadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "S3")
@js.native
object S3Ns extends js.Object {
  @js.native
  class ManagedUpload protected ()
    extends typings.awsDashSdk.awsDashSdkMod.S3Ns.ManagedUpload {
    /**
      * Creates a managed upload object with a set of configuration options.
      */
    def this(options: ManagedUploadOptions) = this()
  }
  
  @js.native
  class PresignedPost ()
    extends typings.awsDashSdk.awsDashSdkMod.S3Ns.PresignedPost
  
  /* static members */
  @js.native
  object ManagedUpload extends js.Object {
    /**
      * Default value: 10000
      */
    var maxTotalParts: Double = js.native
    /**
      * Returns the minimum number of bytes for an individual part upload.
      * Note: Minimum allowed size is 5 MB.
      * 1024 * 5
      */
    var minPartSize: Double = js.native
  }
  
}

