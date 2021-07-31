package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def apply(value: Double): js.UndefOr[symmetric & Double] = js.native
  
  @js.native
  sealed trait `3des`
    extends StObject
       with symmetric
  /* 2 */ val `3des`: typings.openpgp.mod.enums.symmetric.`3des` & Double = js.native
  
  @js.native
  sealed trait aes128
    extends StObject
       with symmetric
  /* 7 */ val aes128: typings.openpgp.mod.enums.symmetric.aes128 & Double = js.native
  
  @js.native
  sealed trait aes192
    extends StObject
       with symmetric
  /* 8 */ val aes192: typings.openpgp.mod.enums.symmetric.aes192 & Double = js.native
  
  @js.native
  sealed trait aes256
    extends StObject
       with symmetric
  /* 9 */ val aes256: typings.openpgp.mod.enums.symmetric.aes256 & Double = js.native
  
  @js.native
  sealed trait blowfish
    extends StObject
       with symmetric
  /* 4 */ val blowfish: typings.openpgp.mod.enums.symmetric.blowfish & Double = js.native
  
  @js.native
  sealed trait cast5
    extends StObject
       with symmetric
  /* 3 */ val cast5: typings.openpgp.mod.enums.symmetric.cast5 & Double = js.native
  
  /**
    * Not implemented!
    */
  @js.native
  sealed trait idea
    extends StObject
       with symmetric
  /* 1 */ val idea: typings.openpgp.mod.enums.symmetric.idea & Double = js.native
  
  @js.native
  sealed trait plaintext
    extends StObject
       with symmetric
  /* 0 */ val plaintext: typings.openpgp.mod.enums.symmetric.plaintext & Double = js.native
  
  @js.native
  sealed trait tripledes
    extends StObject
       with symmetric
  /* 2 */ val tripledes: typings.openpgp.mod.enums.symmetric.tripledes & Double = js.native
  
  @js.native
  sealed trait twofish
    extends StObject
       with symmetric
  /* 10 */ val twofish: typings.openpgp.mod.enums.symmetric.twofish & Double = js.native
}
