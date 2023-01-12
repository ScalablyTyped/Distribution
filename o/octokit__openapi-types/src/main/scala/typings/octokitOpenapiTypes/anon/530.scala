package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `530` extends StObject {
  
  var content: ApplicationjsonBodyhtml
}
object `530` {
  
  inline def apply(content: ApplicationjsonBodyhtml): `530` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`530`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `530`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBodyhtml): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
