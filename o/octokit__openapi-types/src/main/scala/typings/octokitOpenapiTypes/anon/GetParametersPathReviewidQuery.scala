package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathReviewidQuery extends StObject {
  
  /**
    * List comments for a pull request review
    * @description List comments for a specific pull request review.
    */
  var get: ParametersPathReviewidQuery
}
object GetParametersPathReviewidQuery {
  
  inline def apply(get: ParametersPathReviewidQuery): GetParametersPathReviewidQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathReviewidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathReviewidQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathReviewidQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
