package typings
package mockDashAwsDashS3Lib.mockDashAwsDashS3Mod

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
    extends awsDashSdkLib.awsDashSdkMod.RDSNs.Signer {
    def this(options: awsDashSdkLib.libRdsSignerMod.SignerNs.SignerOptions) = this()
  }
  
}

