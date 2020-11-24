package typings.msRestAzure.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserType extends js.Object
@JSImport("ms-rest-azure", "UserType")
@js.native
object UserType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserType with Double] = js.native
  
  @js.native
  sealed trait servicePrincipal extends UserType
  /* 1 */ @js.native
  object servicePrincipal extends TopLevel[servicePrincipal with Double]
  
  @js.native
  sealed trait user extends UserType
  /* 0 */ @js.native
  object user extends TopLevel[user with Double]
}
