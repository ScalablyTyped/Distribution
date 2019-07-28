package typings.mockDashAwsDashS3.mockDashAwsDashS3Mod

import typings.awsDashSdk.libCredentialsCredentialUnderscoreProviderUnderscoreChainMod.provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "CredentialProviderChain")
@js.native
/**
  * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
  */
class CredentialProviderChain ()
  extends typings.awsDashSdk.awsDashSdkMod.CredentialProviderChain {
  def this(providers: js.Array[provider]) = this()
}

/* static members */
@JSImport("mock-aws-s3", "CredentialProviderChain")
@js.native
object CredentialProviderChain extends js.Object {
  var defaultProviders: js.Array[provider] = js.native
}

