package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsChoiceGroupChoiceGroupDottypesMod.IChoiceGroup
import typings.officeUiFabricReact.libComponentsChoiceGroupChoiceGroupDottypesMod.IChoiceGroupProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsChoiceGroupChoiceGroupDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroup.base", "ChoiceGroupBase")
  @js.native
  open class ChoiceGroupBase protected ()
    extends Component[IChoiceGroupProps, IChoiceGroupState, Any]
       with IChoiceGroup {
    def this(props: IChoiceGroupProps) = this()
    
    /* private */ var _changeCallbacks: Any = js.native
    
    /* private */ var _focusCallbacks: Any = js.native
    
    /**
      * Returns `selectedKey` if provided, or the key of the first option with the `checked` prop set.
      */
    /* private */ var _getKeyChecked: Any = js.native
    
    /* private */ var _getOptionId: Any = js.native
    
    /* private */ var _getOptionLabelId: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _labelId: Any = js.native
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onChange: Any = js.native
    
    /* private */ var _onFocus: Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MChoiceGroupBase(prevProps: IChoiceGroupProps, prevState: IChoiceGroupState): Unit = js.native
    
    /**
      * Sets focus to the checked option or the first enabled option in the ChoiceGroup.
      */
    /* CompleteClass */
    override def focus(): Unit = js.native
  }
  
  trait IChoiceGroupState extends StObject {
    
    /**
      * Current selected option, for **internal use only**.
      * External users should access `IChoiceGroup.checkedOption` instead.
      */
    var keyChecked: js.UndefOr[String | Double] = js.undefined
    
    /** Is set when the control has focus. */
    var keyFocused: js.UndefOr[String | Double] = js.undefined
  }
  object IChoiceGroupState {
    
    inline def apply(): IChoiceGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IChoiceGroupState]
    }
    
    extension [Self <: IChoiceGroupState](x: Self) {
      
      inline def setKeyChecked(value: String | Double): Self = StObject.set(x, "keyChecked", value.asInstanceOf[js.Any])
      
      inline def setKeyCheckedUndefined: Self = StObject.set(x, "keyChecked", js.undefined)
      
      inline def setKeyFocused(value: String | Double): Self = StObject.set(x, "keyFocused", value.asInstanceOf[js.Any])
      
      inline def setKeyFocusedUndefined: Self = StObject.set(x, "keyFocused", js.undefined)
    }
  }
}
