package typings.officeUiFabricReact

import typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroup
import typings.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object choiceGroupBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroup.base", "ChoiceGroupBase")
  @js.native
  class ChoiceGroupBase protected ()
    extends Component[IChoiceGroupProps, IChoiceGroupState, js.Any]
       with IChoiceGroup {
    def this(props: IChoiceGroupProps) = this()
    
    var _changeCallbacks: js.Any = js.native
    
    var _focusCallbacks: js.Any = js.native
    
    /**
      * Returns `selectedKey` if provided, or the key of the first option with the `checked` prop set.
      */
    var _getKeyChecked: js.Any = js.native
    
    var _getOptionId: js.Any = js.native
    
    var _getOptionLabelId: js.Any = js.native
    
    var _id: js.Any = js.native
    
    var _labelId: js.Any = js.native
    
    var _onBlur: js.Any = js.native
    
    var _onChange: js.Any = js.native
    
    var _onFocus: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MChoiceGroupBase(prevProps: IChoiceGroupProps, prevState: IChoiceGroupState): Unit = js.native
  }
  
  @js.native
  trait IChoiceGroupState extends StObject {
    
    /**
      * Current selected option, for **internal use only**.
      * External users should access `IChoiceGroup.checkedOption` instead.
      */
    var keyChecked: js.UndefOr[String | Double] = js.native
    
    /** Is set when the control has focus. */
    var keyFocused: js.UndefOr[String | Double] = js.native
  }
  object IChoiceGroupState {
    
    @scala.inline
    def apply(): IChoiceGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IChoiceGroupState]
    }
    
    @scala.inline
    implicit class IChoiceGroupStateMutableBuilder[Self <: IChoiceGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyChecked(value: String | Double): Self = StObject.set(x, "keyChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCheckedUndefined: Self = StObject.set(x, "keyChecked", js.undefined)
      
      @scala.inline
      def setKeyFocused(value: String | Double): Self = StObject.set(x, "keyFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFocusedUndefined: Self = StObject.set(x, "keyFocused", js.undefined)
    }
  }
}
