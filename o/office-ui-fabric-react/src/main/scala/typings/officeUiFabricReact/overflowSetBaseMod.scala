package typings.officeUiFabricReact

import typings.officeUiFabricReact.overflowSetTypesMod.IOverflowSet
import typings.officeUiFabricReact.overflowSetTypesMod.IOverflowSetProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/OverflowSet/OverflowSet.base", JSImport.Namespace)
@js.native
object overflowSetBaseMod extends js.Object {
  
  @js.native
  class OverflowSetBase protected ()
    extends Component[IOverflowSetProps, js.Object, js.Any]
       with IOverflowSet {
    def this(props: IOverflowSetProps) = this()
    
    @JSName("UNSAFE_componentWillUpdate")
    def UNSAFE_componentWillUpdate_MOverflowSetBase(): Unit = js.native
    
    var _classNames: js.Any = js.native
    
    var _divContainer: js.Any = js.native
    
    var _focusZone: js.Any = js.native
    
    /**
      * Gets the subMenu for an overflow item
      * Checks if itemSubMenuProvider has been defined, if not defaults to subMenuProps
      */
    var _getSubMenuForItem: js.Any = js.native
    
    var _keytipManager: js.Any = js.native
    
    var _onRenderItems: js.Any = js.native
    
    var _onRenderOverflowButtonWrapper: js.Any = js.native
    
    var _persistedKeytips: js.Any = js.native
    
    var _registerPersistedKeytips: js.Any = js.native
    
    var _unregisterPersistedKeytips: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MOverflowSetBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MOverflowSetBase(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MOverflowSetBase(): Unit = js.native
  }
}
