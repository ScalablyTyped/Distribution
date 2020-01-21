package typings.mockAwsS3.mod

import typings.awsSdk.secretsmanagerMod.ClientConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "SecretsManager")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class SecretsManager ()
  extends typings.awsSdk.mod.SecretsManager {
  def this(options: ClientConfiguration) = this()
}

