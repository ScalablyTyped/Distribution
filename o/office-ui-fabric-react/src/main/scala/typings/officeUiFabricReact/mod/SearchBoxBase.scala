package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.officeUiFabricReactStrings.clearButtonProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.disableAnimation
import typings.officeUiFabricReact.searchBoxTypesMod.ISearchBoxProps
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "SearchBoxBase")
@js.native
class SearchBoxBase protected ()
  extends typings.officeUiFabricReact.libSearchBoxMod.SearchBoxBase {
  def this(props: ISearchBoxProps) = this()
}

/* static members */
@JSImport("office-ui-fabric-react", "SearchBoxBase")
@js.native
object SearchBoxBase extends js.Object {
  var defaultProps: Pick[ISearchBoxProps, disableAnimation | clearButtonProps] = js.native
}

