package typings.openpgp.openpgpMod.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait symmetric extends js.Object

/**
  * {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC4880, section 9.2}
  */
@JSImport("openpgp", "enums.symmetric")
@js.native
object symmetric extends js.Object {
  @js.native
  sealed trait `3des` extends symmetric
  
  @js.native
  sealed trait aes128 extends symmetric
  
  @js.native
  sealed trait aes192 extends symmetric
  
  @js.native
  sealed trait aes256 extends symmetric
  
  @js.native
  sealed trait blowfish extends symmetric
  
  @js.native
  sealed trait cast5 extends symmetric
  
  /**
    * Not implemented!
    */
  @js.native
  sealed trait idea extends symmetric
  
  @js.native
  sealed trait plaintext extends symmetric
  
  @js.native
  sealed trait tripledes extends symmetric
  
  @js.native
  sealed trait twofish extends symmetric
  
  /* 2 */ val `3des`: typings.openpgp.openpgpMod.enums.symmetric.`3des` with Double = js.native
  /* 7 */ val aes128: typings.openpgp.openpgpMod.enums.symmetric.aes128 with Double = js.native
  /* 8 */ val aes192: typings.openpgp.openpgpMod.enums.symmetric.aes192 with Double = js.native
  /* 9 */ val aes256: typings.openpgp.openpgpMod.enums.symmetric.aes256 with Double = js.native
  /* 4 */ val blowfish: typings.openpgp.openpgpMod.enums.symmetric.blowfish with Double = js.native
  /* 3 */ val cast5: typings.openpgp.openpgpMod.enums.symmetric.cast5 with Double = js.native
  /* 1 */ val idea: typings.openpgp.openpgpMod.enums.symmetric.idea with Double = js.native
  /* 0 */ val plaintext: typings.openpgp.openpgpMod.enums.symmetric.plaintext with Double = js.native
  /* 2 */ val tripledes: typings.openpgp.openpgpMod.enums.symmetric.tripledes with Double = js.native
  /* 10 */ val twofish: typings.openpgp.openpgpMod.enums.symmetric.twofish with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[symmetric with Double] = js.native
}

