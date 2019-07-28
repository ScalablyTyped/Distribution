package typings.mockDashAwsDashS3.mockDashAwsDashS3Mod

import typings.awsDashSdk.libPollyPresignerMod.PresignerNs.PresignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "Polly")
@js.native
object PollyNs extends js.Object {
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  class Presigner ()
    extends typings.awsDashSdk.awsDashSdkMod.PollyNs.Presigner {
    def this(options: PresignerOptions) = this()
  }
  
}

