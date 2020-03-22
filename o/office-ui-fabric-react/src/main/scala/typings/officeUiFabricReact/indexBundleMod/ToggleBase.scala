package typings.officeUiFabricReact.indexBundleMod

import typings.officeUiFabricReact.PartialIToggleState
import typings.officeUiFabricReact.ReadonlyIToggleProps
import typings.officeUiFabricReact.ReadonlyIToggleState
import typings.officeUiFabricReact.toggleTypesMod.IToggleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/index.bundle", "ToggleBase")
@js.native
class ToggleBase protected ()
  extends typings.officeUiFabricReact.mod.ToggleBase {
  def this(props: IToggleProps) = this()
}

/* static members */
@JSImport("office-ui-fabric-react/lib/index.bundle", "ToggleBase")
@js.native
object ToggleBase extends js.Object {
  def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = js.native
}

