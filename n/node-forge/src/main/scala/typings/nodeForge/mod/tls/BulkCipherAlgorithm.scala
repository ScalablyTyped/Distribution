package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BulkCipherAlgorithm extends js.Object
@JSImport("node-forge", "tls.BulkCipherAlgorithm")
@js.native
object BulkCipherAlgorithm extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BulkCipherAlgorithm with Double] = js.native
  
  @js.native
  sealed trait aes extends BulkCipherAlgorithm
  /* 2 */ @js.native
  object aes extends TopLevel[aes with Double]
  
  @js.native
  sealed trait des3 extends BulkCipherAlgorithm
  /* 1 */ @js.native
  object des3 extends TopLevel[des3 with Double]
  
  @js.native
  sealed trait rc4 extends BulkCipherAlgorithm
  /* 0 */ @js.native
  object rc4 extends TopLevel[rc4 with Double]
}
