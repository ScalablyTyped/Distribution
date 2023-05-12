package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `596` extends StObject {
  
  var content: ApplicationjsonBodyhtml
}
object `596` {
  
  inline def apply(content: ApplicationjsonBodyhtml): `596` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`596`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `596`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBodyhtml): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
