package typings.mockDashAwsDashS3.mockDashAwsDashS3Mod

import typings.awsDashSdk.libCredentialsEcsUnderscoreCredentialsMod.ECSCredentialsOptions
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
  extends typings.awsDashSdk.awsDashSdkMod.ECSCredentials {
  def this(options: ECSCredentialsOptions) = this()
}

