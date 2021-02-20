package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def apply(value: Double): js.UndefOr[packet with Double] = js.native
  
  @js.native
  sealed trait compressed extends packet
  /* 8 */ val compressed: typings.openpgp.mod.enums.packet.compressed with Double = js.native
  
  @js.native
  sealed trait literal extends packet
  /* 11 */ val literal: typings.openpgp.mod.enums.packet.literal with Double = js.native
  
  @js.native
  sealed trait marker extends packet
  /* 10 */ val marker: typings.openpgp.mod.enums.packet.marker with Double = js.native
  
  @js.native
  sealed trait modificationDetectionCode extends packet
  /* 19 */ val modificationDetectionCode: typings.openpgp.mod.enums.packet.modificationDetectionCode with Double = js.native
  
  @js.native
  sealed trait onePassSignature extends packet
  /* 4 */ val onePassSignature: typings.openpgp.mod.enums.packet.onePassSignature with Double = js.native
  
  @js.native
  sealed trait publicKey extends packet
  /* 6 */ val publicKey: typings.openpgp.mod.enums.packet.publicKey with Double = js.native
  
  @js.native
  sealed trait publicKeyEncryptedSessionKey extends packet
  /* 1 */ val publicKeyEncryptedSessionKey: typings.openpgp.mod.enums.packet.publicKeyEncryptedSessionKey with Double = js.native
  
  @js.native
  sealed trait publicSubkey extends packet
  /* 14 */ val publicSubkey: typings.openpgp.mod.enums.packet.publicSubkey with Double = js.native
  
  @js.native
  sealed trait secretKey extends packet
  /* 5 */ val secretKey: typings.openpgp.mod.enums.packet.secretKey with Double = js.native
  
  @js.native
  sealed trait secretSubkey extends packet
  /* 7 */ val secretSubkey: typings.openpgp.mod.enums.packet.secretSubkey with Double = js.native
  
  @js.native
  sealed trait signature extends packet
  /* 2 */ val signature: typings.openpgp.mod.enums.packet.signature with Double = js.native
  
  @js.native
  sealed trait symEncryptedAEADProtected extends packet
  /* 20 */ val symEncryptedAEADProtected: typings.openpgp.mod.enums.packet.symEncryptedAEADProtected with Double = js.native
  
  @js.native
  sealed trait symEncryptedIntegrityProtected extends packet
  /* 18 */ val symEncryptedIntegrityProtected: typings.openpgp.mod.enums.packet.symEncryptedIntegrityProtected with Double = js.native
  
  @js.native
  sealed trait symEncryptedSessionKey extends packet
  /* 3 */ val symEncryptedSessionKey: typings.openpgp.mod.enums.packet.symEncryptedSessionKey with Double = js.native
  
  @js.native
  sealed trait symmetricallyEncrypted extends packet
  /* 9 */ val symmetricallyEncrypted: typings.openpgp.mod.enums.packet.symmetricallyEncrypted with Double = js.native
  
  @js.native
  sealed trait trust extends packet
  /* 12 */ val trust: typings.openpgp.mod.enums.packet.trust with Double = js.native
  
  @js.native
  sealed trait userAttribute extends packet
  /* 17 */ val userAttribute: typings.openpgp.mod.enums.packet.userAttribute with Double = js.native
  
  @js.native
  sealed trait userid extends packet
  /* 13 */ val userid: typings.openpgp.mod.enums.packet.userid with Double = js.native
}
