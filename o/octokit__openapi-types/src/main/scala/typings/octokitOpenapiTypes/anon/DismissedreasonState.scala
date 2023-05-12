package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`false positive`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`used in tests`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dismissed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DismissedreasonState extends StObject {
  
  var dismissed_comment: js.UndefOr[String | Null] = js.undefined
  
  var dismissed_reason: js.UndefOr[
    _empty | (`false positive`) | (/* won't fix */ String) | (`used in tests`) | Null
  ] = js.undefined
  
  var state: open | dismissed
}
object DismissedreasonState {
  
  inline def apply(state: open | dismissed): DismissedreasonState = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DismissedreasonState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DismissedreasonState] (val x: Self) extends AnyVal {
    
    inline def setDismissed_comment(value: String): Self = StObject.set(x, "dismissed_comment", value.asInstanceOf[js.Any])
    
    inline def setDismissed_commentNull: Self = StObject.set(x, "dismissed_comment", null)
    
    inline def setDismissed_commentUndefined: Self = StObject.set(x, "dismissed_comment", js.undefined)
    
    inline def setDismissed_reason(value: _empty | (`false positive`) | (/* won't fix */ String) | (`used in tests`)): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    inline def setDismissed_reasonNull: Self = StObject.set(x, "dismissed_reason", null)
    
    inline def setDismissed_reasonUndefined: Self = StObject.set(x, "dismissed_reason", js.undefined)
    
    inline def setState(value: open | dismissed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
