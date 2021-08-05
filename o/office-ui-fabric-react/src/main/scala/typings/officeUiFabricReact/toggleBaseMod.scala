package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIToggleState
import typings.officeUiFabricReact.anon.ReadonlyIToggleProps
import typings.officeUiFabricReact.anon.ReadonlyIToggleState
import typings.officeUiFabricReact.toggleTypesMod.IToggle
import typings.officeUiFabricReact.toggleTypesMod.IToggleProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.base", "ToggleBase")
  @js.native
  class ToggleBase protected ()
    extends Component[IToggleProps, IToggleState, js.Any]
       with IToggle {
    def this(props: IToggleProps) = this()
    
    /* private */ var _id: js.Any = js.native
    
    /* private */ var _noop: js.Any = js.native
    
    /* private */ var _onClick: js.Any = js.native
    
    /* private */ var _toggleButton: js.Any = js.native
    
    /**
      * Gets the current checked state of the toggle.
      */
    val checked: Boolean = js.native
    
    /* CompleteClass */
    override def focus(): Unit = js.native
  }
  /* static members */
  object ToggleBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.base", "ToggleBase")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialIToggleState | Null]
  }
  
  trait IToggleState extends StObject {
    
    var checked: Boolean
  }
  object IToggleState {
    
    inline def apply(checked: Boolean): IToggleState = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToggleState]
    }
    
    extension [Self <: IToggleState](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    }
  }
}
