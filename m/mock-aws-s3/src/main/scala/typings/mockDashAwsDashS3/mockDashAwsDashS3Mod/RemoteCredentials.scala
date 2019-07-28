package typings.mockDashAwsDashS3.mockDashAwsDashS3Mod

import typings.awsDashSdk.libCredentialsRemoteUnderscoreCredentialsMod.RemoteCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "RemoteCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
class RemoteCredentials ()
  extends typings.awsDashSdk.awsDashSdkMod.RemoteCredentials {
  def this(options: RemoteCredentialsOptions) = this()
}

