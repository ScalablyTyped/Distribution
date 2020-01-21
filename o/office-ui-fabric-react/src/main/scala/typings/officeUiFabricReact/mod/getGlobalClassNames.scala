package typings.officeUiFabricReact.mod

import typings.std.Partial
import typings.uifabricStyling.getGlobalClassNamesMod.GlobalClassNames
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "getGlobalClassNames")
@js.native
object getGlobalClassNames extends js.Object {
  def apply[T](classNames: GlobalClassNames[T], theme: ITheme): Partial[GlobalClassNames[T]] = js.native
  def apply[T](classNames: GlobalClassNames[T], theme: ITheme, disableGlobalClassNames: Boolean): Partial[GlobalClassNames[T]] = js.native
}

