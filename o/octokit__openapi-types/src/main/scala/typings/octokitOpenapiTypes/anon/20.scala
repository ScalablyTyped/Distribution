package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  var content: `19`
}
object `20` {
  
  inline def apply(content: `19`): `20` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `20`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `19`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
