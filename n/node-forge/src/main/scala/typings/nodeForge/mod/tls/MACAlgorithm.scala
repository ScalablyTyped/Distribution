package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MACAlgorithm extends js.Object
@JSImport("node-forge", "tls.MACAlgorithm")
@js.native
object MACAlgorithm extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MACAlgorithm with Double] = js.native
  
  @js.native
  sealed trait hmac_md5 extends MACAlgorithm
  /* 0 */ @js.native
  object hmac_md5 extends TopLevel[hmac_md5 with Double]
  
  @js.native
  sealed trait hmac_sha1 extends MACAlgorithm
  /* 1 */ @js.native
  object hmac_sha1 extends TopLevel[hmac_sha1 with Double]
  
  @js.native
  sealed trait hmac_sha256 extends MACAlgorithm
  /* 2 */ @js.native
  object hmac_sha256 extends TopLevel[hmac_sha256 with Double]
  
  @js.native
  sealed trait hmac_sha384 extends MACAlgorithm
  /* 3 */ @js.native
  object hmac_sha384 extends TopLevel[hmac_sha384 with Double]
  
  @js.native
  sealed trait hmac_sha512 extends MACAlgorithm
  /* 4 */ @js.native
  object hmac_sha512 extends TopLevel[hmac_sha512 with Double]
}
