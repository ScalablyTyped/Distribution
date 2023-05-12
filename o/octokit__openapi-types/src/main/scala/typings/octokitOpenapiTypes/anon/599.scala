package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `599` extends StObject {
  
  var content: `598`
}
object `599` {
  
  inline def apply(content: `598`): `599` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`599`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `599`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `598`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
