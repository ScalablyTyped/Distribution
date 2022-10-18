package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayImage extends StObject {
  
  @JSName("displayImage~")
  var displayImageTilde: Elements
}
object DisplayImage {
  
  inline def apply(displayImageTilde: Elements): DisplayImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayImage~")(displayImageTilde.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayImage]
  }
  
  extension [Self <: DisplayImage](x: Self) {
    
    inline def setDisplayImageTilde(value: Elements): Self = StObject.set(x, "displayImage~", value.asInstanceOf[js.Any])
  }
}
