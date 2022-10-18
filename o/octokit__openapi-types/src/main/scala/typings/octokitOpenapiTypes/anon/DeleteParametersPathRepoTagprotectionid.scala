package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathRepoTagprotectionid extends StObject {
  
  /**
    * This deletes a tag protection state for a repository.
    * This endpoint is only available to repository administrators.
    */
  var delete: ParametersPathRepoTagprotectionid
}
object DeleteParametersPathRepoTagprotectionid {
  
  inline def apply(delete: ParametersPathRepoTagprotectionid): DeleteParametersPathRepoTagprotectionid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathRepoTagprotectionid]
  }
  
  extension [Self <: DeleteParametersPathRepoTagprotectionid](x: Self) {
    
    inline def setDelete(value: ParametersPathRepoTagprotectionid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
