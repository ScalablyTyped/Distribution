package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var content: `23`
}
object `24` {
  
  inline def apply(content: `23`): `24` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`24`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `24`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `23`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
