package typings.openpgp.openpgpMod.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait aead extends js.Object

/**
  * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-9.6|RFC4880bis-04, section 9.6}
  */
@JSImport("openpgp", "enums.aead")
@js.native
object aead extends js.Object {
  @js.native
  sealed trait eax extends aead
  
  @js.native
  sealed trait experimental_gcm extends aead
  
  @js.native
  sealed trait ocb extends aead
  
  /* 1 */ val eax: typings.openpgp.openpgpMod.enums.aead.eax with Double = js.native
  /* 100 */ val experimental_gcm: typings.openpgp.openpgpMod.enums.aead.experimental_gcm with Double = js.native
  /* 2 */ val ocb: typings.openpgp.openpgpMod.enums.aead.ocb with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[aead with Double] = js.native
}

