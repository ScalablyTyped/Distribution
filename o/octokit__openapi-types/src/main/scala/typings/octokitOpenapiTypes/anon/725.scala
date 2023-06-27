package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `725` extends StObject {
  
  var content: ApplicationjsonDefaultDescription
}
object `725` {
  
  inline def apply(content: ApplicationjsonDefaultDescription): `725` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`725`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `725`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDefaultDescription): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
