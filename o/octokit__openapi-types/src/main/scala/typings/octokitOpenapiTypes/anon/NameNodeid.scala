package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameNodeid extends StObject {
  
  /**
    * @description The unique identifier of the branch policy.
    * @example 361471
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    * @description The name pattern that branches must match in order to deploy to the environment.
    * @example release/ *
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** @example MDE2OkdhdGVCcmFuY2hQb2xpY3kzNjE0NzE= */
  var node_id: js.UndefOr[String] = js.undefined
}
object NameNodeid {
  
  inline def apply(): NameNodeid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameNodeid]
  }
  
  extension [Self <: NameNodeid](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
  }
}
