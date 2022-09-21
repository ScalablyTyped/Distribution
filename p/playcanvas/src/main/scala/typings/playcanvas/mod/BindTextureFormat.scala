package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ignore
  */
trait BindTextureFormat extends StObject {
  
  /** @type {string} */
  var name: String
  
  /** @type {ScopeId} */
  var scopeId: ScopeId
  
  var visibility: Any
}
object BindTextureFormat {
  
  inline def apply(name: String, scopeId: ScopeId, visibility: Any): BindTextureFormat = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scopeId = scopeId.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindTextureFormat]
  }
  
  extension [Self <: BindTextureFormat](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScopeId(value: ScopeId): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: Any): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
