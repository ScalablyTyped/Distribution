package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosDeviceType extends StObject {
  
  // Whether the app should run on iPads.
  var iPad: js.UndefOr[Boolean] = js.undefined
  
  // Whether the app should run on iPhones and iPods.
  var iPhoneAndIPod: js.UndefOr[Boolean] = js.undefined
}
object IosDeviceType {
  
  inline def apply(): IosDeviceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDeviceType]
  }
  
  extension [Self <: IosDeviceType](x: Self) {
    
    inline def setIPad(value: Boolean): Self = StObject.set(x, "iPad", value.asInstanceOf[js.Any])
    
    inline def setIPadUndefined: Self = StObject.set(x, "iPad", js.undefined)
    
    inline def setIPhoneAndIPod(value: Boolean): Self = StObject.set(x, "iPhoneAndIPod", value.asInstanceOf[js.Any])
    
    inline def setIPhoneAndIPodUndefined: Self = StObject.set(x, "iPhoneAndIPod", js.undefined)
  }
}
