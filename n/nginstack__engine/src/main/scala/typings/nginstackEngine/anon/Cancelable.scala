package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancelable extends StObject {
  
  var cancelable: Boolean
}
object Cancelable {
  
  inline def apply(cancelable: Boolean): Cancelable = {
    val __obj = js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cancelable] (val x: Self) extends AnyVal {
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
  }
}
