package typings.officeUiFabricReact.indexBundleMod

import typings.officeUiFabricReact.anon.Disabled
import typings.officeUiFabricReact.buttonGridCellTypesMod.IButtonGridCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "ButtonGridCell")
@js.native
class ButtonGridCell[T, P /* <: IButtonGridCellProps[T] */] protected ()
  extends typings.officeUiFabricReact.mod.ButtonGridCell[T, P] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: js.Any) = this()
}
/* static members */
object ButtonGridCell {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ButtonGridCell")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ButtonGridCell.defaultProps")
  @js.native
  def defaultProps: Disabled = js.native
  @scala.inline
  def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
