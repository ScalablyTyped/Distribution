package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `716` extends StObject {
  
  var content: ApplicationjsonBodyhtml
}
object `716` {
  
  inline def apply(content: ApplicationjsonBodyhtml): `716` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`716`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `716`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBodyhtml): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
