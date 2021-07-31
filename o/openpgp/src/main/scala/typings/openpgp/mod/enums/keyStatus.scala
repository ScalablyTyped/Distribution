package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def apply(value: Double): js.UndefOr[keyStatus & Double] = js.native
  
  @js.native
  sealed trait expired
    extends StObject
       with keyStatus
  /* 1 */ val expired: typings.openpgp.mod.enums.keyStatus.expired & Double = js.native
  
  @js.native
  sealed trait invalid
    extends StObject
       with keyStatus
  /* 0 */ val invalid: typings.openpgp.mod.enums.keyStatus.invalid & Double = js.native
  
  @js.native
  sealed trait no_self_cert
    extends StObject
       with keyStatus
  /* 4 */ val no_self_cert: typings.openpgp.mod.enums.keyStatus.no_self_cert & Double = js.native
  
  @js.native
  sealed trait revoked
    extends StObject
       with keyStatus
  /* 2 */ val revoked: typings.openpgp.mod.enums.keyStatus.revoked & Double = js.native
  
  @js.native
  sealed trait valid
    extends StObject
       with keyStatus
  /* 3 */ val valid: typings.openpgp.mod.enums.keyStatus.valid & Double = js.native
}
