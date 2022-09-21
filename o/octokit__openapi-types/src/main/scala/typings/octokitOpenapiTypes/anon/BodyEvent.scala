package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.APPROVE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COMMENT
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.REQUEST_CHANGES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyEvent extends StObject {
  
  /** @description The body text of the pull request review */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * @description The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. When you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to `PENDING`, which means you will need to re-submit the pull request review using a review action.
    * @enum {string}
    */
  var event: APPROVE | REQUEST_CHANGES | COMMENT
}
object BodyEvent {
  
  inline def apply(event: APPROVE | REQUEST_CHANGES | COMMENT): BodyEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyEvent]
  }
  
  extension [Self <: BodyEvent](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setEvent(value: APPROVE | REQUEST_CHANGES | COMMENT): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
