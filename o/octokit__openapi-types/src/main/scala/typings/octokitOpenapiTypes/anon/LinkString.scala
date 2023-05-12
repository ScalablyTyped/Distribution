package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkString extends StObject {
  
  var Link: String
}
object LinkString {
  
  inline def apply(Link: String): LinkString = {
    val __obj = js.Dynamic.literal(Link = Link.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkString] (val x: Self) extends AnyVal {
    
    inline def setLink(value: String): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
  }
}
