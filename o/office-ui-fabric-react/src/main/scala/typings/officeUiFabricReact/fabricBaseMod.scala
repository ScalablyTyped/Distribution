package typings.officeUiFabricReact

import typings.officeUiFabricReact.fabricTypesMod.IFabricProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabricBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Fabric/Fabric.base", "FabricBase")
  @js.native
  class FabricBase protected ()
    extends Component[IFabricProps, js.Object, js.Any] {
    def this(props: IFabricProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IFabricProps, context: js.Any) = this()
    
    var _addClassNameToBody: js.Any = js.native
    
    var _getClassNames: js.Any = js.native
    
    var _removeClassNameFromBody: js.Any = js.native
    
    var _rootElement: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MFabricBase(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MFabricBase(): Unit = js.native
  }
}
