package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var content: `22`
}
object `23` {
  
  inline def apply(content: `22`): `23` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `23`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `22`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
