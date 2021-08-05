package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwallowErrors extends StObject {
  
  var swallowErrors: js.UndefOr[Boolean] = js.undefined
}
object SwallowErrors {
  
  inline def apply(): SwallowErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwallowErrors]
  }
  
  extension [Self <: SwallowErrors](x: Self) {
    
    inline def setSwallowErrors(value: Boolean): Self = StObject.set(x, "swallowErrors", value.asInstanceOf[js.Any])
    
    inline def setSwallowErrorsUndefined: Self = StObject.set(x, "swallowErrors", js.undefined)
  }
}
