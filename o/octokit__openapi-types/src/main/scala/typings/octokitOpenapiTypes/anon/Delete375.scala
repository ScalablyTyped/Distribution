package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete375 extends StObject {
  
  /** Removes any interaction restrictions from your public repositories. */
  var delete: `375`
  
  /** Shows which type of GitHub user can interact with your public repositories and when the restriction expires. */
  var get: `374`
  
  /** Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the user. */
  var put: Responses200Content87
}
object Delete375 {
  
  inline def apply(delete: `375`, get: `374`, put: Responses200Content87): Delete375 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete375]
  }
  
  extension [Self <: Delete375](x: Self) {
    
    inline def setDelete(value: `375`): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: `374`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content87): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
