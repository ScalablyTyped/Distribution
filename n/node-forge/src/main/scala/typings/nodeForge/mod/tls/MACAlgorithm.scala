package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MACAlgorithm extends StObject
@JSImport("node-forge", "tls.MACAlgorithm")
@js.native
object MACAlgorithm extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MACAlgorithm & Double] = js.native
  
  @js.native
  sealed trait hmac_md5
    extends StObject
       with MACAlgorithm
  /* 0 */ val hmac_md5: typings.nodeForge.mod.tls.MACAlgorithm.hmac_md5 & Double = js.native
  
  @js.native
  sealed trait hmac_sha1
    extends StObject
       with MACAlgorithm
  /* 1 */ val hmac_sha1: typings.nodeForge.mod.tls.MACAlgorithm.hmac_sha1 & Double = js.native
  
  @js.native
  sealed trait hmac_sha256
    extends StObject
       with MACAlgorithm
  /* 2 */ val hmac_sha256: typings.nodeForge.mod.tls.MACAlgorithm.hmac_sha256 & Double = js.native
  
  @js.native
  sealed trait hmac_sha384
    extends StObject
       with MACAlgorithm
  /* 3 */ val hmac_sha384: typings.nodeForge.mod.tls.MACAlgorithm.hmac_sha384 & Double = js.native
  
  @js.native
  sealed trait hmac_sha512
    extends StObject
       with MACAlgorithm
  /* 4 */ val hmac_sha512: typings.nodeForge.mod.tls.MACAlgorithm.hmac_sha512 & Double = js.native
}
