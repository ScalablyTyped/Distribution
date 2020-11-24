package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PickISearchBoxPropsdisabl
import typings.officeUiFabricReact.searchBoxTypesMod.ISearchBoxProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/SearchBox", JSImport.Namespace)
@js.native
object libSearchBoxMod extends js.Object {
  
  val SearchBox: FunctionComponent[ISearchBoxProps] = js.native
  
  @js.native
  class SearchBoxBase protected ()
    extends typings.officeUiFabricReact.searchBoxMod.SearchBoxBase {
    def this(props: ISearchBoxProps) = this()
  }
  /* static members */
  @js.native
  object SearchBoxBase extends js.Object {
    
    var defaultProps: PickISearchBoxPropsdisabl = js.native
  }
}
