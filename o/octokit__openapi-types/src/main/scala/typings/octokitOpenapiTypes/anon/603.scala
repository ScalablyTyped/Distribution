package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `603` extends StObject {
  
  var content: ApplicationjsonDefaultDescription
}
object `603` {
  
  inline def apply(content: ApplicationjsonDefaultDescription): `603` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`603`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `603`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDefaultDescription): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
