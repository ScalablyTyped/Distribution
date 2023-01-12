package typings.mri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait _empty extends StObject {
    
    @JSName("_")
    var _underscore: js.Array[String]
  }
  object _empty {
    
    inline def apply(_underscore: js.Array[String]): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
      
      inline def set_underscore(value: js.Array[String]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      inline def set_underscoreVarargs(value: String*): Self = StObject.set(x, "_", js.Array(value*))
    }
  }
}
