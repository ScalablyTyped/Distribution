package typings.mockDashAwsDashS3.mockDashAwsDashS3Mod

import typings.awsDashSdk.clientsPollyMod.ClientConfiguration
import typings.awsDashSdk.libPollyPresignerMod.Presigner.PresignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "Polly")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class Polly ()
  extends typings.awsDashSdk.awsDashSdkMod.Polly {
  def this(options: ClientConfiguration) = this()
}

@JSImport("mock-aws-s3", "Polly")
@js.native
object Polly extends js.Object {
  @js.native
  /**
    * Creates a presigner object with a set of configuration options.
    */
  class Presigner ()
    extends typings.awsDashSdk.awsDashSdkMod.Polly.Presigner {
    def this(options: PresignerOptions) = this()
  }
  
}

