package typings
package mockDashAwsDashS3Lib.mockDashAwsDashS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "Polly")
@js.native
object PollyNs extends js.Object {
  @js.native
  class Presigner ()
    extends awsDashSdkLib.awsDashSdkMod.PollyNs.Presigner {
    /**
       * Creates a presigner object with a set of configuration options.
       */
    def this(options: awsDashSdkLib.libPollyPresignerMod.PresignerNs.PresignerOptions) = this()
  }
  
  @js.native
  class Types ()
    extends awsDashSdkLib.awsDashSdkMod.PollyNs.Types {
    /**
       * Constructs a service object. This object has one method for each API operation.
       */
    def this(options: awsDashSdkLib.clientsPollyMod.PollyNs.ClientConfiguration) = this()
  }
  
  val TypesNs: this.type = js.native
  @JSName("Polly")
  @js.native
  object PollyNs extends js.Object {
    @js.native
    class Presigner ()
      extends awsDashSdkLib.awsDashSdkMod.PollyNs.PollyNs.Presigner {
      /**
         * Creates a presigner object with a set of configuration options.
         */
      def this(options: awsDashSdkLib.libPollyPresignerMod.PresignerNs.PresignerOptions) = this()
    }
    
    val TypesNs: this.type = js.native
  }
  
}

