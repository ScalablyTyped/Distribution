package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MACAlgorithm extends StObject
@JSImport("node-forge", "tls.MACAlgorithm")
@js.native
object MACAlgorithm extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MACAlgorithm with Double] = js.native
  
  @js.native
  sealed trait hmac_md5 extends MACAlgorithm
  /* 0 */ val hmac_md5: typings.nodeForge.mod.tls.MACAlgorithm.hmac_md5 with Double = js.native
  
  @js.native
  sealed trait hmac_sha1 extends MACAlgorithm
  /* 1 */ val hmac_sha1: typings.nodeForge.mod.tls.MACAlgorithm.hmac_sha1 with Double = js.native
  
  @js.native
  sealed trait hmac_sha256 extends MACAlgorithm
  /* 2 */ val hmac_sha256: typings.nodeForge.mod.tls.MACAlgorithm.hmac_sha256 with Double = js.native
  
  @js.native
  sealed trait hmac_sha384 extends MACAlgorithm
  /* 3 */ val hmac_sha384: typings.nodeForge.mod.tls.MACAlgorithm.hmac_sha384 with Double = js.native
  
  @js.native
  sealed trait hmac_sha512 extends MACAlgorithm
  /* 4 */ val hmac_sha512: typings.nodeForge.mod.tls.MACAlgorithm.hmac_sha512 with Double = js.native
}
