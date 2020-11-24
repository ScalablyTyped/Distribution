package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait keyStatus extends js.Object
/**
  * Key status
  */
@JSImport("openpgp", "enums.keyStatus")
@js.native
object keyStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[keyStatus with Double] = js.native
  
  @js.native
  sealed trait expired extends keyStatus
  /* 1 */ @js.native
  object expired extends TopLevel[expired with Double]
  
  @js.native
  sealed trait invalid extends keyStatus
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  @js.native
  sealed trait no_self_cert extends keyStatus
  /* 4 */ @js.native
  object no_self_cert extends TopLevel[no_self_cert with Double]
  
  @js.native
  sealed trait revoked extends keyStatus
  /* 2 */ @js.native
  object revoked extends TopLevel[revoked with Double]
  
  @js.native
  sealed trait valid extends keyStatus
  /* 3 */ @js.native
  object valid extends TopLevel[valid with Double]
}
