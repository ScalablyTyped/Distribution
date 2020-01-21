package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait features extends js.Object

/**
  * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-5.2.3.25|RFC4880bis-04, section 5.2.3.25}
  */
@JSImport("openpgp", "enums.features")
@js.native
object features extends js.Object {
  /**
    * 0x02 - AEAD Encrypted Data Packet (packet 20) and version 5
    * Symmetric-Key Encrypted Session Key Packets (packet 3)
    */
  @js.native
  sealed trait aead extends features
  
  /**
    * 0x01 - Modification Detection (packets 18 and 19)
    */
  @js.native
  sealed trait modification_detection extends features
  
  /**
    * 0x04 - Version 5 Public-Key Packet format and corresponding new
    * fingerprint format
    */
  @js.native
  sealed trait v5_keys extends features
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[features with Double] = js.native
  /* 2 */ @js.native
  object aead
    extends TopLevel[typings.openpgp.mod.enums.features.aead with Double]
  
  /* 1 */ @js.native
  object modification_detection extends TopLevel[modification_detection with Double]
  
  /* 4 */ @js.native
  object v5_keys extends TopLevel[v5_keys with Double]
  
}

