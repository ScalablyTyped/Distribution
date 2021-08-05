package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Disabled
import typings.officeUiFabricReact.buttonGridCellTypesMod.IButtonGridCellProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGridCellMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGridCell", "ButtonGridCell")
  @js.native
  class ButtonGridCell[T, P /* <: IButtonGridCellProps[T] */] protected ()
    extends Component[P, js.Object, js.Any] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: js.Any) = this()
    
    /* private */ var _onClick: js.Any = js.native
    
    /* private */ var _onFocus: js.Any = js.native
    
    /* private */ var _onMouseEnter: js.Any = js.native
    
    /* private */ var _onMouseLeave: js.Any = js.native
    
    /* private */ var _onMouseMove: js.Any = js.native
  }
  /* static members */
  object ButtonGridCell {
    
    @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGridCell", "ButtonGridCell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGridCell", "ButtonGridCell.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGridCell", "GridCell")
  @js.native
  class GridCell[T, P /* <: IButtonGridCellProps[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any] */] () extends ButtonGridCell[T, P]
  object GridCell {
    
    @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGridCell", "GridCell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGridCell", "GridCell.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
