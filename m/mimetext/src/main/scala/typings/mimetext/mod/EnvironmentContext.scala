package typings.mimetext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentContext extends StObject {
  
  var store: js.Array[MIMEHeader]
  
  def toBase64(input: Any): String
}
object EnvironmentContext {
  
  inline def apply(store: js.Array[MIMEHeader], toBase64: Any => String): EnvironmentContext = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], toBase64 = js.Any.fromFunction1(toBase64))
    __obj.asInstanceOf[EnvironmentContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentContext] (val x: Self) extends AnyVal {
    
    inline def setStore(value: js.Array[MIMEHeader]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreVarargs(value: MIMEHeader*): Self = StObject.set(x, "store", js.Array(value*))
    
    inline def setToBase64(value: Any => String): Self = StObject.set(x, "toBase64", js.Any.fromFunction1(value))
  }
}
