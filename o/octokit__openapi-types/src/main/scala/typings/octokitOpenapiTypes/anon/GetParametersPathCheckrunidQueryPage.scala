package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathCheckrunidQueryPage extends StObject {
  
  /** Lists annotations for a check run using the annotation `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get annotations for a check run. OAuth Apps and authenticated users must have the `repo` scope to get annotations for a check run in a private repository. */
  var get: ParametersPathCheckrunidQueryPage
}
object GetParametersPathCheckrunidQueryPage {
  
  inline def apply(get: ParametersPathCheckrunidQueryPage): GetParametersPathCheckrunidQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathCheckrunidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathCheckrunidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathCheckrunidQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
