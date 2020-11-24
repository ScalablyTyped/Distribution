package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable0
import typings.officeUiFabricReact.anon.Disabled
import typings.officeUiFabricReact.buttonGridCellTypesMod.IButtonGridCellProps
import typings.officeUiFabricReact.buttonGridTypesMod.IButtonGridProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/ButtonGrid", JSImport.Namespace)
@js.native
object libButtonGridMod extends js.Object {
  
  val ButtonGrid: FunctionComponent[IButtonGridProps] = js.native
  
  val Grid: FunctionComponent[IButtonGridProps] = js.native
  
  @js.native
  class ButtonGridCell[T, P /* <: IButtonGridCellProps[T] */] ()
    extends typings.officeUiFabricReact.buttonGridMod.ButtonGridCell[T, P]
  /* static members */
  @js.native
  object ButtonGridCell extends js.Object {
    
    var defaultProps: Disabled = js.native
  }
  
  @js.native
  class GridCell[T, P /* <: IButtonGridCellProps[/* import warning: RewrittenClass.unapply cls was tparam T */ _] */] ()
    extends typings.officeUiFabricReact.buttonGridCellMod.ButtonGridCell[T, P]
  @js.native
  object GridCell
    extends Instantiable0[
          typings.officeUiFabricReact.buttonGridCellMod.ButtonGridCell[
            js.Object, 
            IButtonGridCellProps[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
          ]
        ] {
    
    var defaultProps: Disabled = js.native
  }
}
