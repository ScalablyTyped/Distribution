package typings.mockDashAwsDashS3.mockDashAwsDashS3Mod

import typings.awsDashSdk.libRdsSignerMod.SignerNs.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "RDS")
@js.native
object RDSNs extends js.Object {
  @js.native
  /**
    * A signer object can be used to generate an auth token to a database.
    */
  class Signer ()
    extends typings.awsDashSdk.awsDashSdkMod.RDSNs.Signer {
    def this(options: SignerOptions) = this()
  }
  
}

