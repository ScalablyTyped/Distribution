package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.baseButtonMod.IBaseButtonProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "BaseButton")
@js.native
class BaseButton protected ()
  extends typings.officeUiFabricReact.libButtonMod.BaseButton {
  def this(props: IBaseButtonProps, rootClassName: String) = this()
}

/* static members */
@JSImport("office-ui-fabric-react", "BaseButton")
@js.native
object BaseButton extends js.Object {
  var defaultProps: Partial[IBaseButtonProps] = js.native
}

