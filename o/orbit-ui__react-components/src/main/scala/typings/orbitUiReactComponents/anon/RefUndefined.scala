package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefUndefined extends StObject {
  
  var ref: Unit
}
object RefUndefined {
  
  inline def apply(ref: Unit): RefUndefined = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefUndefined] (val x: Self) extends AnyVal {
    
    inline def setRef(value: Unit): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
