package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait publicKey extends StObject
/**
  * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-9.1|RFC4880bis-04, section 9.1}
  */
@JSImport("openpgp", "enums.publicKey")
@js.native
object publicKey extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[publicKey & Double] = js.native
  
  /**
    * Reserved for AEDH
    */
  @js.native
  sealed trait aedh
    extends StObject
       with publicKey
  /* 23 */ val aedh: typings.openpgp.mod.enums.publicKey.aedh & Double = js.native
  
  /**
    * Reserved for AEDSA
    */
  @js.native
  sealed trait aedsa
    extends StObject
       with publicKey
  /* 24 */ val aedsa: typings.openpgp.mod.enums.publicKey.aedsa & Double = js.native
  
  /**
    * DSA (Sign only) [FIPS186] [HAC]
    */
  @js.native
  sealed trait dsa
    extends StObject
       with publicKey
  /* 17 */ val dsa: typings.openpgp.mod.enums.publicKey.dsa & Double = js.native
  
  /**
    * ECDH (Encrypt only) [RFC6637]
    */
  @js.native
  sealed trait ecdh
    extends StObject
       with publicKey
  /* 18 */ val ecdh: typings.openpgp.mod.enums.publicKey.ecdh & Double = js.native
  
  /**
    * ECDSA (Sign only) [RFC6637]
    */
  @js.native
  sealed trait ecdsa
    extends StObject
       with publicKey
  /* 19 */ val ecdsa: typings.openpgp.mod.enums.publicKey.ecdsa & Double = js.native
  
  /**
    * EdDSA (Sign only)
    * [ {@link https://tools.ietf.org/html/draft-koch-eddsa-for-openpgp-04|Draft RFC}]
    */
  @js.native
  sealed trait eddsa
    extends StObject
       with publicKey
  /* 22 */ val eddsa: typings.openpgp.mod.enums.publicKey.eddsa & Double = js.native
  
  /**
    * Elgamal (Encrypt only) [ELGAMAL] [HAC]
    */
  @js.native
  sealed trait elgamal
    extends StObject
       with publicKey
  /* 16 */ val elgamal: typings.openpgp.mod.enums.publicKey.elgamal & Double = js.native
  
  /**
    * RSA (Encrypt only) [HAC]
    */
  @js.native
  sealed trait rsa_encrypt
    extends StObject
       with publicKey
  /* 2 */ val rsa_encrypt: typings.openpgp.mod.enums.publicKey.rsa_encrypt & Double = js.native
  
  /**
    * RSA (Encrypt or Sign) [HAC]
    */
  @js.native
  sealed trait rsa_encrypt_sign
    extends StObject
       with publicKey
  /* 1 */ val rsa_encrypt_sign: typings.openpgp.mod.enums.publicKey.rsa_encrypt_sign & Double = js.native
  
  /**
    * RSA (Sign only) [HAC]
    */
  @js.native
  sealed trait rsa_sign
    extends StObject
       with publicKey
  /* 3 */ val rsa_sign: typings.openpgp.mod.enums.publicKey.rsa_sign & Double = js.native
}
