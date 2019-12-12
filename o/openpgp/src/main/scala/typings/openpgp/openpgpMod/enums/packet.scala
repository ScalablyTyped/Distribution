package typings.openpgp.openpgpMod.enums

import org.scalablytyped.runtime.TopLevel
import typings.openpgp.openpgpMod.enums.packet.compressed
import typings.openpgp.openpgpMod.enums.packet.marker
import typings.openpgp.openpgpMod.enums.packet.modificationDetectionCode
import typings.openpgp.openpgpMod.enums.packet.onePassSignature
import typings.openpgp.openpgpMod.enums.packet.publicKeyEncryptedSessionKey
import typings.openpgp.openpgpMod.enums.packet.publicSubkey
import typings.openpgp.openpgpMod.enums.packet.secretKey
import typings.openpgp.openpgpMod.enums.packet.secretSubkey
import typings.openpgp.openpgpMod.enums.packet.symEncryptedAEADProtected
import typings.openpgp.openpgpMod.enums.packet.symEncryptedIntegrityProtected
import typings.openpgp.openpgpMod.enums.packet.symEncryptedSessionKey
import typings.openpgp.openpgpMod.enums.packet.symmetricallyEncrypted
import typings.openpgp.openpgpMod.enums.packet.trust
import typings.openpgp.openpgpMod.enums.packet.userAttribute
import typings.openpgp.openpgpMod.enums.packet.userid
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.openpgp.openpgpMod.enums.packet with Double] = js.native
  /* 8 */ @js.native
  object compressed extends TopLevel[compressed with Double]
  
  /* 11 */ @js.native
  object literal
    extends TopLevel[typings.openpgp.openpgpMod.enums.packet.literal with Double]
  
  /* 10 */ @js.native
  object marker extends TopLevel[marker with Double]
  
  /* 19 */ @js.native
  object modificationDetectionCode extends TopLevel[modificationDetectionCode with Double]
  
  /* 4 */ @js.native
  object onePassSignature extends TopLevel[onePassSignature with Double]
  
  /* 6 */ @js.native
  object publicKey
    extends TopLevel[typings.openpgp.openpgpMod.enums.packet.publicKey with Double]
  
  /* 1 */ @js.native
  object publicKeyEncryptedSessionKey extends TopLevel[publicKeyEncryptedSessionKey with Double]
  
  /* 14 */ @js.native
  object publicSubkey extends TopLevel[publicSubkey with Double]
  
  /* 5 */ @js.native
  object secretKey extends TopLevel[secretKey with Double]
  
  /* 7 */ @js.native
  object secretSubkey extends TopLevel[secretSubkey with Double]
  
  /* 2 */ @js.native
  object signature
    extends TopLevel[typings.openpgp.openpgpMod.enums.packet.signature with Double]
  
  /* 20 */ @js.native
  object symEncryptedAEADProtected extends TopLevel[symEncryptedAEADProtected with Double]
  
  /* 18 */ @js.native
  object symEncryptedIntegrityProtected extends TopLevel[symEncryptedIntegrityProtected with Double]
  
  /* 3 */ @js.native
  object symEncryptedSessionKey extends TopLevel[symEncryptedSessionKey with Double]
  
  /* 9 */ @js.native
  object symmetricallyEncrypted extends TopLevel[symmetricallyEncrypted with Double]
  
  /* 12 */ @js.native
  object trust extends TopLevel[trust with Double]
  
  /* 17 */ @js.native
  object userAttribute extends TopLevel[userAttribute with Double]
  
  /* 13 */ @js.native
  object userid extends TopLevel[userid with Double]
  
}

