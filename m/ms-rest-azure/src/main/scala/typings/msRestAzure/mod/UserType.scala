package typings.msRestAzure.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserType with Double] = js.native
  /* 1 */ @js.native
  object servicePrincipal extends TopLevel[servicePrincipal with Double]
  
  /* 0 */ @js.native
  object user extends TopLevel[user with Double]
  
}

