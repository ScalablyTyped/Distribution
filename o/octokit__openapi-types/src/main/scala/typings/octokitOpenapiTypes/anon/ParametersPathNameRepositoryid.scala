package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameRepositoryid extends StObject {
  
  var parameters: PathNameRepositoryid
}
object ParametersPathNameRepositoryid {
  
  inline def apply(parameters: PathNameRepositoryid): ParametersPathNameRepositoryid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
