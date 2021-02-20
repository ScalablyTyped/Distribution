package typings.officeUiFabricReact.anon

import typings.fluentuiTheme.ithemeMod.ITheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupShowAll.types.IGroupShowAllProps, 'theme'>> */
@js.native
trait RequiredPickIGroupShowAll extends StObject {
  
  var theme: ITheme = js.native
}
object RequiredPickIGroupShowAll {
  
  @scala.inline
  def apply(theme: ITheme): RequiredPickIGroupShowAll = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickIGroupShowAll]
  }
  
  @scala.inline
  implicit class RequiredPickIGroupShowAllMutableBuilder[Self <: RequiredPickIGroupShowAll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
