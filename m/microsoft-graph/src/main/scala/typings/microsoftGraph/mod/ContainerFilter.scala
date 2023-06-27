package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerFilter extends StObject {
  
  var includedContainers: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object ContainerFilter {
  
  inline def apply(): ContainerFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerFilter] (val x: Self) extends AnyVal {
    
    inline def setIncludedContainers(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "includedContainers", value.asInstanceOf[js.Any])
    
    inline def setIncludedContainersNull: Self = StObject.set(x, "includedContainers", null)
    
    inline def setIncludedContainersUndefined: Self = StObject.set(x, "includedContainers", js.undefined)
    
    inline def setIncludedContainersVarargs(value: String*): Self = StObject.set(x, "includedContainers", js.Array(value*))
  }
}
