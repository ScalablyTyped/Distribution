package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedDelta extends StObject {
  
  var sharedDelta: Boolean
}
object SharedDelta {
  
  inline def apply(sharedDelta: Boolean): SharedDelta = {
    val __obj = js.Dynamic.literal(sharedDelta = sharedDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedDelta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedDelta] (val x: Self) extends AnyVal {
    
    inline def setSharedDelta(value: Boolean): Self = StObject.set(x, "sharedDelta", value.asInstanceOf[js.Any])
  }
}
