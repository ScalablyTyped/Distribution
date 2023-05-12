package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.revoke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Patids extends StObject {
  
  /**
    * @description Action to apply to the fine-grained personal access token.
    * @enum {string}
    */
  var action: revoke
  
  /** @description The IDs of the fine-grained personal access tokens. */
  var pat_ids: js.Array[Double]
}
object Patids {
  
  inline def apply(pat_ids: js.Array[Double]): Patids = {
    val __obj = js.Dynamic.literal(action = "revoke", pat_ids = pat_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Patids] (val x: Self) extends AnyVal {
    
    inline def setAction(value: revoke): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setPat_ids(value: js.Array[Double]): Self = StObject.set(x, "pat_ids", value.asInstanceOf[js.Any])
    
    inline def setPat_idsVarargs(value: Double*): Self = StObject.set(x, "pat_ids", js.Array(value*))
  }
}
