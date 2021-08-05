package typings.officeUiFabricReact

import typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroup
import typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object choiceGroupBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroup.base", "ChoiceGroupBase")
  @js.native
  class ChoiceGroupBase protected ()
    extends Component[IChoiceGroupProps, IChoiceGroupState, js.Any]
       with IChoiceGroup {
    def this(props: IChoiceGroupProps) = this()
    
    /* private */ var _changeCallbacks: js.Any = js.native
    
    /* private */ var _focusCallbacks: js.Any = js.native
    
    /**
      * Returns `selectedKey` if provided, or the key of the first option with the `checked` prop set.
      */
    /* private */ var _getKeyChecked: js.Any = js.native
    
    /* private */ var _getOptionId: js.Any = js.native
    
    /* private */ var _getOptionLabelId: js.Any = js.native
    
    /* private */ var _id: js.Any = js.native
    
    /* private */ var _labelId: js.Any = js.native
    
    /* private */ var _onBlur: js.Any = js.native
    
    /* private */ var _onChange: js.Any = js.native
    
    /* private */ var _onFocus: js.Any = js.native
    
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
