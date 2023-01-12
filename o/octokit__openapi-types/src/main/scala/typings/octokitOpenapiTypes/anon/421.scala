package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `421` extends StObject {
  
  var content: ApplicationjsonBodyCreatedat
}
object `421` {
  
  inline def apply(content: ApplicationjsonBodyCreatedat): `421` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`421`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `421`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBodyCreatedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
