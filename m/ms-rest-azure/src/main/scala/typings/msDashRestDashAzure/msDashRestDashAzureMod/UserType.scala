package typings.msDashRestDashAzure.msDashRestDashAzureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserType extends js.Object

@JSImport("ms-rest-azure", "UserType")
@js.native
object UserType extends js.Object {
  @js.native
  sealed trait servicePrincipal extends UserType
  
  @js.native
  sealed trait user extends UserType
  
  /* 1 */ val servicePrincipal: typings.msDashRestDashAzure.msDashRestDashAzureMod.UserType.servicePrincipal with Double = js.native
  /* 0 */ val user: typings.msDashRestDashAzure.msDashRestDashAzureMod.UserType.user with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserType with Double] = js.native
}

