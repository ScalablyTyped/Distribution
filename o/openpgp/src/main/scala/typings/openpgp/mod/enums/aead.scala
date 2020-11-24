package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait aead extends js.Object
/**
  * {@link https://tools.ietf.org/html/draft-ietf-openpgp-rfc4880bis-04#section-9.6|RFC4880bis-04, section 9.6}
  */
@JSImport("openpgp", "enums.aead")
@js.native
object aead extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[aead with Double] = js.native
  
  @js.native
  sealed trait eax extends aead
  /* 1 */ @js.native
  object eax extends TopLevel[eax with Double]
  
  @js.native
  sealed trait experimental_gcm extends aead
  /* 100 */ @js.native
  object experimental_gcm extends TopLevel[experimental_gcm with Double]
  
  @js.native
  sealed trait ocb extends aead
  /* 2 */ @js.native
  object ocb extends TopLevel[ocb with Double]
}
