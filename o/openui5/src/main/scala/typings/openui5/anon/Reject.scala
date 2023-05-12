package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reject extends StObject {
  
  var reject: js.Function
  
  var resolve: js.Function
}
object Reject {
  
  inline def apply(reject: js.Function, resolve: js.Function): Reject = {
    val __obj = js.Dynamic.literal(reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reject] (val x: Self) extends AnyVal {
    
    inline def setReject(value: js.Function): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: js.Function): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
  }
}
