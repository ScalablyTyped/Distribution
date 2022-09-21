package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./graphics-device.js').GraphicsDevice} GraphicsDevice */
/** @typedef {import('./scope-id.js').ScopeId} ScopeId */
/**
  * @ignore
  */
trait BindBufferFormat extends StObject {
  
  /** @type {string} */
  var name: String
  
  var visibility: Any
}
object BindBufferFormat {
  
  inline def apply(name: String, visibility: Any): BindBufferFormat = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindBufferFormat]
  }
  
  extension [Self <: BindBufferFormat](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: Any): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
