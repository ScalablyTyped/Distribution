package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `305` extends StObject {
  
  var content: `303`
}
object `305` {
  
  inline def apply(content: `303`): `305` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`305`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `305`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `303`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
