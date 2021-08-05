package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosHomeScreenItem extends StObject {
  
  // Name of the app
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
}
object IosHomeScreenItem {
  
  inline def apply(): IosHomeScreenItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosHomeScreenItem]
  }
  
  extension [Self <: IosHomeScreenItem](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
