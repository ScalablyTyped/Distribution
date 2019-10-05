package typings.openpgp.openpgpMod.enums

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
  
  /* 1 */ val expired: typings.openpgp.openpgpMod.enums.keyStatus.expired with Double = js.native
  /* 0 */ val invalid: typings.openpgp.openpgpMod.enums.keyStatus.invalid with Double = js.native
  /* 4 */ val no_self_cert: typings.openpgp.openpgpMod.enums.keyStatus.no_self_cert with Double = js.native
  /* 2 */ val revoked: typings.openpgp.openpgpMod.enums.keyStatus.revoked with Double = js.native
  /* 3 */ val valid: typings.openpgp.openpgpMod.enums.keyStatus.valid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[keyStatus with Double] = js.native
}

