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
  
  var sampleType: String
  
  /** @type {ScopeId} */
  var scopeId: ScopeId
  
  var textureDimension: String
  
  var visibility: Any
}
object BindTextureFormat {
  
  inline def apply(name: String, sampleType: String, scopeId: ScopeId, textureDimension: String, visibility: Any): BindTextureFormat = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sampleType = sampleType.asInstanceOf[js.Any], scopeId = scopeId.asInstanceOf[js.Any], textureDimension = textureDimension.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindTextureFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindTextureFormat] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSampleType(value: String): Self = StObject.set(x, "sampleType", value.asInstanceOf[js.Any])
    
    inline def setScopeId(value: ScopeId): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    inline def setTextureDimension(value: String): Self = StObject.set(x, "textureDimension", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: Any): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
