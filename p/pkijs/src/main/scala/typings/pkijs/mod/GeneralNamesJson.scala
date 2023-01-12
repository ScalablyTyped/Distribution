package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralNamesJson extends StObject {
  
  var names: js.Array[GeneralNameJson]
}
object GeneralNamesJson {
  
  inline def apply(names: js.Array[GeneralNameJson]): GeneralNamesJson = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralNamesJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneralNamesJson] (val x: Self) extends AnyVal {
    
    inline def setNames(value: js.Array[GeneralNameJson]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: GeneralNameJson*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
