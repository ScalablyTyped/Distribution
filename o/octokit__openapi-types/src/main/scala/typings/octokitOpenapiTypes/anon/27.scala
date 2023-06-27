package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  var content: `26`
}
object `27` {
  
  inline def apply(content: `26`): `27` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`27`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `27`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `26`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
