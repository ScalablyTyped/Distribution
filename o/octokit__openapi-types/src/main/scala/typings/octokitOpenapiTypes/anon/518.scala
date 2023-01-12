package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `518` extends StObject {
  
  var content: ApplicationjsonMessageNodeid
}
object `518` {
  
  inline def apply(content: ApplicationjsonMessageNodeid): `518` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`518`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `518`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonMessageNodeid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
