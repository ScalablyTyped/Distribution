package typings.officeUiFabricReact

import typings.officeUiFabricReact.officeUiFabricReactStrings.clearButtonProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.disableAnimation
import typings.officeUiFabricReact.searchBoxTypesMod.ISearchBoxProps
import typings.react.mod.FunctionComponent
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/SearchBox", JSImport.Namespace)
@js.native
object libSearchBoxMod extends js.Object {
  @js.native
  class SearchBoxBase protected ()
    extends typings.officeUiFabricReact.searchBoxMod.SearchBoxBase {
    def this(props: ISearchBoxProps) = this()
  }
  
  val SearchBox: FunctionComponent[ISearchBoxProps] = js.native
  /* static members */
  @js.native
  object SearchBoxBase extends js.Object {
    var defaultProps: Pick[ISearchBoxProps, disableAnimation | clearButtonProps] = js.native
  }
  
}

