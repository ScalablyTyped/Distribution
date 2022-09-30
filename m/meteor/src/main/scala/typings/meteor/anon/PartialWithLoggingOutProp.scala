package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<meteor.meteor/react-meteor-accounts.WithLoggingOutProps> */
trait PartialWithLoggingOutProp extends StObject {
  
  var loggingOut: js.UndefOr[Boolean] = js.undefined
}
object PartialWithLoggingOutProp {
  
  inline def apply(): PartialWithLoggingOutProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWithLoggingOutProp]
  }
  
  extension [Self <: PartialWithLoggingOutProp](x: Self) {
    
    inline def setLoggingOut(value: Boolean): Self = StObject.set(x, "loggingOut", value.asInstanceOf[js.Any])
    
    inline def setLoggingOutUndefined: Self = StObject.set(x, "loggingOut", js.undefined)
  }
}
