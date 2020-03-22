package typings.officeUiFabricReact

import typings.officeUiFabricReact.fabricTypesMod.IFabricProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Fabric/Fabric.base", JSImport.Namespace)
@js.native
object fabricBaseMod extends js.Object {
  @js.native
  class FabricBase protected ()
    extends Component[IFabricProps, AnonIsFocusVisible, js.Any] {
    def this(props: IFabricProps) = this()
    var _addClassNameToBody: js.Any = js.native
    var _disposables: js.Any = js.native
    var _getClassNames: js.Any = js.native
    var _onKeyDown: js.Any = js.native
    var _onMouseDown: js.Any = js.native
    var _onPointerDown: js.Any = js.native
    var _removeClassNameFromBody: js.UndefOr[js.Any] = js.native
    var _rootElement: js.Any = js.native
    @JSName("componentDidMount")
    def componentDidMount_MFabricBase(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MFabricBase(): Unit = js.native
  }
  
}

