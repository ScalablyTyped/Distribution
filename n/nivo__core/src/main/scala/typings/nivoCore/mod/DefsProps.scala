package typings.nivoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefsProps extends StObject {
  
  var defs: js.Array[Def]
}
object DefsProps {
  
  inline def apply(defs: js.Array[Def]): DefsProps = {
    val __obj = js.Dynamic.literal(defs = defs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefsProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefsProps] (val x: Self) extends AnyVal {
    
    inline def setDefs(value: js.Array[Def]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
    
    inline def setDefsVarargs(value: Def*): Self = StObject.set(x, "defs", js.Array(value*))
  }
}
