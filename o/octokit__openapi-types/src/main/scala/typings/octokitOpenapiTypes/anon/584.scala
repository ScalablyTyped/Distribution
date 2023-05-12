package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `584` extends StObject {
  
  var content: ApplicationjsonMessageNodeid
}
object `584` {
  
  inline def apply(content: ApplicationjsonMessageNodeid): `584` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`584`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `584`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonMessageNodeid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
