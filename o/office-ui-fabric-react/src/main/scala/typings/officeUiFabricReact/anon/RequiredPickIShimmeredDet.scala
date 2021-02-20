package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/ShimmeredDetailsList.types.IShimmeredDetailsListProps, 'theme'>> */
@js.native
trait RequiredPickIShimmeredDet extends StObject {
  
  var theme: js.Any = js.native
}
object RequiredPickIShimmeredDet {
  
  @scala.inline
  def apply(theme: js.Any): RequiredPickIShimmeredDet = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickIShimmeredDet]
  }
  
  @scala.inline
  implicit class RequiredPickIShimmeredDetMutableBuilder[Self <: RequiredPickIShimmeredDet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTheme(value: js.Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
