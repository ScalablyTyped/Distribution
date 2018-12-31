package typings
package mockDashAwsDashS3Lib.mockDashAwsDashS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "TemporaryCredentials")
@js.native
/**
  * Creates a new temporary credentials object.
  * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
  */
class TemporaryCredentials ()
  extends awsDashSdkLib.awsDashSdkMod.TemporaryCredentials {
  /**
    * Creates a new temporary credentials object.
    * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    * @param {Object} masterCredentials - The master (non-temporary) credentials used to get and refresh credentials from AWS STS.
    */
  def this(options: awsDashSdkLib.libCredentialsTemporaryUnderscoreCredentialsMod.TemporaryCredentialsNs.TemporaryCredentialsOptions) = this()
  def this(options: awsDashSdkLib.libCredentialsTemporaryUnderscoreCredentialsMod.TemporaryCredentialsNs.TemporaryCredentialsOptions, masterCredentials: awsDashSdkLib.libCredentialsMod.Credentials) = this()
}

