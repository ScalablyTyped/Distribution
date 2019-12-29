package typings.openpgp.openpgpMod.enums

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[publicKey with Double] = js.native
  /* 23 */ @js.native
  object aedh extends TopLevel[aedh with Double]
  
  /* 24 */ @js.native
  object aedsa extends TopLevel[aedsa with Double]
  
  /* 17 */ @js.native
  object dsa extends TopLevel[dsa with Double]
  
  /* 18 */ @js.native
  object ecdh extends TopLevel[ecdh with Double]
  
  /* 19 */ @js.native
  object ecdsa extends TopLevel[ecdsa with Double]
  
  /* 22 */ @js.native
  object eddsa extends TopLevel[eddsa with Double]
  
  /* 16 */ @js.native
  object elgamal extends TopLevel[elgamal with Double]
  
  /* 2 */ @js.native
  object rsa_encrypt extends TopLevel[rsa_encrypt with Double]
  
  /* 1 */ @js.native
  object rsa_encrypt_sign extends TopLevel[rsa_encrypt_sign with Double]
  
  /* 3 */ @js.native
  object rsa_sign extends TopLevel[rsa_sign with Double]
  
}

