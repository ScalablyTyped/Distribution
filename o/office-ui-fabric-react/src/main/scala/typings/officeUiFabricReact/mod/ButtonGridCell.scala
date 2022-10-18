package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.Disabled
import typings.officeUiFabricReact.libUtilitiesButtonGridButtonGridCellDottypesMod.IButtonGridCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Already inherited
- scala.AnyRef because Already inherited
- typings.react.mod.DeprecatedLifecycle because Already inherited
- typings.react.mod.NewLifecycle because Already inherited
- js.Any because Already inherited
- typings.react.mod.ComponentLifecycle because Already inherited
- js.Object because Already inherited
- typings.react.mod.Component because Already inherited
- typings.officeUiFabricReact.libUtilitiesButtonGridButtonGridCellMod.ButtonGridCell because Already inherited
- typings.officeUiFabricReact.libUtilitiesButtonGridMod.ButtonGridCell because Already inherited
- typings.officeUiFabricReact.libGridMod.ButtonGridCell because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "ButtonGridCell")
@js.native
open class ButtonGridCell[T, P /* <: IButtonGridCellProps[T] */] protected ()
  extends typings.officeUiFabricReact.libButtonGridMod.ButtonGridCell[T, P] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: Any) = this()
}
/* static members */
object ButtonGridCell {
  
  @JSImport("office-ui-fabric-react", "ButtonGridCell")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "ButtonGridCell.defaultProps")
  @js.native
  def defaultProps: Disabled = js.native
  inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
