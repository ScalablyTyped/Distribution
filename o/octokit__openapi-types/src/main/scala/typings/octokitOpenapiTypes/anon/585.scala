package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.day
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.week
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `585` extends StObject {
  
  /** The time frame to display results for. */
  var per: js.UndefOr[typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty | day | week] = js.undefined
}
object `585` {
  
  inline def apply(): `585` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`585`]
  }
  
  extension [Self <: `585`](x: Self) {
    
    inline def setPer(value: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty | day | week): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
    
    inline def setPerUndefined: Self = StObject.set(x, "per", js.undefined)
  }
}
