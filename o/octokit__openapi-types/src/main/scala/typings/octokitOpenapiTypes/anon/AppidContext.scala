package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppidContext extends StObject {
  
  var app_id: Double | Null
  
  /** @example continuous-integration/travis-ci */
  var context: String
}
object AppidContext {
  
  inline def apply(context: String): AppidContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], app_id = null)
    __obj.asInstanceOf[AppidContext]
  }
  
  extension [Self <: AppidContext](x: Self) {
    
    inline def setApp_id(value: Double): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setApp_idNull: Self = StObject.set(x, "app_id", null)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
