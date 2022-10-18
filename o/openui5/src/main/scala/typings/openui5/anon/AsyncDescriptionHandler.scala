package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncDescriptionHandler extends StObject {
  
  /**
    * The description handler
    */
  var asyncDescriptionHandler: js.Function
  
  /**
    * The URL handler
    */
  var asyncURLHandler: js.Function
}
object AsyncDescriptionHandler {
  
  inline def apply(asyncDescriptionHandler: js.Function, asyncURLHandler: js.Function): AsyncDescriptionHandler = {
    val __obj = js.Dynamic.literal(asyncDescriptionHandler = asyncDescriptionHandler.asInstanceOf[js.Any], asyncURLHandler = asyncURLHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncDescriptionHandler]
  }
  
  extension [Self <: AsyncDescriptionHandler](x: Self) {
    
    inline def setAsyncDescriptionHandler(value: js.Function): Self = StObject.set(x, "asyncDescriptionHandler", value.asInstanceOf[js.Any])
    
    inline def setAsyncURLHandler(value: js.Function): Self = StObject.set(x, "asyncURLHandler", value.asInstanceOf[js.Any])
  }
}
