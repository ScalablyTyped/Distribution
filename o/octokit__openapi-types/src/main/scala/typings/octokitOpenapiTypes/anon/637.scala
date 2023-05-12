package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.day
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.week
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `637` extends StObject {
  
  var per: js.UndefOr[day | week] = js.undefined
}
object `637` {
  
  inline def apply(): `637` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`637`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `637`] (val x: Self) extends AnyVal {
    
    inline def setPer(value: day | week): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
    
    inline def setPerUndefined: Self = StObject.set(x, "per", js.undefined)
  }
}
