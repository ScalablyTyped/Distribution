package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dismissed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.fix_started
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.inaccurate
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.no_bandwidth
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.not_used
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.tolerable_risk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dismissedreason extends StObject {
  
  /** @description An optional comment associated with dismissing the alert. */
  var dismissed_comment: js.UndefOr[String] = js.undefined
  
  /**
    * @description **Required when `state` is `dismissed`.** A reason for dismissing the alert.
    * @enum {string}
    */
  var dismissed_reason: js.UndefOr[fix_started | inaccurate | no_bandwidth | not_used | tolerable_risk] = js.undefined
  
  /**
    * @description The state of the Dependabot alert.
    * A `dismissed_reason` must be provided when setting the state to `dismissed`.
    * @enum {string}
    */
  var state: dismissed | open
}
object Dismissedreason {
  
  inline def apply(state: dismissed | open): Dismissedreason = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dismissedreason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dismissedreason] (val x: Self) extends AnyVal {
    
    inline def setDismissed_comment(value: String): Self = StObject.set(x, "dismissed_comment", value.asInstanceOf[js.Any])
    
    inline def setDismissed_commentUndefined: Self = StObject.set(x, "dismissed_comment", js.undefined)
    
    inline def setDismissed_reason(value: fix_started | inaccurate | no_bandwidth | not_used | tolerable_risk): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    inline def setDismissed_reasonUndefined: Self = StObject.set(x, "dismissed_reason", js.undefined)
    
    inline def setState(value: dismissed | open): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
