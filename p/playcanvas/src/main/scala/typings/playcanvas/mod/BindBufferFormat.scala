package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindBufferFormat] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: Any): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
