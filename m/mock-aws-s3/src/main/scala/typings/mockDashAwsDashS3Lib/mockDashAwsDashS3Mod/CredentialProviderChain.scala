package typings
package mockDashAwsDashS3Lib.mockDashAwsDashS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "CredentialProviderChain")
@js.native
/**
  * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
  */
class CredentialProviderChain ()
  extends awsDashSdkLib.awsDashSdkMod.CredentialProviderChain {
  def this(providers: js.Array[
      awsDashSdkLib.libCredentialsCredentialUnderscoreProviderUnderscoreChainMod.provider
    ]) = this()
}

@JSImport("mock-aws-s3", "CredentialProviderChain")
@js.native
object CredentialProviderChain extends js.Object {
  var defaultProviders: js.Array[
    awsDashSdkLib.libCredentialsCredentialUnderscoreProviderUnderscoreChainMod.provider
  ] = js.native
}

