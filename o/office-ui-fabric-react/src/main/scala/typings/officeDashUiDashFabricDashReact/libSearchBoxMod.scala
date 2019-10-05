package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsSearchBoxSearchBoxDotTypesMod.ISearchBoxProps
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.clearButtonProps
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.disableAnimation
import typings.react.reactMod.StatelessComponent
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/SearchBox", JSImport.Namespace)
@js.native
object libSearchBoxMod extends js.Object {
  @js.native
  class SearchBoxBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsSearchBoxMod.SearchBoxBase {
    def this(props: ISearchBoxProps) = this()
  }
  
  val SearchBox: StatelessComponent[ISearchBoxProps] = js.native
  /* static members */
  @js.native
  object SearchBoxBase extends js.Object {
    var defaultProps: Pick[ISearchBoxProps, disableAnimation | clearButtonProps] = js.native
  }
  
}

