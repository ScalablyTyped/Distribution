package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathReviewidQueryPage extends StObject {
  
  /** List comments for a specific pull request review. */
  var get: ParametersPathReviewidQueryPage
}
object GetParametersPathReviewidQueryPage {
  
  inline def apply(get: ParametersPathReviewidQueryPage): GetParametersPathReviewidQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathReviewidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathReviewidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathReviewidQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
