package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIToggleState
import typings.officeUiFabricReact.anon.ReadonlyIToggleProps
import typings.officeUiFabricReact.anon.ReadonlyIToggleState
import typings.officeUiFabricReact.toggleTypesMod.IToggle
import typings.officeUiFabricReact.toggleTypesMod.IToggleProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.base", "ToggleBase")
  @js.native
  class ToggleBase protected ()
    extends Component[IToggleProps, IToggleState, js.Any]
       with IToggle {
    def this(props: IToggleProps) = this()
    
    var _id: js.Any = js.native
    
    var _noop: js.Any = js.native
    
    var _onClick: js.Any = js.native
    
    var _toggleButton: js.Any = js.native
    
    /**
      * Gets the current checked state of the toggle.
      */
    val checked: Boolean = js.native
  }
  /* static members */
  object ToggleBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.base", "ToggleBase.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = js.native
  }
  
  @js.native
  trait IToggleState extends StObject {
    
    var checked: Boolean = js.native
  }
  object IToggleState {
    
    @scala.inline
    def apply(checked: Boolean): IToggleState = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToggleState]
    }
    
    @scala.inline
    implicit class IToggleStateMutableBuilder[Self <: IToggleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    }
  }
}
