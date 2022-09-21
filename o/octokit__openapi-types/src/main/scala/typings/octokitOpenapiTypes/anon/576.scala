package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.false_positive
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.resolved
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.revoked
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.used_in_tests
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.wont_fix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `576` extends StObject {
  
  var resolution: js.UndefOr[Null | false_positive | wont_fix | revoked | used_in_tests] = js.undefined
  
  var state: open | resolved
}
object `576` {
  
  inline def apply(state: open | resolved): `576` = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[`576`]
  }
  
  extension [Self <: `576`](x: Self) {
    
    inline def setResolution(value: false_positive | wont_fix | revoked | used_in_tests): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionNull: Self = StObject.set(x, "resolution", null)
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setState(value: open | resolved): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
