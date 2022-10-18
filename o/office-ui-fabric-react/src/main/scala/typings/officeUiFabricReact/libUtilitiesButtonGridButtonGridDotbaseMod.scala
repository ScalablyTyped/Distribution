package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable1
import typings.officeUiFabricReact.libUtilitiesButtonGridButtonGridDottypesMod.IButtonGrid
import typings.officeUiFabricReact.libUtilitiesButtonGridButtonGridDottypesMod.IButtonGridProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesButtonGridButtonGridDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGrid.base", "ButtonGridBase")
  @js.native
  open class ButtonGridBase protected ()
    extends Component[IButtonGridProps, js.Object, Any]
       with IButtonGrid {
    def this(props: IButtonGridProps) = this()
    
    /* private */ var _id: Any = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGrid.base", "GridBase")
  @js.native
  open class GridBase protected () extends ButtonGridBase {
    def this(props: IButtonGridProps) = this()
  }
  @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGrid.base", "GridBase")
  @js.native
  val GridBase: Instantiable1[/* props */ IButtonGridProps, ButtonGridBase] = js.native
}
