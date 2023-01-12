package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty extends StObject {
  
  @JSName("*/*")
  var AsteriskSlashAsterisk: String
}
object _empty {
  
  inline def apply(AsteriskSlashAsterisk: String): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("*/*")(AsteriskSlashAsterisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
    
    inline def setAsteriskSlashAsterisk(value: String): Self = StObject.set(x, "*/*", value.asInstanceOf[js.Any])
  }
}
