package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait publicKey extends js.Object
/**
  * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-9.1|RFC4880bis-04, section 9.1}
  */
@JSImport("openpgp", "enums.publicKey")
@js.native
object publicKey extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[publicKey with Double] = js.native
  
  /**
    * Reserved for AEDH
    */
  @js.native
  sealed trait aedh extends publicKey
  /* 23 */ @js.native
  object aedh extends TopLevel[aedh with Double]
  
  /**
    * Reserved for AEDSA
    */
  @js.native
  sealed trait aedsa extends publicKey
  /* 24 */ @js.native
  object aedsa extends TopLevel[aedsa with Double]
  
  /**
    * DSA (Sign only) [FIPS186] [HAC]
    */
  @js.native
  sealed trait dsa extends publicKey
  /* 17 */ @js.native
  object dsa extends TopLevel[dsa with Double]
  
  /**
    * ECDH (Encrypt only) [RFC6637]
    */
  @js.native
  sealed trait ecdh extends publicKey
  /* 18 */ @js.native
  object ecdh extends TopLevel[ecdh with Double]
  
  /**
    * ECDSA (Sign only) [RFC6637]
    */
  @js.native
  sealed trait ecdsa extends publicKey
  /* 19 */ @js.native
  object ecdsa extends TopLevel[ecdsa with Double]
  
  /**
    * EdDSA (Sign only)
    * [ {@link https://tools.ietf.org/html/draft-koch-eddsa-for-openpgp-04|Draft RFC}]
    */
  @js.native
  sealed trait eddsa extends publicKey
  /* 22 */ @js.native
  object eddsa extends TopLevel[eddsa with Double]
  
  /**
    * Elgamal (Encrypt only) [ELGAMAL] [HAC]
    */
  @js.native
  sealed trait elgamal extends publicKey
  /* 16 */ @js.native
  object elgamal extends TopLevel[elgamal with Double]
  
  /**
    * RSA (Encrypt only) [HAC]
    */
  @js.native
  sealed trait rsa_encrypt extends publicKey
  /* 2 */ @js.native
  object rsa_encrypt extends TopLevel[rsa_encrypt with Double]
  
  /**
    * RSA (Encrypt or Sign) [HAC]
    */
  @js.native
  sealed trait rsa_encrypt_sign extends publicKey
  /* 1 */ @js.native
  object rsa_encrypt_sign extends TopLevel[rsa_encrypt_sign with Double]
  
  /**
    * RSA (Sign only) [HAC]
    */
  @js.native
  sealed trait rsa_sign extends publicKey
  /* 3 */ @js.native
  object rsa_sign extends TopLevel[rsa_sign with Double]
}
