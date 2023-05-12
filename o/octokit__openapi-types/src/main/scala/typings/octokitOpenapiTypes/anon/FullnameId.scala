package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullnameId extends StObject {
  
  var full_name: js.UndefOr[String] = js.undefined
  
  /** @description Unique identifier of the repository */
  var id: js.UndefOr[Double] = js.undefined
  
  /** @description The name of the repository. */
  var name: js.UndefOr[String] = js.undefined
  
  var node_id: js.UndefOr[String] = js.undefined
  
  /** @description Whether the repository is private or public. */
  var `private`: js.UndefOr[Boolean] = js.undefined
}
object FullnameId {
  
  inline def apply(): FullnameId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullnameId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullnameId] (val x: Self) extends AnyVal {
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
  }
}
