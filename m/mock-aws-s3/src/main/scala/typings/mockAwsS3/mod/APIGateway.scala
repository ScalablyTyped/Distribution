package typings.mockAwsS3.mod

import typings.awsSdk.apigatewayMod.ClientConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "APIGateway")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class APIGateway ()
  extends typings.awsSdk.mod.APIGateway {
  def this(options: ClientConfiguration) = this()
}

