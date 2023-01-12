package typings.mediapipeFaceMesh.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputMap extends StObject {
  
  var image: InputImage
}
object InputMap {
  
  inline def apply(image: InputImage): InputMap = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputMap] (val x: Self) extends AnyVal {
    
    inline def setImage(value: InputImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
