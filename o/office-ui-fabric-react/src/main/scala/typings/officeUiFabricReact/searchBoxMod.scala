package typings.officeUiFabricReact

import typings.officeUiFabricReact.officeUiFabricReactStrings.clearButtonProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.disableAnimation
import typings.officeUiFabricReact.searchBoxTypesMod.ISearchBoxProps
import typings.react.mod.StatelessComponent
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SearchBox", JSImport.Namespace)
@js.native
object searchBoxMod extends js.Object {
  @js.native
  class SearchBoxBase protected ()
    extends typings.officeUiFabricReact.searchBoxBaseMod.SearchBoxBase {
    def this(props: ISearchBoxProps) = this()
  }
  
  val SearchBox: StatelessComponent[ISearchBoxProps] = js.native
  /* static members */
  @js.native
  object SearchBoxBase extends js.Object {
    var defaultProps: Pick[ISearchBoxProps, disableAnimation | clearButtonProps] = js.native
  }
  
}

