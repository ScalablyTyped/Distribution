package typings.openui5.anon

import typings.openui5.sapMImageMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /**
    * Reference to the button that has been pressed
    */
  var image: js.UndefOr[default] = js.undefined
}
object Image {
  
  inline def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setImage(value: default): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
