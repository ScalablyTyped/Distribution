package typings.openpgp.openpgpMod.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait packet extends js.Object

/**
  * A list of packet types and numeric tags associated with them.
  */
@JSImport("openpgp", "enums.packet")
@js.native
object packet extends js.Object {
  @js.native
  sealed trait compressed
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait literal
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait marker
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait modificationDetectionCode
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait onePassSignature
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait publicKey
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait publicKeyEncryptedSessionKey
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait publicSubkey
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait secretKey
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait secretSubkey
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait signature
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait symEncryptedAEADProtected
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait symEncryptedIntegrityProtected
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait symEncryptedSessionKey
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait symmetricallyEncrypted
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait trust
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait userAttribute
    extends typings.openpgp.openpgpMod.enums.packet
  
  @js.native
  sealed trait userid
    extends typings.openpgp.openpgpMod.enums.packet
  
  /* 8 */ val compressed: typings.openpgp.openpgpMod.enums.packet.compressed with Double = js.native
  /* 11 */ val literal: typings.openpgp.openpgpMod.enums.packet.literal with Double = js.native
  /* 10 */ val marker: typings.openpgp.openpgpMod.enums.packet.marker with Double = js.native
  /* 19 */ val modificationDetectionCode: typings.openpgp.openpgpMod.enums.packet.modificationDetectionCode with Double = js.native
  /* 4 */ val onePassSignature: typings.openpgp.openpgpMod.enums.packet.onePassSignature with Double = js.native
  /* 6 */ val publicKey: typings.openpgp.openpgpMod.enums.packet.publicKey with Double = js.native
  /* 1 */ val publicKeyEncryptedSessionKey: typings.openpgp.openpgpMod.enums.packet.publicKeyEncryptedSessionKey with Double = js.native
  /* 14 */ val publicSubkey: typings.openpgp.openpgpMod.enums.packet.publicSubkey with Double = js.native
  /* 5 */ val secretKey: typings.openpgp.openpgpMod.enums.packet.secretKey with Double = js.native
  /* 7 */ val secretSubkey: typings.openpgp.openpgpMod.enums.packet.secretSubkey with Double = js.native
  /* 2 */ val signature: typings.openpgp.openpgpMod.enums.packet.signature with Double = js.native
  /* 20 */ val symEncryptedAEADProtected: typings.openpgp.openpgpMod.enums.packet.symEncryptedAEADProtected with Double = js.native
  /* 18 */ val symEncryptedIntegrityProtected: typings.openpgp.openpgpMod.enums.packet.symEncryptedIntegrityProtected with Double = js.native
  /* 3 */ val symEncryptedSessionKey: typings.openpgp.openpgpMod.enums.packet.symEncryptedSessionKey with Double = js.native
  /* 9 */ val symmetricallyEncrypted: typings.openpgp.openpgpMod.enums.packet.symmetricallyEncrypted with Double = js.native
  /* 12 */ val trust: typings.openpgp.openpgpMod.enums.packet.trust with Double = js.native
  /* 17 */ val userAttribute: typings.openpgp.openpgpMod.enums.packet.userAttribute with Double = js.native
  /* 13 */ val userid: typings.openpgp.openpgpMod.enums.packet.userid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.openpgp.openpgpMod.enums.packet with Double] = js.native
}

