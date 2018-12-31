package typings
package mockDashAwsDashS3Lib.mockDashAwsDashS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "Credentials")
@js.native
class Credentials protected ()
  extends awsDashSdkLib.awsDashSdkMod.Credentials {
  /**
    * Creates a Credentials object with a given set of credential information as an options hash.
    *
    * @param {object} options - An option hash containing a set of credential information.
    */
  def this(options: awsDashSdkLib.libCredentialsMod.CredentialsOptions) = this()
  /**
    * Creates a Credentials object with a given set of credential information as positional arguments.
    *          *
    * @param {string} accessKeyId - The AWS access key ID.
    * @param {string} secretAccessKey - The AWS secret access key.
    * @param {string} sessionToken - The optional AWS session token.
    */
  def this(accessKeyId: java.lang.String, secretAccessKey: java.lang.String) = this()
  def this(accessKeyId: java.lang.String, secretAccessKey: java.lang.String, sessionToken: java.lang.String) = this()
}

@JSImport("mock-aws-s3", "Credentials")
@js.native
object Credentials extends js.Object {
  var expiryWindow: scala.Double = js.native
}

