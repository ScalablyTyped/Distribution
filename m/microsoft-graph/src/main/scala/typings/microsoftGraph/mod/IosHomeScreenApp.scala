package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosHomeScreenApp
  extends StObject
     with IosHomeScreenItem {
  
  // BundleID of app
  var bundleID: js.UndefOr[String] = js.undefined
}
object IosHomeScreenApp {
  
  inline def apply(): IosHomeScreenApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosHomeScreenApp]
  }
  
  extension [Self <: IosHomeScreenApp](x: Self) {
    
    inline def setBundleID(value: String): Self = StObject.set(x, "bundleID", value.asInstanceOf[js.Any])
    
    inline def setBundleIDUndefined: Self = StObject.set(x, "bundleID", js.undefined)
  }
}
