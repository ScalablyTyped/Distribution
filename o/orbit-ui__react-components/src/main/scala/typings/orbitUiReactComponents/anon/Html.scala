package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Html extends StObject {
  
  var __html: String
}
object Html {
  
  inline def apply(__html: String): Html = {
    val __obj = js.Dynamic.literal(__html = __html.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
    
    inline def set__html(value: String): Self = StObject.set(x, "__html", value.asInstanceOf[js.Any])
  }
}
