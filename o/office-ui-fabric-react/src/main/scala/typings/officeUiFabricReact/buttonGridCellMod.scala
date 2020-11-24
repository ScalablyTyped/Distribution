package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable0
import typings.officeUiFabricReact.anon.Disabled
import typings.officeUiFabricReact.buttonGridCellTypesMod.IButtonGridCellProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGridCell", JSImport.Namespace)
@js.native
object buttonGridCellMod extends js.Object {
  
  @js.native
  class ButtonGridCell[T, P /* <: IButtonGridCellProps[T] */] ()
    extends Component[P, js.Object, js.Any] {
    
    var _onClick: js.Any = js.native
    
    var _onFocus: js.Any = js.native
    
    var _onMouseEnter: js.Any = js.native
    
    var _onMouseLeave: js.Any = js.native
    
    var _onMouseMove: js.Any = js.native
  }
  /* static members */
  @js.native
  object ButtonGridCell extends js.Object {
    
    var defaultProps: Disabled = js.native
  }
  
  @js.native
  class GridCell[T, P /* <: IButtonGridCellProps[/* import warning: RewrittenClass.unapply cls was tparam T */ _] */] () extends ButtonGridCell[T, P]
  @js.native
  object GridCell
    extends Instantiable0[
          ButtonGridCell[
            js.Object, 
            IButtonGridCellProps[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
          ]
        ] {
    
    var defaultProps: Disabled = js.native
  }
}
