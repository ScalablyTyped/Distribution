package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait aead extends StObject
/**
  * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-9.6|RFC4880bis-04, section 9.6}
  */
@JSImport("openpgp", "enums.aead")
@js.native
object aead extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[aead & Double] = js.native
  
  @js.native
  sealed trait eax
    extends StObject
       with aead
  /* 1 */ val eax: typings.openpgp.mod.enums.aead.eax & Double = js.native
  
  @js.native
  sealed trait experimental_gcm
    extends StObject
       with aead
  /* 100 */ val experimental_gcm: typings.openpgp.mod.enums.aead.experimental_gcm & Double = js.native
  
  @js.native
  sealed trait ocb
    extends StObject
       with aead
  /* 2 */ val ocb: typings.openpgp.mod.enums.aead.ocb & Double = js.native
}
