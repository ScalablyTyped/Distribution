package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait packet extends js.Object
/**
  * A list of packet types and numeric tags associated with them.
  */
@JSImport("openpgp", "enums.packet")
@js.native
object packet extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[packet with Double] = js.native
  
  @js.native
  sealed trait compressed extends packet
  /* 8 */ @js.native
  object compressed extends TopLevel[compressed with Double]
  
  @js.native
  sealed trait literal extends packet
  /* 11 */ @js.native
  object literal
    extends TopLevel[typings.openpgp.mod.enums.packet.literal with Double]
  
  @js.native
  sealed trait marker extends packet
  /* 10 */ @js.native
  object marker extends TopLevel[marker with Double]
  
  @js.native
  sealed trait modificationDetectionCode extends packet
  /* 19 */ @js.native
  object modificationDetectionCode extends TopLevel[modificationDetectionCode with Double]
  
  @js.native
  sealed trait onePassSignature extends packet
  /* 4 */ @js.native
  object onePassSignature extends TopLevel[onePassSignature with Double]
  
  @js.native
  sealed trait publicKey extends packet
  /* 6 */ @js.native
  object publicKey
    extends TopLevel[typings.openpgp.mod.enums.packet.publicKey with Double]
  
  @js.native
  sealed trait publicKeyEncryptedSessionKey extends packet
  /* 1 */ @js.native
  object publicKeyEncryptedSessionKey extends TopLevel[publicKeyEncryptedSessionKey with Double]
  
  @js.native
  sealed trait publicSubkey extends packet
  /* 14 */ @js.native
  object publicSubkey extends TopLevel[publicSubkey with Double]
  
  @js.native
  sealed trait secretKey extends packet
  /* 5 */ @js.native
  object secretKey extends TopLevel[secretKey with Double]
  
  @js.native
  sealed trait secretSubkey extends packet
  /* 7 */ @js.native
  object secretSubkey extends TopLevel[secretSubkey with Double]
  
  @js.native
  sealed trait signature extends packet
  /* 2 */ @js.native
  object signature
    extends TopLevel[typings.openpgp.mod.enums.packet.signature with Double]
  
  @js.native
  sealed trait symEncryptedAEADProtected extends packet
  /* 20 */ @js.native
  object symEncryptedAEADProtected extends TopLevel[symEncryptedAEADProtected with Double]
  
  @js.native
  sealed trait symEncryptedIntegrityProtected extends packet
  /* 18 */ @js.native
  object symEncryptedIntegrityProtected extends TopLevel[symEncryptedIntegrityProtected with Double]
  
  @js.native
  sealed trait symEncryptedSessionKey extends packet
  /* 3 */ @js.native
  object symEncryptedSessionKey extends TopLevel[symEncryptedSessionKey with Double]
  
  @js.native
  sealed trait symmetricallyEncrypted extends packet
  /* 9 */ @js.native
  object symmetricallyEncrypted extends TopLevel[symmetricallyEncrypted with Double]
  
  @js.native
  sealed trait trust extends packet
  /* 12 */ @js.native
  object trust extends TopLevel[trust with Double]
  
  @js.native
  sealed trait userAttribute extends packet
  /* 17 */ @js.native
  object userAttribute extends TopLevel[userAttribute with Double]
  
  @js.native
  sealed trait userid extends packet
  /* 13 */ @js.native
  object userid extends TopLevel[userid with Double]
}
