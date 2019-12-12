package typings.openpgp.openpgpMod.enums

import org.scalablytyped.runtime.TopLevel
import typings.openpgp.openpgpMod.enums.aead.eax
import typings.openpgp.openpgpMod.enums.aead.experimental_gcm
import typings.openpgp.openpgpMod.enums.aead.ocb
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[aead with Double] = js.native
  /* 1 */ @js.native
  object eax extends TopLevel[eax with Double]
  
  /* 100 */ @js.native
  object experimental_gcm extends TopLevel[experimental_gcm with Double]
  
  /* 2 */ @js.native
  object ocb extends TopLevel[ocb with Double]
  
}

