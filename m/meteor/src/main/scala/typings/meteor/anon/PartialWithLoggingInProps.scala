package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<meteor.meteor/react-meteor-accounts.WithLoggingInProps> */
trait PartialWithLoggingInProps extends StObject {
  
  var loggingIn: js.UndefOr[Boolean] = js.undefined
}
object PartialWithLoggingInProps {
  
  inline def apply(): PartialWithLoggingInProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWithLoggingInProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialWithLoggingInProps] (val x: Self) extends AnyVal {
    
    inline def setLoggingIn(value: Boolean): Self = StObject.set(x, "loggingIn", value.asInstanceOf[js.Any])
    
    inline def setLoggingInUndefined: Self = StObject.set(x, "loggingIn", js.undefined)
  }
}
