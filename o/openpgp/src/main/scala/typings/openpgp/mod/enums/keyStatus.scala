package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait keyStatus extends StObject
/**
  * Key status
  */
@JSImport("openpgp", "enums.keyStatus")
@js.native
object keyStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[keyStatus with Double] = js.native
  
  @js.native
  sealed trait expired extends keyStatus
  /* 1 */ val expired: typings.openpgp.mod.enums.keyStatus.expired with Double = js.native
  
  @js.native
  sealed trait invalid extends keyStatus
  /* 0 */ val invalid: typings.openpgp.mod.enums.keyStatus.invalid with Double = js.native
  
  @js.native
  sealed trait no_self_cert extends keyStatus
  /* 4 */ val no_self_cert: typings.openpgp.mod.enums.keyStatus.no_self_cert with Double = js.native
  
  @js.native
  sealed trait revoked extends keyStatus
  /* 2 */ val revoked: typings.openpgp.mod.enums.keyStatus.revoked with Double = js.native
  
  @js.native
  sealed trait valid extends keyStatus
  /* 3 */ val valid: typings.openpgp.mod.enums.keyStatus.valid with Double = js.native
}
