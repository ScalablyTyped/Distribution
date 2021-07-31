package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserType extends StObject
@JSImport("ms-rest-azure", "UserType")
@js.native
object UserType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserType & Double] = js.native
  
  @js.native
  sealed trait servicePrincipal
    extends StObject
       with UserType
  /* 1 */ val servicePrincipal: typings.msRestAzure.mod.UserType.servicePrincipal & Double = js.native
  
  @js.native
  sealed trait user
    extends StObject
       with UserType
  /* 0 */ val user: typings.msRestAzure.mod.UserType.user & Double = js.native
}
