package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCancelCbArgument extends StObject {
  
  var reason: String
}
object OnCancelCbArgument {
  
  inline def apply(reason: String): OnCancelCbArgument = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCancelCbArgument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnCancelCbArgument] (val x: Self) extends AnyVal {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
