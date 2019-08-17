package typings.officeDashUiDashFabricDashReact.libSearchBoxMod

import typings.officeDashUiDashFabricDashReact.libComponentsSearchBoxSearchBoxDotTypesMod.ISearchBoxProps
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.clearButtonProps
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.disableAnimation
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/SearchBox", "SearchBoxBase")
@js.native
class SearchBoxBase protected ()
  extends typings.officeDashUiDashFabricDashReact.libComponentsSearchBoxMod.SearchBoxBase {
  def this(props: ISearchBoxProps) = this()
}

/* static members */
@JSImport("office-ui-fabric-react/lib/SearchBox", "SearchBoxBase")
@js.native
object SearchBoxBase extends js.Object {
  var defaultProps: Pick[ISearchBoxProps, disableAnimation | clearButtonProps] = js.native
}

