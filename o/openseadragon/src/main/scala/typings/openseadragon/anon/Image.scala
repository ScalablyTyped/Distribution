package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var Image: Format
}
object Image {
  
  inline def apply(Image: Format): Image = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    inline def setImage(value: Format): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
  }
}
