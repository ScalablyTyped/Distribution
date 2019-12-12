package typings.nodeDashForge.nodeDashForgeMod.tls

import org.scalablytyped.runtime.TopLevel
import typings.nodeDashForge.nodeDashForgeMod.tls.BulkCipherAlgorithm.aes
import typings.nodeDashForge.nodeDashForgeMod.tls.BulkCipherAlgorithm.des3
import typings.nodeDashForge.nodeDashForgeMod.tls.BulkCipherAlgorithm.rc4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BulkCipherAlgorithm extends js.Object

@JSImport("node-forge", "tls.BulkCipherAlgorithm")
@js.native
object BulkCipherAlgorithm extends js.Object {
  @js.native
  sealed trait aes extends BulkCipherAlgorithm
  
  @js.native
  sealed trait des3 extends BulkCipherAlgorithm
  
  @js.native
  sealed trait rc4 extends BulkCipherAlgorithm
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BulkCipherAlgorithm with Double] = js.native
  /* 2 */ @js.native
  object aes extends TopLevel[aes with Double]
  
  /* 1 */ @js.native
  object des3 extends TopLevel[des3 with Double]
  
  /* 0 */ @js.native
  object rc4 extends TopLevel[rc4 with Double]
  
}

