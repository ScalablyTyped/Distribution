package typings.openui5.anon

import typings.openui5.sapUiCoreLibraryMod.CSSSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Top extends StObject {
  
  var left: CSSSize
  
  var top: CSSSize
}
object Top {
  
  inline def apply(left: CSSSize, top: CSSSize): Top = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Top]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Top] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: CSSSize): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: CSSSize): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
