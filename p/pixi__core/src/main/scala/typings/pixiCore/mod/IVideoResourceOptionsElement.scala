package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVideoResourceOptionsElement extends StObject {
  
  var mime: String
  
  var src: String
}
object IVideoResourceOptionsElement {
  
  inline def apply(mime: String, src: String): IVideoResourceOptionsElement = {
    val __obj = js.Dynamic.literal(mime = mime.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideoResourceOptionsElement]
  }
  
  extension [Self <: IVideoResourceOptionsElement](x: Self) {
    
    inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
