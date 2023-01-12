package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty extends StObject {
  
  @JSName("_")
  val _underscore: js.Symbol
}
object _empty {
  
  inline def apply(_underscore: js.Symbol): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
    
    inline def set_underscore(value: js.Symbol): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
