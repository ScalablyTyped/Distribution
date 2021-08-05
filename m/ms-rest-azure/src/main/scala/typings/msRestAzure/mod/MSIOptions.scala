package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSIOptions extends StObject {
  
  /**
    * @prop {string} [resource] -  The resource uri or token audience for which the token is needed.
    * For e.g. it can be:
    * - resourcemanagement endpoint "https://management.azure.com"(default) 
    * - management endpoint "https://management.core.windows.net/"
    */
  var resource: js.UndefOr[String] = js.undefined
}
object MSIOptions {
  
  inline def apply(): MSIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSIOptions]
  }
  
  extension [Self <: MSIOptions](x: Self) {
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
