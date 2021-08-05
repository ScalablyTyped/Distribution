package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosAppInfo extends StObject {
  
  /** The name of the app. Required */
  var name: js.UndefOr[String] = js.undefined
}
object IosAppInfo {
  
  inline def apply(): IosAppInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosAppInfo]
  }
  
  extension [Self <: IosAppInfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
