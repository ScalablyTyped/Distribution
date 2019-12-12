package typings.openpgp.openpgpMod.enums

import org.scalablytyped.runtime.TopLevel
import typings.openpgp.openpgpMod.enums.keyStatus.expired
import typings.openpgp.openpgpMod.enums.keyStatus.invalid
import typings.openpgp.openpgpMod.enums.keyStatus.no_self_cert
import typings.openpgp.openpgpMod.enums.keyStatus.revoked
import typings.openpgp.openpgpMod.enums.keyStatus.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait keyStatus extends js.Object

/**
  * Key status
  */
@JSImport("openpgp", "enums.keyStatus")
@js.native
object keyStatus extends js.Object {
  @js.native
  sealed trait expired extends keyStatus
  
  @js.native
  sealed trait invalid extends keyStatus
  
  @js.native
  sealed trait no_self_cert extends keyStatus
  
  @js.native
  sealed trait revoked extends keyStatus
  
  @js.native
  sealed trait valid extends keyStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[keyStatus with Double] = js.native
  /* 1 */ @js.native
  object expired extends TopLevel[expired with Double]
  
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 4 */ @js.native
  object no_self_cert extends TopLevel[no_self_cert with Double]
  
  /* 2 */ @js.native
  object revoked extends TopLevel[revoked with Double]
  
  /* 3 */ @js.native
  object valid extends TopLevel[valid with Double]
  
}

