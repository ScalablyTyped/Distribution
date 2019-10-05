package typings.openpgp.openpgpMod.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait publicKey extends js.Object

/**
  * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-9.1|RFC4880bis-04, section 9.1}
  */
@JSImport("openpgp", "enums.publicKey")
@js.native
object publicKey extends js.Object {
  /**
    * Reserved for AEDH
    */
  @js.native
  sealed trait aedh extends publicKey
  
  /**
    * Reserved for AEDSA
    */
  @js.native
  sealed trait aedsa extends publicKey
  
  /**
    * DSA (Sign only) [FIPS186] [HAC]
    */
  @js.native
  sealed trait dsa extends publicKey
  
  /**
    * ECDH (Encrypt only) [RFC6637]
    */
  @js.native
  sealed trait ecdh extends publicKey
  
  /**
    * ECDSA (Sign only) [RFC6637]
    */
  @js.native
  sealed trait ecdsa extends publicKey
  
  /**
    * EdDSA (Sign only)
    * [ {@link https://tools.ietf.org/html/draft-koch-eddsa-for-openpgp-04|Draft RFC}]
    */
  @js.native
  sealed trait eddsa extends publicKey
  
  /**
    * Elgamal (Encrypt only) [ELGAMAL] [HAC]
    */
  @js.native
  sealed trait elgamal extends publicKey
  
  /**
    * RSA (Encrypt only) [HAC]
    */
  @js.native
  sealed trait rsa_encrypt extends publicKey
  
  /**
    * RSA (Encrypt or Sign) [HAC]
    */
  @js.native
  sealed trait rsa_encrypt_sign extends publicKey
  
  /**
    * RSA (Sign only) [HAC]
    */
  @js.native
  sealed trait rsa_sign extends publicKey
  
  /* 23 */ val aedh: typings.openpgp.openpgpMod.enums.publicKey.aedh with Double = js.native
  /* 24 */ val aedsa: typings.openpgp.openpgpMod.enums.publicKey.aedsa with Double = js.native
  /* 17 */ val dsa: typings.openpgp.openpgpMod.enums.publicKey.dsa with Double = js.native
  /* 18 */ val ecdh: typings.openpgp.openpgpMod.enums.publicKey.ecdh with Double = js.native
  /* 19 */ val ecdsa: typings.openpgp.openpgpMod.enums.publicKey.ecdsa with Double = js.native
  /* 22 */ val eddsa: typings.openpgp.openpgpMod.enums.publicKey.eddsa with Double = js.native
  /* 16 */ val elgamal: typings.openpgp.openpgpMod.enums.publicKey.elgamal with Double = js.native
  /* 2 */ val rsa_encrypt: typings.openpgp.openpgpMod.enums.publicKey.rsa_encrypt with Double = js.native
  /* 1 */ val rsa_encrypt_sign: typings.openpgp.openpgpMod.enums.publicKey.rsa_encrypt_sign with Double = js.native
  /* 3 */ val rsa_sign: typings.openpgp.openpgpMod.enums.publicKey.rsa_sign with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[publicKey with Double] = js.native
}

