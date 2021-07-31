package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait curve extends StObject
/**
  * Maps curve names under various standards to one
  * @see
  */
@JSImport("openpgp", "enums.curve")
@js.native
object curve extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[curve & String] = js.native
  
  @js.native
  sealed trait `1Dot2Dot840Dot10045Dot3Dot1Dot7`
    extends StObject
       with curve
  /* "p256" */ val `1Dot2Dot840Dot10045Dot3Dot1Dot7`: typings.openpgp.mod.enums.curve.`1Dot2Dot840Dot10045Dot3Dot1Dot7` & String = js.native
  
  @js.native
  sealed trait `1Dot3Dot132Dot0Dot10`
    extends StObject
       with curve
  /* "secp256k1" */ val `1Dot3Dot132Dot0Dot10`: typings.openpgp.mod.enums.curve.`1Dot3Dot132Dot0Dot10` & String = js.native
  
  @js.native
  sealed trait `1Dot3Dot132Dot0Dot34`
    extends StObject
       with curve
  /* "p384" */ val `1Dot3Dot132Dot0Dot34`: typings.openpgp.mod.enums.curve.`1Dot3Dot132Dot0Dot34` & String = js.native
  
  @js.native
  sealed trait `1Dot3Dot132Dot0Dot35`
    extends StObject
       with curve
  /* "p521" */ val `1Dot3Dot132Dot0Dot35`: typings.openpgp.mod.enums.curve.`1Dot3Dot132Dot0Dot35` & String = js.native
  
  @js.native
  sealed trait `1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot11`
    extends StObject
       with curve
  /* "brainpoolP384r1" */ val `1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot11`: typings.openpgp.mod.enums.curve.`1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot11` & String = js.native
  
  @js.native
  sealed trait `1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot13`
    extends StObject
       with curve
  /* "brainpoolP512r1" */ val `1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot13`: typings.openpgp.mod.enums.curve.`1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot13` & String = js.native
  
  @js.native
  sealed trait `1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot7`
    extends StObject
       with curve
  /* "brainpoolP256r1" */ val `1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot7`: typings.openpgp.mod.enums.curve.`1Dot3Dot36Dot3Dot3Dot2Dot8Dot1Dot1Dot7` & String = js.native
  
  @js.native
  sealed trait `1Dot3Dot6Dot1Dot4Dot1Dot11591Dot15Dot1`
    extends StObject
       with curve
  /* "ed25519" */ val `1Dot3Dot6Dot1Dot4Dot1Dot11591Dot15Dot1`: typings.openpgp.mod.enums.curve.`1Dot3Dot6Dot1Dot4Dot1Dot11591Dot15Dot1` & String = js.native
  
  @js.native
  sealed trait `1Dot3Dot6Dot1Dot4Dot1Dot3029Dot1Dot5Dot1`
    extends StObject
       with curve
  /* "curve25519" */ val `1Dot3Dot6Dot1Dot4Dot1Dot3029Dot1Dot5Dot1`: typings.openpgp.mod.enums.curve.`1Dot3Dot6Dot1Dot4Dot1Dot3029Dot1Dot5Dot1` & String = js.native
  
  @js.native
  sealed trait `2A8648CE3D030107`
    extends StObject
       with curve
  /* "p256" */ val `2A8648CE3D030107`: typings.openpgp.mod.enums.curve.`2A8648CE3D030107` & String = js.native
  
  @js.native
  sealed trait `2B060104019755010501`
    extends StObject
       with curve
  /* "curve25519" */ val `2B060104019755010501`: typings.openpgp.mod.enums.curve.`2B060104019755010501` & String = js.native
  
  @js.native
  sealed trait `2B06010401DA470F01`
    extends StObject
       with curve
  /* "ed25519" */ val `2B06010401DA470F01`: typings.openpgp.mod.enums.curve.`2B06010401DA470F01` & String = js.native
  
  @js.native
  sealed trait `2B2403030208010107`
    extends StObject
       with curve
  /* "brainpoolP256r1" */ val `2B2403030208010107`: typings.openpgp.mod.enums.curve.`2B2403030208010107` & String = js.native
  
  @js.native
  sealed trait `2B240303020801010B`
    extends StObject
       with curve
  /* "brainpoolP384r1" */ val `2B240303020801010B`: typings.openpgp.mod.enums.curve.`2B240303020801010B` & String = js.native
  
  @js.native
  sealed trait `2B240303020801010D`
    extends StObject
       with curve
  /* "brainpoolP512r1" */ val `2B240303020801010D`: typings.openpgp.mod.enums.curve.`2B240303020801010D` & String = js.native
  
  @js.native
  sealed trait `2B8104000A`
    extends StObject
       with curve
  /* "secp256k1" */ val `2B8104000A`: typings.openpgp.mod.enums.curve.`2B8104000A` & String = js.native
  
  @js.native
  sealed trait `2B81040022`
    extends StObject
       with curve
  /* "p384" */ val `2B81040022`: typings.openpgp.mod.enums.curve.`2B81040022` & String = js.native
  
  @js.native
  sealed trait `2B81040023`
    extends StObject
       with curve
  /* "p521" */ val `2B81040023`: typings.openpgp.mod.enums.curve.`2B81040023` & String = js.native
  
  @js.native
  sealed trait `2a8648ce3d030107`
    extends StObject
       with curve
  /* "p256" */ val `2a8648ce3d030107`: typings.openpgp.mod.enums.curve.`2a8648ce3d030107` & String = js.native
  
  @js.native
  sealed trait `2b060104019755010501`
    extends StObject
       with curve
  /* "curve25519" */ val `2b060104019755010501`: typings.openpgp.mod.enums.curve.`2b060104019755010501` & String = js.native
  
  @js.native
  sealed trait `2b06010401da470f01`
    extends StObject
       with curve
  /* "ed25519" */ val `2b06010401da470f01`: typings.openpgp.mod.enums.curve.`2b06010401da470f01` & String = js.native
  
  @js.native
  sealed trait `2b2403030208010107`
    extends StObject
       with curve
  /* "brainpoolP256r1" */ val `2b2403030208010107`: typings.openpgp.mod.enums.curve.`2b2403030208010107` & String = js.native
  
  @js.native
  sealed trait `2b240303020801010b`
    extends StObject
       with curve
  /* "brainpoolP384r1" */ val `2b240303020801010b`: typings.openpgp.mod.enums.curve.`2b240303020801010b` & String = js.native
  
  @js.native
  sealed trait `2b240303020801010d`
    extends StObject
       with curve
  /* "brainpoolP512r1" */ val `2b240303020801010d`: typings.openpgp.mod.enums.curve.`2b240303020801010d` & String = js.native
  
  @js.native
  sealed trait `2b8104000a`
    extends StObject
       with curve
  /* "secp256k1" */ val `2b8104000a`: typings.openpgp.mod.enums.curve.`2b8104000a` & String = js.native
  
  @js.native
  sealed trait `2b81040022`
    extends StObject
       with curve
  /* "p384" */ val `2b81040022`: typings.openpgp.mod.enums.curve.`2b81040022` & String = js.native
  
  @js.native
  sealed trait `2b81040023`
    extends StObject
       with curve
  /* "p521" */ val `2b81040023`: typings.openpgp.mod.enums.curve.`2b81040023` & String = js.native
  
  @js.native
  sealed trait Curve25519
    extends StObject
       with curve
  /* "curve25519" */ val Curve25519: typings.openpgp.mod.enums.curve.Curve25519 & String = js.native
  
  /**
    * Ed25519
    */
  @js.native
  sealed trait ED25519
    extends StObject
       with curve
  /* "ed25519" */ val ED25519: typings.openpgp.mod.enums.curve.ED25519 & String = js.native
  
  @js.native
  sealed trait Ed25519
    extends StObject
       with curve
  /* "ed25519" */ val Ed25519: typings.openpgp.mod.enums.curve.Ed25519 & String = js.native
  
  @js.native
  sealed trait `P-256`
    extends StObject
       with curve
  /* "p256" */ val `P-256`: typings.openpgp.mod.enums.curve.`P-256` & String = js.native
  
  @js.native
  sealed trait `P-384`
    extends StObject
       with curve
  /* "p384" */ val `P-384`: typings.openpgp.mod.enums.curve.`P-384` & String = js.native
  
  @js.native
  sealed trait `P-521`
    extends StObject
       with curve
  /* "p521" */ val `P-521`: typings.openpgp.mod.enums.curve.`P-521` & String = js.native
  
  /**
    * Curve25519
    */
  @js.native
  sealed trait X25519
    extends StObject
       with curve
  /* "curve25519" */ val X25519: typings.openpgp.mod.enums.curve.X25519 & String = js.native
  
  /**
    * BrainpoolP256r1 Curve
    */
  @js.native
  sealed trait brainpoolP256r1
    extends StObject
       with curve
  /* "brainpoolP256r1" */ val brainpoolP256r1: typings.openpgp.mod.enums.curve.brainpoolP256r1 & String = js.native
  
  /**
    * BrainpoolP384r1 Curve
    */
  @js.native
  sealed trait brainpoolP384r1
    extends StObject
       with curve
  /* "brainpoolP384r1" */ val brainpoolP384r1: typings.openpgp.mod.enums.curve.brainpoolP384r1 & String = js.native
  
  /**
    * BrainpoolP512r1 Curve
    */
  @js.native
  sealed trait brainpoolP512r1
    extends StObject
       with curve
  /* "brainpoolP512r1" */ val brainpoolP512r1: typings.openpgp.mod.enums.curve.brainpoolP512r1 & String = js.native
  
  @js.native
  sealed trait curve25519
    extends StObject
       with curve
  /* "curve25519" */ val curve25519: typings.openpgp.mod.enums.curve.curve25519 & String = js.native
  
  @js.native
  sealed trait cv25519
    extends StObject
       with curve
  /* "curve25519" */ val cv25519: typings.openpgp.mod.enums.curve.cv25519 & String = js.native
  
  @js.native
  sealed trait ed25519
    extends StObject
       with curve
  /* "ed25519" */ val ed25519: typings.openpgp.mod.enums.curve.ed25519 & String = js.native
  
  /**
    * NIST P-256 Curve
    */
  @js.native
  sealed trait p256
    extends StObject
       with curve
  /* "p256" */ val p256: typings.openpgp.mod.enums.curve.p256 & String = js.native
  
  /**
    * NIST P-384 Curve
    */
  @js.native
  sealed trait p384
    extends StObject
       with curve
  /* "p384" */ val p384: typings.openpgp.mod.enums.curve.p384 & String = js.native
  
  /**
    * NIST P-521 Curve
    */
  @js.native
  sealed trait p521
    extends StObject
       with curve
  /* "p521" */ val p521: typings.openpgp.mod.enums.curve.p521 & String = js.native
  
  @js.native
  sealed trait prime256v1
    extends StObject
       with curve
  /* "p256" */ val prime256v1: typings.openpgp.mod.enums.curve.prime256v1 & String = js.native
  
  /**
    * SECG SECP256k1 Curve
    */
  @js.native
  sealed trait secp256k1
    extends StObject
       with curve
  /* "secp256k1" */ val secp256k1: typings.openpgp.mod.enums.curve.secp256k1 & String = js.native
  
  @js.native
  sealed trait secp256r1
    extends StObject
       with curve
  /* "p256" */ val secp256r1: typings.openpgp.mod.enums.curve.secp256r1 & String = js.native
  
  @js.native
  sealed trait secp384r1
    extends StObject
       with curve
  /* "p384" */ val secp384r1: typings.openpgp.mod.enums.curve.secp384r1 & String = js.native
  
  @js.native
  sealed trait secp521r1
    extends StObject
       with curve
  /* "p521" */ val secp521r1: typings.openpgp.mod.enums.curve.secp521r1 & String = js.native
}
