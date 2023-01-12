package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<meteor.meteor/react-meteor-accounts.WithUserIdProps> */
trait PartialWithUserIdProps extends StObject {
  
  var userId: js.UndefOr[String | Null] = js.undefined
}
object PartialWithUserIdProps {
  
  inline def apply(): PartialWithUserIdProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWithUserIdProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialWithUserIdProps] (val x: Self) extends AnyVal {
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
