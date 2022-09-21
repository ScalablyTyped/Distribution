package typings.officeUiFabricReact

import typings.officeUiFabricReact.fabricTypesMod.IFabricProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabricBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Fabric/Fabric.base", "FabricBase")
  @js.native
  open class FabricBase protected ()
    extends Component[IFabricProps, js.Object, Any] {
    def this(props: IFabricProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IFabricProps, context: Any) = this()
    
    /* private */ var _addClassNameToBody: Any = js.native
    
    /* private */ var _getClassNames: Any = js.native
    
    /* private */ var _removeClassNameFromBody: Any = js.native
    
    /* private */ var _rootElement: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MFabricBase(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MFabricBase(): Unit = js.native
  }
}
