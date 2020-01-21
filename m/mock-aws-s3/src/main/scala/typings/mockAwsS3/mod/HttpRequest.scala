package typings.mockAwsS3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "HttpRequest")
@js.native
class HttpRequest protected ()
  extends typings.awsSdk.mod.HttpRequest {
  /**
    * Constructs HttpRequest object with provided endpoint and region
    */
  def this(endpoint: typings.awsSdk.endpointMod.Endpoint, region: String) = this()
}

