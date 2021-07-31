package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BulkCipherAlgorithm extends StObject
@JSImport("node-forge", "tls.BulkCipherAlgorithm")
@js.native
object BulkCipherAlgorithm extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BulkCipherAlgorithm & Double] = js.native
  
  @js.native
  sealed trait aes
    extends StObject
       with BulkCipherAlgorithm
  /* 2 */ val aes: typings.nodeForge.mod.tls.BulkCipherAlgorithm.aes & Double = js.native
  
  @js.native
  sealed trait des3
    extends StObject
       with BulkCipherAlgorithm
  /* 1 */ val des3: typings.nodeForge.mod.tls.BulkCipherAlgorithm.des3 & Double = js.native
  
  @js.native
  sealed trait rc4
    extends StObject
       with BulkCipherAlgorithm
  /* 0 */ val rc4: typings.nodeForge.mod.tls.BulkCipherAlgorithm.rc4 & Double = js.native
}
