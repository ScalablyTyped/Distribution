package typings.mockAwsS3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mock-aws-s3", "TokenFileWebIdentityCredentials")
@js.native
/**
  * Creates a new credentials object with optional configuraion.
  * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
  */
class TokenFileWebIdentityCredentials ()
  extends typings.awsSdk.mod.TokenFileWebIdentityCredentials {
  def this(clientConfig: typings.awsSdk.configBaseMod.ConfigurationOptions) = this()
}
