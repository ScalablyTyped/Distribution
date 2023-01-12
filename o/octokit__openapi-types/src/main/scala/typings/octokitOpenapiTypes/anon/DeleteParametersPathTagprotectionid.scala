package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathTagprotectionid extends StObject {
  
  /**
    * This deletes a tag protection state for a repository.
    * This endpoint is only available to repository administrators.
    */
  var delete: ParametersPathTagprotectionid
}
object DeleteParametersPathTagprotectionid {
  
  inline def apply(delete: ParametersPathTagprotectionid): DeleteParametersPathTagprotectionid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathTagprotectionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathTagprotectionid] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathTagprotectionid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
