package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get460 extends StObject {
  
  /**
    * Remove interaction restrictions from your public repositories
    * @description Removes any interaction restrictions from your public repositories.
    */
  var delete: `34`
  
  /**
    * Get interaction restrictions for your public repositories
    * @description Shows which type of GitHub user can interact with your public repositories and when the restriction expires.
    */
  var get: `460`
  
  /**
    * Set interaction restrictions for your public repositories
    * @description Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the user.
    */
  var put: Responses200Content96
}
object Get460 {
  
  inline def apply(delete: `34`, get: `460`, put: Responses200Content96): Get460 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[Get460]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Get460] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: `34`): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: `460`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content96): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
