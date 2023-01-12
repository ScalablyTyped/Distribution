package typings.meteor.anon

import typings.meteor.meteorMod.Meteor.User_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<meteor.meteor/react-meteor-accounts.WithUserProps> */
trait PartialWithUserProps extends StObject {
  
  var user: js.UndefOr[User_ | Null] = js.undefined
}
object PartialWithUserProps {
  
  inline def apply(): PartialWithUserProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWithUserProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialWithUserProps] (val x: Self) extends AnyVal {
    
    inline def setUser(value: User_): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
