package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `806` extends StObject {
  
  var content: `805`
}
object `806` {
  
  inline def apply(content: `805`): `806` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`806`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `806`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `805`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
