package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgidRunnergroupid extends StObject {
  
  var parameters: PathOrgidRunnergroupid
}
object ParametersPathOrgidRunnergroupid {
  
  inline def apply(parameters: PathOrgidRunnergroupid): ParametersPathOrgidRunnergroupid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgidRunnergroupid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgidRunnergroupid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgidRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
