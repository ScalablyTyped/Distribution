package typings.mockAwsS3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "EnvironmentCredentials")
@js.native
class EnvironmentCredentials protected ()
  extends typings.awsSdk.mod.EnvironmentCredentials {
  /**
    * Creates a new EnvironmentCredentials class with a given variable prefix envPrefix.
    * @param {string} envPrefix - The prefix for the environment variable names excluding the separating underscore.
    */
  def this(envPrefix: String) = this()
}

