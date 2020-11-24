package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait curve extends js.Object
/**
  * Maps curve names under various standards to one
  * @see
  */
@JSImport("openpgp", "enums.curve")
@js.native
object curve extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[curve with String] = js.native
  
  @js.native
  sealed trait `1Dot2Dot840Dot10045Dot3Dot1Dot7` extends curve
  /* "p256" */ @js.native
  object `1Dot2Dot840Dot10045Dot3Dot1Dot7` extends TopLevel[`1Dot2Dot840Dot10045Dot3Dot1Dot7` with String]
  
  @js.native
  sealed trait `1Dot3Dot132Dot0Dot10` extends curve
  /* "secp256k1" */ @js.native
  object `1Dot3Dot132Dot0Dot10` extends TopLevel[`1Dot3Dot132Dot0Dot10` with String]
  
  @js.native
  sealed trait `1Dot3Dot132Dot0Dot34` extends curve
  /* "p384" */ @js.native
  object `1Dot3Dot132Dot0Dot34` extends TopLevel[`1Dot3Dot132Dot0Dot34` with String]
  
  @js.native
  sealed trait `1Dot3Dot132Dot0Dot35` extends curve
  /* "p521" */ @js.native
  object `1Dot3Dot132Dot0Dot35` extends TopLevel[`1Dot3Dot132Dot0Dot35` with String]
  
  @js.native
  sealed trait `1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot11` extends curve
  /* "brainpoolP384r1" */ @js.native
  object `1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot11` extends TopLevel[`1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot11` with String]
  
  @js.native
  sealed trait `1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot13` extends curve
  /* "brainpoolP512r1" */ @js.native
  object `1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot13` extends TopLevel[`1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot13` with String]
  
  @js.native
  sealed trait `1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot7` extends curve
  /* "brainpoolP256r1" */ @js.native
  object `1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot7` extends TopLevel[`1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot7` with String]
  
  @js.native
  sealed trait `1Dot3Dot6Dot1Dot4Dot1Dot11591Dot15Dot1` extends curve
  /* "ed25519" */ @js.native
  object `1Dot3Dot6Dot1Dot4Dot1Dot11591Dot15Dot1` extends TopLevel[`1Dot3Dot6Dot1Dot4Dot1Dot11591Dot15Dot1` with String]
  
  @js.native
  sealed trait `1Dot3Dot6Dot1Dot4Dot1Dot3029Dot1Dot5Dot1` extends curve
  /* "curve25519" */ @js.native
  object `1Dot3Dot6Dot1Dot4Dot1Dot3029Dot1Dot5Dot1` extends TopLevel[`1Dot3Dot6Dot1Dot4Dot1Dot3029Dot1Dot5Dot1` with String]
  
  @js.native
  sealed trait `2A8648CE3D030107` extends curve
  /* "p256" */ @js.native
  object `2A8648CE3D030107` extends TopLevel[`2A8648CE3D030107` with String]
  
  @js.native
  sealed trait `2B060104019755010501` extends curve
  /* "curve25519" */ @js.native
  object `2B060104019755010501` extends TopLevel[`2B060104019755010501` with String]
  
  @js.native
  sealed trait `2B06010401DA470F01` extends curve
  /* "ed25519" */ @js.native
  object `2B06010401DA470F01` extends TopLevel[`2B06010401DA470F01` with String]
  
  @js.native
  sealed trait `2B2403030208010107` extends curve
  /* "brainpoolP256r1" */ @js.native
  object `2B2403030208010107` extends TopLevel[`2B2403030208010107` with String]
  
  @js.native
  sealed trait `2B240303020801010B` extends curve
  /* "brainpoolP384r1" */ @js.native
  object `2B240303020801010B` extends TopLevel[`2B240303020801010B` with String]
  
  @js.native
  sealed trait `2B240303020801010D` extends curve
  /* "brainpoolP512r1" */ @js.native
  object `2B240303020801010D` extends TopLevel[`2B240303020801010D` with String]
  
  @js.native
  sealed trait `2B8104000A` extends curve
  /* "secp256k1" */ @js.native
  object `2B8104000A` extends TopLevel[`2B8104000A` with String]
  
  @js.native
  sealed trait `2B81040022` extends curve
  /* "p384" */ @js.native
  object `2B81040022` extends TopLevel[`2B81040022` with String]
  
  @js.native
  sealed trait `2B81040023` extends curve
  /* "p521" */ @js.native
  object `2B81040023` extends TopLevel[`2B81040023` with String]
  
  @js.native
  sealed trait `2a8648ce3d030107` extends curve
  /* "p256" */ @js.native
  object `2a8648ce3d030107` extends TopLevel[`2a8648ce3d030107` with String]
  
  @js.native
  sealed trait `2b060104019755010501` extends curve
  /* "curve25519" */ @js.native
  object `2b060104019755010501` extends TopLevel[`2b060104019755010501` with String]
  
  @js.native
  sealed trait `2b06010401da470f01` extends curve
  /* "ed25519" */ @js.native
  object `2b06010401da470f01` extends TopLevel[`2b06010401da470f01` with String]
  
  @js.native
  sealed trait `2b2403030208010107` extends curve
  /* "brainpoolP256r1" */ @js.native
  object `2b2403030208010107` extends TopLevel[`2b2403030208010107` with String]
  
  @js.native
  sealed trait `2b240303020801010b` extends curve
  /* "brainpoolP384r1" */ @js.native
  object `2b240303020801010b` extends TopLevel[`2b240303020801010b` with String]
  
  @js.native
  sealed trait `2b240303020801010d` extends curve
  /* "brainpoolP512r1" */ @js.native
  object `2b240303020801010d` extends TopLevel[`2b240303020801010d` with String]
  
  @js.native
  sealed trait `2b8104000a` extends curve
  /* "secp256k1" */ @js.native
  object `2b8104000a` extends TopLevel[`2b8104000a` with String]
  
  @js.native
  sealed trait `2b81040022` extends curve
  /* "p384" */ @js.native
  object `2b81040022` extends TopLevel[`2b81040022` with String]
  
  @js.native
  sealed trait `2b81040023` extends curve
  /* "p521" */ @js.native
  object `2b81040023` extends TopLevel[`2b81040023` with String]
  
  @js.native
  sealed trait Curve25519 extends curve
  /* "curve25519" */ @js.native
  object Curve25519 extends TopLevel[Curve25519 with String]
  
  /**
    * Ed25519
    */
  @js.native
  sealed trait ED25519 extends curve
  /* "ed25519" */ @js.native
  object ED25519 extends TopLevel[ED25519 with String]
  
  @js.native
  sealed trait Ed25519 extends curve
  /* "ed25519" */ @js.native
  object Ed25519 extends TopLevel[Ed25519 with String]
  
  @js.native
  sealed trait `P-256` extends curve
  /* "p256" */ @js.native
  object `P-256` extends TopLevel[`P-256` with String]
  
  @js.native
  sealed trait `P-384` extends curve
  /* "p384" */ @js.native
  object `P-384` extends TopLevel[`P-384` with String]
  
  @js.native
  sealed trait `P-521` extends curve
  /* "p521" */ @js.native
  object `P-521` extends TopLevel[`P-521` with String]
  
  /**
    * Curve25519
    */
  @js.native
  sealed trait X25519 extends curve
  /* "curve25519" */ @js.native
  object X25519 extends TopLevel[X25519 with String]
  
  /**
    * BrainpoolP256r1 Curve
    */
  @js.native
  sealed trait brainpoolP256r1 extends curve
  /* "brainpoolP256r1" */ @js.native
  object brainpoolP256r1 extends TopLevel[brainpoolP256r1 with String]
  
  /**
    * BrainpoolP384r1 Curve
    */
  @js.native
  sealed trait brainpoolP384r1 extends curve
  /* "brainpoolP384r1" */ @js.native
  object brainpoolP384r1 extends TopLevel[brainpoolP384r1 with String]
  
  /**
    * BrainpoolP512r1 Curve
    */
  @js.native
  sealed trait brainpoolP512r1 extends curve
  /* "brainpoolP512r1" */ @js.native
  object brainpoolP512r1 extends TopLevel[brainpoolP512r1 with String]
  
  @js.native
  sealed trait curve25519 extends curve
  /* "curve25519" */ @js.native
  object curve25519 extends TopLevel[curve25519 with String]
  
  @js.native
  sealed trait cv25519 extends curve
  /* "curve25519" */ @js.native
  object cv25519 extends TopLevel[cv25519 with String]
  
  @js.native
  sealed trait ed25519 extends curve
  /* "ed25519" */ @js.native
  object ed25519 extends TopLevel[ed25519 with String]
  
  /**
    * NIST P-256 Curve
    */
  @js.native
  sealed trait p256 extends curve
  /* "p256" */ @js.native
  object p256 extends TopLevel[p256 with String]
  
  /**
    * NIST P-384 Curve
    */
  @js.native
  sealed trait p384 extends curve
  /* "p384" */ @js.native
  object p384 extends TopLevel[p384 with String]
  
  /**
    * NIST P-521 Curve
    */
  @js.native
  sealed trait p521 extends curve
  /* "p521" */ @js.native
  object p521 extends TopLevel[p521 with String]
  
  @js.native
  sealed trait prime256v1 extends curve
  /* "p256" */ @js.native
  object prime256v1 extends TopLevel[prime256v1 with String]
  
  /**
    * SECG SECP256k1 Curve
    */
  @js.native
  sealed trait secp256k1 extends curve
  /* "secp256k1" */ @js.native
  object secp256k1 extends TopLevel[secp256k1 with String]
  
  @js.native
  sealed trait secp256r1 extends curve
  /* "p256" */ @js.native
  object secp256r1 extends TopLevel[secp256r1 with String]
  
  @js.native
  sealed trait secp384r1 extends curve
  /* "p384" */ @js.native
  object secp384r1 extends TopLevel[secp384r1 with String]
  
  @js.native
  sealed trait secp521r1 extends curve
  /* "p521" */ @js.native
  object secp521r1 extends TopLevel[secp521r1 with String]
}
