package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrgUsername extends StObject {
  
  /** This is the user's organization dashboard. You must be authenticated as the user to view this. */
  var get: ParametersPathOrgUsername
}
object GetParametersPathOrgUsername {
  
  inline def apply(get: ParametersPathOrgUsername): GetParametersPathOrgUsername = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrgUsername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOrgUsername] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOrgUsername): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
