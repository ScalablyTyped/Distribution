package typings.mockAwsS3.mod

import typings.awsSdk.ecsCredentialsMod.ECSCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "ECSCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
class ECSCredentials ()
  extends typings.awsSdk.mod.ECSCredentials {
  def this(options: ECSCredentialsOptions) = this()
}

