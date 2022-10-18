package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.active
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `213` extends StObject {
  
  /**
    * @description The state that the membership should be in. Only `"active"` will be accepted.
    * @enum {string}
    */
  var state: active
}
object `213` {
  
  inline def apply(): `213` = {
    val __obj = js.Dynamic.literal(state = "active")
    __obj.asInstanceOf[`213`]
  }
  
  extension [Self <: `213`](x: Self) {
    
    inline def setState(value: active): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
