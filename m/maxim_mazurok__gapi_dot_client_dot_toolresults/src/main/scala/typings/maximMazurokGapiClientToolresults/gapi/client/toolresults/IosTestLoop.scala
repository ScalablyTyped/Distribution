package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosTestLoop extends StObject {
  
  /** Bundle ID of the app. */
  var bundleId: js.UndefOr[String] = js.undefined
}
object IosTestLoop {
  
  inline def apply(): IosTestLoop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosTestLoop]
  }
  
  extension [Self <: IosTestLoop](x: Self) {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
  }
}
