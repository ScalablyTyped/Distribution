package typings.openpgp.openpgpMod.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait hash extends js.Object

/**
  * {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC4880, section 9.4}
  */
@JSImport("openpgp", "enums.hash")
@js.native
object hash extends js.Object {
  @js.native
  sealed trait md5 extends hash
  
  @js.native
  sealed trait ripemd extends hash
  
  @js.native
  sealed trait sha1 extends hash
  
  @js.native
  sealed trait sha224 extends hash
  
  @js.native
  sealed trait sha256 extends hash
  
  @js.native
  sealed trait sha384 extends hash
  
  @js.native
  sealed trait sha512 extends hash
  
  /* 1 */ val md5: typings.openpgp.openpgpMod.enums.hash.md5 with Double = js.native
  /* 3 */ val ripemd: typings.openpgp.openpgpMod.enums.hash.ripemd with Double = js.native
  /* 2 */ val sha1: typings.openpgp.openpgpMod.enums.hash.sha1 with Double = js.native
  /* 11 */ val sha224: typings.openpgp.openpgpMod.enums.hash.sha224 with Double = js.native
  /* 8 */ val sha256: typings.openpgp.openpgpMod.enums.hash.sha256 with Double = js.native
  /* 9 */ val sha384: typings.openpgp.openpgpMod.enums.hash.sha384 with Double = js.native
  /* 10 */ val sha512: typings.openpgp.openpgpMod.enums.hash.sha512 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[hash with Double] = js.native
}

