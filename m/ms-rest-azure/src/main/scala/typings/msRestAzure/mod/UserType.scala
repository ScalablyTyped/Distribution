package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserType extends StObject
@JSImport("ms-rest-azure", "UserType")
@js.native
object UserType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserType with Double] = js.native
  
  @js.native
  sealed trait servicePrincipal extends UserType
  /* 1 */ val servicePrincipal: typings.msRestAzure.mod.UserType.servicePrincipal with Double = js.native
  
  @js.native
  sealed trait user extends UserType
  /* 0 */ val user: typings.msRestAzure.mod.UserType.user with Double = js.native
}
