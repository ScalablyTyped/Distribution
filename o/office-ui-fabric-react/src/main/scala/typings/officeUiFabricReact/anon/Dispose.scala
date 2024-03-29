package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dispose extends StObject {
  
  def dispose(): scala.Unit
  
  var key: String
}
object Dispose {
  
  inline def apply(dispose: () => scala.Unit, key: String): Dispose = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dispose] (val x: Self) extends AnyVal {
    
    inline def setDispose(value: () => scala.Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
