package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Password extends StObject {
  
  var password: js.typedarray.ArrayBuffer
}
object Password {
  
  inline def apply(password: js.typedarray.ArrayBuffer): Password = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
    
    inline def setPassword(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
