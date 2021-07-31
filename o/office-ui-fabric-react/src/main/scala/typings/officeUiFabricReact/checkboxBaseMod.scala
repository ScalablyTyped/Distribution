package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.ReadonlyICheckboxProps
import typings.officeUiFabricReact.anon.ReadonlyICheckboxState
import typings.officeUiFabricReact.checkboxTypesMod.ICheckbox
import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Checkbox/Checkbox.base", "CheckboxBase")
  @js.native
  class CheckboxBase protected ()
    extends Component[ICheckboxProps, ICheckboxState, js.Any]
       with ICheckbox {
    /**
      * Initialize a new instance of the Checkbox
      * @param props - Props for the component
      * @param context - Context or initial state for the base component.
      */
    def this(props: ICheckboxProps) = this()
    def this(props: ICheckboxProps, context: js.Any) = this()
    
    var _checkBox: js.Any = js.native
    
    var _classNames: js.Any = js.native
    
    var _id: js.Any = js.native
    
    var _onBlur: js.Any = js.native
    
    var _onChange: js.Any = js.native
    
    var _onFocus: js.Any = js.native
    
    var _onRenderLabel: js.Any = js.native
    
    var _renderContent: js.Any = js.native
    
    /** Gets the current checked state. */
    /* CompleteClass */
    var checked: Boolean = js.native
    
    /** Sets focus to the checkbox. */
    /* CompleteClass */
    override def focus(): Unit = js.native
    
    /** Gets the current indeterminate state. */
    /* CompleteClass */
    var indeterminate: Boolean = js.native
  }
  /* static members */
  object CheckboxBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Checkbox/Checkbox.base", "CheckboxBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Checkbox/Checkbox.base", "CheckboxBase.defaultProps")
    @js.native
    def defaultProps: ICheckboxProps = js.native
    @scala.inline
    def defaultProps_=(x: ICheckboxProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: ReadonlyICheckboxProps, prevState: ReadonlyICheckboxState): ICheckboxState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[ICheckboxState | Null]
  }
  
  trait ICheckboxState extends StObject {
    
    /** Is true when Uncontrolled control is checked. */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    var isIndeterminate: js.UndefOr[Boolean] = js.undefined
  }
  object ICheckboxState {
    
    @scala.inline
    def apply(): ICheckboxState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckboxState]
    }
    
    @scala.inline
    implicit class ICheckboxStateMutableBuilder[Self <: ICheckboxState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      @scala.inline
      def setIsIndeterminate(value: Boolean): Self = StObject.set(x, "isIndeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIndeterminateUndefined: Self = StObject.set(x, "isIndeterminate", js.undefined)
    }
  }
}
