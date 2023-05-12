package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToBoolean extends StObject {
  
  /** @description Whether this release was explicitly `edited` to be the latest. */
  var to: Boolean
}
object ToBoolean {
  
  inline def apply(to: Boolean): ToBoolean = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToBoolean] (val x: Self) extends AnyVal {
    
    inline def setTo(value: Boolean): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
