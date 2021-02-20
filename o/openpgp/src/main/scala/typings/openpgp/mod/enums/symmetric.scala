package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait symmetric extends StObject
/**
  * {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC4880, section 9.2}
  */
@JSImport("openpgp", "enums.symmetric")
@js.native
object symmetric extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[symmetric with Double] = js.native
  
  @js.native
  sealed trait `3des` extends symmetric
  /* 2 */ val `3des`: typings.openpgp.mod.enums.symmetric.`3des` with Double = js.native
  
  @js.native
  sealed trait aes128 extends symmetric
  /* 7 */ val aes128: typings.openpgp.mod.enums.symmetric.aes128 with Double = js.native
  
  @js.native
  sealed trait aes192 extends symmetric
  /* 8 */ val aes192: typings.openpgp.mod.enums.symmetric.aes192 with Double = js.native
  
  @js.native
  sealed trait aes256 extends symmetric
  /* 9 */ val aes256: typings.openpgp.mod.enums.symmetric.aes256 with Double = js.native
  
  @js.native
  sealed trait blowfish extends symmetric
  /* 4 */ val blowfish: typings.openpgp.mod.enums.symmetric.blowfish with Double = js.native
  
  @js.native
  sealed trait cast5 extends symmetric
  /* 3 */ val cast5: typings.openpgp.mod.enums.symmetric.cast5 with Double = js.native
  
  /**
    * Not implemented!
    */
  @js.native
  sealed trait idea extends symmetric
  /* 1 */ val idea: typings.openpgp.mod.enums.symmetric.idea with Double = js.native
  
  @js.native
  sealed trait plaintext extends symmetric
  /* 0 */ val plaintext: typings.openpgp.mod.enums.symmetric.plaintext with Double = js.native
  
  @js.native
  sealed trait tripledes extends symmetric
  /* 2 */ val tripledes: typings.openpgp.mod.enums.symmetric.tripledes with Double = js.native
  
  @js.native
  sealed trait twofish extends symmetric
  /* 10 */ val twofish: typings.openpgp.mod.enums.symmetric.twofish with Double = js.native
}
