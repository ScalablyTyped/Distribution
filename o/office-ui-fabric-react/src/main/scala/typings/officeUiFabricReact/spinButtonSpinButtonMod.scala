package typings.officeUiFabricReact

import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.positioningTypesMod.Position
import typings.officeUiFabricReact.spinButtonTypesMod.ISpinButton
import typings.officeUiFabricReact.spinButtonTypesMod.ISpinButtonProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinButtonSpinButtonMod {
  
  @js.native
  sealed trait KeyboardSpinDirection extends StObject
  @JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton", "KeyboardSpinDirection")
  @js.native
  object KeyboardSpinDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[KeyboardSpinDirection & Double] = js.native
    
    @js.native
    sealed trait down
      extends StObject
         with KeyboardSpinDirection
    /* -1 */ val down: typings.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.down & Double = js.native
    
    @js.native
    sealed trait notSpinning
      extends StObject
         with KeyboardSpinDirection
    /* 0 */ val notSpinning: typings.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.notSpinning & Double = js.native
    
    @js.native
    sealed trait up
      extends StObject
         with KeyboardSpinDirection
    /* 1 */ val up: typings.officeUiFabricReact.spinButtonSpinButtonMod.KeyboardSpinDirection.up & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton", "SpinButton")
  @js.native
  open class SpinButton protected ()
    extends Component[ISpinButtonProps, ISpinButtonState, Any]
       with ISpinButton {
    def this(props: ISpinButtonProps) = this()
    
    /**
      * Invoked when a component is receiving new props. This method is not called for the initial render.
      */
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MSpinButton(newProps: ISpinButtonProps): Unit = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _calculatePrecision: Any = js.native
    
    /* private */ var _currentStepFunctionHandle: Any = js.native
    
    /**
      * Increment function to use if one is not passed in
      */
    /* private */ var _defaultOnDecrement: Any = js.native
    
    /**
      * Increment function to use if one is not passed in
      */
    /* private */ var _defaultOnIncrement: Any = js.native
    
    /**
      * Validate function to use if one is not passed in
      */
    /* private */ var _defaultOnValidate: Any = js.native
    
    /**
      * Handle keydown on the text field. We need to update
      * the value when up or down arrow are depressed
      * @param event - the keyboardEvent that was fired
      */
    /* private */ var _handleKeyDown: Any = js.native
    
    /**
      * Make sure that we have stopped spinning on keyUp
      * if the up or down arrow fired this event
      * @param event - keyboard event
      */
    /* private */ var _handleKeyUp: Any = js.native
    
    /* private */ var _initialStepDelay: Any = js.native
    
    /* private */ var _input: Any = js.native
    
    /* private */ var _inputId: Any = js.native
    
    /* private */ var _labelId: Any = js.native
    
    /* private */ var _lastValidValue: Any = js.native
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onChange: Any = js.native
    
    /* private */ var _onDecrement: Any = js.native
    
    /* private */ var _onDecrementMouseDown: Any = js.native
    
    /* private */ var _onFocus: Any = js.native
    
    /* private */ var _onIncrement: Any = js.native
    
    /* private */ var _onIncrementMouseDown: Any = js.native
    
    /**
      * The method is needed to ensure we are updating the actual input value.
      * without this our value will never change (and validation will not have the correct number)
      * @param event - the event that was fired
      */
    /* private */ var _onInputChange: Any = js.native
    
    /* private */ var _onValidate: Any = js.native
    
    /* private */ var _precision: Any = js.native
    
    /* private */ var _spinningByMouse: Any = js.native
    
    /* private */ var _stepDelay: Any = js.native
    
    /**
      * Stop spinning (clear any currently pending update and set spinning to false)
      */
    /* private */ var _stop: Any = js.native
    
    /**
      * Update the value with the given stepFunction
      * @param shouldSpin - should we fire off another updateValue when we are done here? This should be true
      * when spinning in response to a mouseDown
      * @param stepFunction - function to use to step by
      * @param event - The event that triggered the updateValue
      */
    /* private */ var _updateValue: Any = js.native
    
    /**
      * This is used when validating text entry in the input on blur or when enter key is pressed
      * (not when changed via the buttons).
      * @param event - the event that fired
      */
    /* private */ var _validate: Any = js.native
    
    /* private */ var _valueToValidate: Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSpinButton(): Unit = js.native
    
    /**
      * Sets focus to the control.
      */
    /* CompleteClass */
    override def focus(): Unit = js.native
  }
  /* static members */
  object SpinButton {
    
    @JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton", "SpinButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton", "SpinButton.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    inline def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/SpinButton/SpinButton.types.ISpinButtonProps, 'step' | 'min' | 'max' | 'disabled' | 'labelPosition' | 'label' | 'incrementButtonIcon' | 'decrementButtonIcon'>> */
  trait DefaultProps extends StObject {
    
    var decrementButtonIcon: IIconProps
    
    var disabled: Boolean
    
    var incrementButtonIcon: IIconProps
    
    var label: String
    
    var labelPosition: Position
    
    var max: Double
    
    var min: Double
    
    var step: Double
  }
  object DefaultProps {
    
    inline def apply(
      decrementButtonIcon: IIconProps,
      disabled: Boolean,
      incrementButtonIcon: IIconProps,
      label: String,
      labelPosition: Position,
      max: Double,
      min: Double,
      step: Double
    ): DefaultProps = {
      val __obj = js.Dynamic.literal(decrementButtonIcon = decrementButtonIcon.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], incrementButtonIcon = incrementButtonIcon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps]
    }
    
    extension [Self <: DefaultProps](x: Self) {
      
      inline def setDecrementButtonIcon(value: IIconProps): Self = StObject.set(x, "decrementButtonIcon", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setIncrementButtonIcon(value: IIconProps): Self = StObject.set(x, "incrementButtonIcon", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelPosition(value: Position): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISpinButtonState extends StObject {
    
    /**
      * Is true when the control has focus.
      */
    var isFocused: Boolean
    
    /**
      * keyboard spin direction, used to style the up or down button
      * as active when up/down arrow is pressed
      */
    var keyboardSpinDirection: KeyboardSpinDirection
    
    /**
      * the value of the spin button
      */
    var value: String
  }
  object ISpinButtonState {
    
    inline def apply(isFocused: Boolean, keyboardSpinDirection: KeyboardSpinDirection, value: String): ISpinButtonState = {
      val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], keyboardSpinDirection = keyboardSpinDirection.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpinButtonState]
    }
    
    extension [Self <: ISpinButtonState](x: Self) {
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setKeyboardSpinDirection(value: KeyboardSpinDirection): Self = StObject.set(x, "keyboardSpinDirection", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
