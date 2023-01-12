package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete363 extends StObject {
  
  /** Removes any interaction restrictions from your public repositories. */
  var delete: `363`
  
  /** Shows which type of GitHub user can interact with your public repositories and when the restriction expires. */
  var get: `362`
  
  /** Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the user. */
  var put: Responses200Content79
}
object Delete363 {
  
  inline def apply(delete: `363`, get: `362`, put: Responses200Content79): Delete363 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete363]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delete363] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: `363`): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: `362`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content79): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
