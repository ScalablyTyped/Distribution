package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `93` extends StObject {
  
  var content: `92`
}
object `93` {
  
  inline def apply(content: `92`): `93` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`93`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `93`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `92`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
