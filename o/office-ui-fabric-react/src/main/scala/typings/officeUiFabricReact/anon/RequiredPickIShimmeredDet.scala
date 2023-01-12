package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/ShimmeredDetailsList.types.IShimmeredDetailsListProps, 'theme'>> */
trait RequiredPickIShimmeredDet extends StObject {
  
  var theme: Any
}
object RequiredPickIShimmeredDet {
  
  inline def apply(theme: Any): RequiredPickIShimmeredDet = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickIShimmeredDet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredPickIShimmeredDet] (val x: Self) extends AnyVal {
    
    inline def setTheme(value: Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
