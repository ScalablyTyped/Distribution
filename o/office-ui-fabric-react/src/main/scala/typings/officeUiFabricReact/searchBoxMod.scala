package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PickISearchBoxPropsdisabl
import typings.officeUiFabricReact.searchBoxTypesMod.ISearchBoxProps
import typings.react.mod.FunctionComponent
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
  
  val SearchBox: FunctionComponent[ISearchBoxProps] = js.native
  /* static members */
  @js.native
  object SearchBoxBase extends js.Object {
    var defaultProps: PickISearchBoxPropsdisabl = js.native
  }
  
}

