package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete207 extends StObject {
  
  /** Removes any interaction restrictions from your public repositories. */
  var delete: `207`
  
  /** Shows which type of GitHub user can interact with your public repositories and when the restriction expires. */
  var get: `629`
  
  /** Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the user. */
  var put: Responses200Content337
}
object Delete207 {
  
  inline def apply(delete: `207`, get: `629`, put: Responses200Content337): Delete207 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete207]
  }
  
  extension [Self <: Delete207](x: Self) {
    
    inline def setDelete(value: `207`): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: `629`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content337): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
