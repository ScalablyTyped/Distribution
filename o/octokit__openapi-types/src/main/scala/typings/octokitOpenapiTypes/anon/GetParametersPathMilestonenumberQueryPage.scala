package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathMilestonenumberQueryPage extends StObject {
  
  var get: ParametersPathMilestonenumberQueryPage
}
object GetParametersPathMilestonenumberQueryPage {
  
  inline def apply(get: ParametersPathMilestonenumberQueryPage): GetParametersPathMilestonenumberQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathMilestonenumberQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathMilestonenumberQueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathMilestonenumberQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
