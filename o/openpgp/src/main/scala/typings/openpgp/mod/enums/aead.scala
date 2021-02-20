package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def apply(value: Double): js.UndefOr[aead with Double] = js.native
  
  @js.native
  sealed trait eax extends aead
  /* 1 */ val eax: typings.openpgp.mod.enums.aead.eax with Double = js.native
  
  @js.native
  sealed trait experimental_gcm extends aead
  /* 100 */ val experimental_gcm: typings.openpgp.mod.enums.aead.experimental_gcm with Double = js.native
  
  @js.native
  sealed trait ocb extends aead
  /* 2 */ val ocb: typings.openpgp.mod.enums.aead.ocb with Double = js.native
}
