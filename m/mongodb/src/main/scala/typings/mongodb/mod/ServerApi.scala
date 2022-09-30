package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerApi extends StObject {
  
  var deprecationErrors: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var version: ServerApiVersion
}
object ServerApi {
  
  inline def apply(version: ServerApiVersion): ServerApi = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerApi]
  }
  
  extension [Self <: ServerApi](x: Self) {
    
    inline def setDeprecationErrors(value: Boolean): Self = StObject.set(x, "deprecationErrors", value.asInstanceOf[js.Any])
    
    inline def setDeprecationErrorsUndefined: Self = StObject.set(x, "deprecationErrors", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setVersion(value: ServerApiVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
