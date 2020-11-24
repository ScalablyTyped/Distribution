package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneContext
import typings.officeUiFabricReact.stickyTypesMod.IStickyProps
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "Sticky")
@js.native
class Sticky protected ()
  extends typings.officeUiFabricReact.libStickyMod.Sticky {
  def this(props: IStickyProps) = this()
}
/* static members */
@JSImport("office-ui-fabric-react", "Sticky")
@js.native
object Sticky extends js.Object {
  
  var contextType: Context[IScrollablePaneContext] = js.native
  
  var defaultProps: IStickyProps = js.native
}
