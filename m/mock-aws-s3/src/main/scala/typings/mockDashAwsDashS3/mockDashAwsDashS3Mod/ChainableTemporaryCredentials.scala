package typings.mockDashAwsDashS3.mockDashAwsDashS3Mod

import typings.awsDashSdk.libCredentialsChainableUnderscoreTemporaryUnderscoreCredentialsMod.ChainableTemporaryCredentialsNs.ChainableTemporaryCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "ChainableTemporaryCredentials")
@js.native
/**
  * Creates a new temporary credentials object.
  */
class ChainableTemporaryCredentials ()
  extends typings.awsDashSdk.awsDashSdkMod.ChainableTemporaryCredentials {
  def this(options: ChainableTemporaryCredentialsOptions) = this()
  def this(
    options: ChainableTemporaryCredentialsOptions,
    masterCredentials: typings.awsDashSdk.libCredentialsMod.Credentials
  ) = this()
}

