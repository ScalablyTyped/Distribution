package typings.mockAwsS3.mod

import typings.awsSdk.clientsRdsMod.ClientConfiguration
import typings.awsSdk.libRdsSignerMod.Signer.SignerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mock-aws-s3", "RDS")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
open class RDS ()
  extends typings.awsSdk.mod.RDS {
  def this(options: ClientConfiguration) = this()
}
object RDS {
  
  @JSImport("mock-aws-s3", "RDS.Signer")
  @js.native
  /**
    * A signer object can be used to generate an auth token to a database.
    */
  open class Signer ()
    extends typings.awsSdk.mod.RDS.Signer {
    def this(options: SignerOptions) = this()
  }
}
