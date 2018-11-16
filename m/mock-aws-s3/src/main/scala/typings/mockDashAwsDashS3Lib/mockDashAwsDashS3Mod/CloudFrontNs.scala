package typings
package mockDashAwsDashS3Lib.mockDashAwsDashS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "CloudFront")
@js.native
object CloudFrontNs extends js.Object {
  @js.native
  class Signer protected ()
    extends awsDashSdkLib.awsDashSdkMod.CloudFrontNs.Signer {
    /**
         * A signer object can be used to generate signed URLs and cookies for granting access to content on restricted CloudFront distributions.
         * 
         * @param {string} keyPairId - The ID of the CloudFront key pair being used.
         * @param {string} privateKey - A private key in RSA format.
         */
    def this(keyPairId: java.lang.String, privateKey: java.lang.String) = this()
  }
  
  @js.native
  class Types ()
    extends awsDashSdkLib.awsDashSdkMod.CloudFrontNs.Types {
    /**
       * Constructs a service object. This object has one method for each API operation.
       */
    def this(options: awsDashSdkLib.clientsCloudfrontMod.CloudFrontNs.ClientConfiguration) = this()
  }
  
  val TypesNs: this.type = js.native
  @JSName("CloudFront")
  @js.native
  object CloudFrontNs extends js.Object {
    @js.native
    class Signer protected ()
      extends awsDashSdkLib.awsDashSdkMod.CloudFrontNs.CloudFrontNs.Signer {
      /**
           * A signer object can be used to generate signed URLs and cookies for granting access to content on restricted CloudFront distributions.
           * 
           * @param {string} keyPairId - The ID of the CloudFront key pair being used.
           * @param {string} privateKey - A private key in RSA format.
           */
      def this(keyPairId: java.lang.String, privateKey: java.lang.String) = this()
    }
    
    val TypesNs: this.type = js.native
  }
  
}

