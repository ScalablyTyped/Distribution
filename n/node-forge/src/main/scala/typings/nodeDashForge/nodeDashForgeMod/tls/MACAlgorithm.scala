package typings.nodeDashForge.nodeDashForgeMod.tls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MACAlgorithm extends js.Object

@JSImport("node-forge", "tls.MACAlgorithm")
@js.native
object MACAlgorithm extends js.Object {
  @js.native
  sealed trait hmac_md5 extends MACAlgorithm
  
  @js.native
  sealed trait hmac_sha1 extends MACAlgorithm
  
  @js.native
  sealed trait hmac_sha256 extends MACAlgorithm
  
  @js.native
  sealed trait hmac_sha384 extends MACAlgorithm
  
  @js.native
  sealed trait hmac_sha512 extends MACAlgorithm
  
  /* 0 */ val hmac_md5: typings.nodeDashForge.nodeDashForgeMod.tls.MACAlgorithm.hmac_md5 with Double = js.native
  /* 1 */ val hmac_sha1: typings.nodeDashForge.nodeDashForgeMod.tls.MACAlgorithm.hmac_sha1 with Double = js.native
  /* 2 */ val hmac_sha256: typings.nodeDashForge.nodeDashForgeMod.tls.MACAlgorithm.hmac_sha256 with Double = js.native
  /* 3 */ val hmac_sha384: typings.nodeDashForge.nodeDashForgeMod.tls.MACAlgorithm.hmac_sha384 with Double = js.native
  /* 4 */ val hmac_sha512: typings.nodeDashForge.nodeDashForgeMod.tls.MACAlgorithm.hmac_sha512 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MACAlgorithm with Double] = js.native
}

