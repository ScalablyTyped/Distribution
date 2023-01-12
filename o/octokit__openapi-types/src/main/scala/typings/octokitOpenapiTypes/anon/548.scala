package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `548` extends StObject {
  
  var content: ApplicationjsonMergeable
}
object `548` {
  
  inline def apply(content: ApplicationjsonMergeable): `548` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`548`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `548`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonMergeable): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
