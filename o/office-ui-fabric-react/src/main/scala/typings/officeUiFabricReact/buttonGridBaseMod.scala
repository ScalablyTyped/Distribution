package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable1
import typings.officeUiFabricReact.buttonGridTypesMod.IButtonGrid
import typings.officeUiFabricReact.buttonGridTypesMod.IButtonGridProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGridBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGrid.base", "ButtonGridBase")
  @js.native
  class ButtonGridBase protected ()
    extends Component[IButtonGridProps, js.Object, js.Any]
       with IButtonGrid {
    def this(props: IButtonGridProps) = this()
    
    var _id: js.Any = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGrid.base", "GridBase")
  @js.native
  class GridBase protected () extends ButtonGridBase {
    def this(props: IButtonGridProps) = this()
  }
  @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGrid.base", "GridBase")
  @js.native
  val GridBase: Instantiable1[/* props */ IButtonGridProps, ButtonGridBase] = js.native
}
