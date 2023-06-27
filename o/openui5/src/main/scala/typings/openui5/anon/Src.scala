package typings.openui5.anon

import typings.openui5.sapUiCoreLibraryMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Src extends StObject {
  
  /**
    * either an icon URI or the URL that points to the image file
    */
  var src: URI
}
object Src {
  
  inline def apply(src: URI): Src = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Src]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Src] (val x: Self) extends AnyVal {
    
    inline def setSrc(value: URI): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
