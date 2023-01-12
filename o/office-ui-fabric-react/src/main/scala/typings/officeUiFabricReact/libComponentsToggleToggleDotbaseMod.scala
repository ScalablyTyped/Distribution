package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIToggleState
import typings.officeUiFabricReact.anon.ReadonlyIToggleProps
import typings.officeUiFabricReact.anon.ReadonlyIToggleState
import typings.officeUiFabricReact.libComponentsToggleToggleDottypesMod.IToggle
import typings.officeUiFabricReact.libComponentsToggleToggleDottypesMod.IToggleProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsToggleToggleDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.base", "ToggleBase")
  @js.native
  open class ToggleBase protected ()
    extends Component[IToggleProps, IToggleState, Any]
       with IToggle {
    def this(props: IToggleProps) = this()
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _noop: Any = js.native
    
    /* private */ var _onClick: Any = js.native
    
    /* private */ var _toggleButton: Any = js.native
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IToggleState] (val x: Self) extends AnyVal {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    }
  }
}
