package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeneralNames extends StObject {
  
  var names: js.Array[GeneralName]
}
object IGeneralNames {
  
  inline def apply(names: js.Array[GeneralName]): IGeneralNames = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeneralNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGeneralNames] (val x: Self) extends AnyVal {
    
    inline def setNames(value: js.Array[GeneralName]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: GeneralName*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
