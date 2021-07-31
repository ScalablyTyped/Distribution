package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait features extends StObject
/**
  * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-5.2.3.25|RFC4880bis-04, section 5.2.3.25}
  */
@JSImport("openpgp", "enums.features")
@js.native
object features extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[features & Double] = js.native
  
  /**
    * 0x02 - AEAD Encrypted Data Packet (packet 20) and version 5
    * Symmetric-Key Encrypted Session Key Packets (packet 3)
    */
  @js.native
  sealed trait aead
    extends StObject
       with features
  /* 2 */ val aead: typings.openpgp.mod.enums.features.aead & Double = js.native
  
  /**
    * 0x01 - Modification Detection (packets 18 and 19)
    */
  @js.native
  sealed trait modification_detection
    extends StObject
       with features
  /* 1 */ val modification_detection: typings.openpgp.mod.enums.features.modification_detection & Double = js.native
  
  /**
    * 0x04 - Version 5 Public-Key Packet format and corresponding new
    * fingerprint format
    */
  @js.native
  sealed trait v5_keys
    extends StObject
       with features
  /* 4 */ val v5_keys: typings.openpgp.mod.enums.features.v5_keys & Double = js.native
}
