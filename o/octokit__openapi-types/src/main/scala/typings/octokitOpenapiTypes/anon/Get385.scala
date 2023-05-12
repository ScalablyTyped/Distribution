package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get385 extends StObject {
  
  /**
    * Remove interaction restrictions from your public repositories
    * @description Removes any interaction restrictions from your public repositories.
    */
  var delete: `31`
  
  /**
    * Get interaction restrictions for your public repositories
    * @description Shows which type of GitHub user can interact with your public repositories and when the restriction expires.
    */
  var get: `385`
  
  /**
    * Set interaction restrictions for your public repositories
    * @description Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the user.
    */
  var put: Responses200Content85
}
object Get385 {
  
  inline def apply(delete: `31`, get: `385`, put: Responses200Content85): Get385 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[Get385]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Get385] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: `31`): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: `385`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content85): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
