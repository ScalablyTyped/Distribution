package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.day
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.week
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `565` extends StObject {
  
  /** The time frame to display results for. */
  var per: js.UndefOr[typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty | day | week] = js.undefined
}
object `565` {
  
  inline def apply(): `565` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`565`]
  }
  
  extension [Self <: `565`](x: Self) {
    
    inline def setPer(value: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty | day | week): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
    
    inline def setPerUndefined: Self = StObject.set(x, "per", js.undefined)
  }
}
