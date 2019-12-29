package typings.nodeDashForge.nodeDashForgeMod.tls

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MACAlgorithm with Double] = js.native
  /* 0 */ @js.native
  object hmac_md5 extends TopLevel[hmac_md5 with Double]
  
  /* 1 */ @js.native
  object hmac_sha1
    extends TopLevel[typings.nodeDashForge.nodeDashForgeMod.tls.MACAlgorithm.hmac_sha1 with Double]
  
  /* 2 */ @js.native
  object hmac_sha256 extends TopLevel[hmac_sha256 with Double]
  
  /* 3 */ @js.native
  object hmac_sha384 extends TopLevel[hmac_sha384 with Double]
  
  /* 4 */ @js.native
  object hmac_sha512 extends TopLevel[hmac_sha512 with Double]
  
}

