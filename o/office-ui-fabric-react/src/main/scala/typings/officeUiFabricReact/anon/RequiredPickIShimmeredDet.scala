package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/ShimmeredDetailsList.types.IShimmeredDetailsListProps, 'theme'>> */
trait RequiredPickIShimmeredDet extends StObject {
  
  var theme: js.Any
}
object RequiredPickIShimmeredDet {
  
  inline def apply(theme: js.Any): RequiredPickIShimmeredDet = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickIShimmeredDet]
  }
  
  extension [Self <: RequiredPickIShimmeredDet](x: Self) {
    
    inline def setTheme(value: js.Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
