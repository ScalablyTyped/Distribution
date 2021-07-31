package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait packet extends StObject
/**
  * A list of packet types and numeric tags associated with them.
  */
@JSImport("openpgp", "enums.packet")
@js.native
object packet extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[packet & Double] = js.native
  
  @js.native
  sealed trait compressed
    extends StObject
       with packet
  /* 8 */ val compressed: typings.openpgp.mod.enums.packet.compressed & Double = js.native
  
  @js.native
  sealed trait literal
    extends StObject
       with packet
  /* 11 */ val literal: typings.openpgp.mod.enums.packet.literal & Double = js.native
  
  @js.native
  sealed trait marker
    extends StObject
       with packet
  /* 10 */ val marker: typings.openpgp.mod.enums.packet.marker & Double = js.native
  
  @js.native
  sealed trait modificationDetectionCode
    extends StObject
       with packet
  /* 19 */ val modificationDetectionCode: typings.openpgp.mod.enums.packet.modificationDetectionCode & Double = js.native
  
  @js.native
  sealed trait onePassSignature
    extends StObject
       with packet
  /* 4 */ val onePassSignature: typings.openpgp.mod.enums.packet.onePassSignature & Double = js.native
  
  @js.native
  sealed trait publicKey
    extends StObject
       with packet
  /* 6 */ val publicKey: typings.openpgp.mod.enums.packet.publicKey & Double = js.native
  
  @js.native
  sealed trait publicKeyEncryptedSessionKey
    extends StObject
       with packet
  /* 1 */ val publicKeyEncryptedSessionKey: typings.openpgp.mod.enums.packet.publicKeyEncryptedSessionKey & Double = js.native
  
  @js.native
  sealed trait publicSubkey
    extends StObject
       with packet
  /* 14 */ val publicSubkey: typings.openpgp.mod.enums.packet.publicSubkey & Double = js.native
  
  @js.native
  sealed trait secretKey
    extends StObject
       with packet
  /* 5 */ val secretKey: typings.openpgp.mod.enums.packet.secretKey & Double = js.native
  
  @js.native
  sealed trait secretSubkey
    extends StObject
       with packet
  /* 7 */ val secretSubkey: typings.openpgp.mod.enums.packet.secretSubkey & Double = js.native
  
  @js.native
  sealed trait signature
    extends StObject
       with packet
  /* 2 */ val signature: typings.openpgp.mod.enums.packet.signature & Double = js.native
  
  @js.native
  sealed trait symEncryptedAEADProtected
    extends StObject
       with packet
  /* 20 */ val symEncryptedAEADProtected: typings.openpgp.mod.enums.packet.symEncryptedAEADProtected & Double = js.native
  
  @js.native
  sealed trait symEncryptedIntegrityProtected
    extends StObject
       with packet
  /* 18 */ val symEncryptedIntegrityProtected: typings.openpgp.mod.enums.packet.symEncryptedIntegrityProtected & Double = js.native
  
  @js.native
  sealed trait symEncryptedSessionKey
    extends StObject
       with packet
  /* 3 */ val symEncryptedSessionKey: typings.openpgp.mod.enums.packet.symEncryptedSessionKey & Double = js.native
  
  @js.native
  sealed trait symmetricallyEncrypted
    extends StObject
       with packet
  /* 9 */ val symmetricallyEncrypted: typings.openpgp.mod.enums.packet.symmetricallyEncrypted & Double = js.native
  
  @js.native
  sealed trait trust
    extends StObject
       with packet
  /* 12 */ val trust: typings.openpgp.mod.enums.packet.trust & Double = js.native
  
  @js.native
  sealed trait userAttribute
    extends StObject
       with packet
  /* 17 */ val userAttribute: typings.openpgp.mod.enums.packet.userAttribute & Double = js.native
  
  @js.native
  sealed trait userid
    extends StObject
       with packet
  /* 13 */ val userid: typings.openpgp.mod.enums.packet.userid & Double = js.native
}
