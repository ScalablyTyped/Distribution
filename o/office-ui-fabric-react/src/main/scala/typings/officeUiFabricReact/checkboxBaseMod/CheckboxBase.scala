package typings.officeUiFabricReact.checkboxBaseMod

import typings.officeUiFabricReact.ReadonlyICheckboxProps
import typings.officeUiFabricReact.ReadonlyICheckboxState
import typings.officeUiFabricReact.checkboxTypesMod.ICheckbox
import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /** Gets the current checked state. */
  /* CompleteClass */
  override var checked: Boolean = js.native
  /** Gets the current indeterminate state. */
  /* CompleteClass */
  override var indeterminate: Boolean = js.native
  /** Sets focus to the checkbox. */
  /* CompleteClass */
  override def focus(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Checkbox/Checkbox.base", "CheckboxBase")
@js.native
object CheckboxBase extends js.Object {
  var defaultProps: ICheckboxProps = js.native
  def getDerivedStateFromProps(nextProps: ReadonlyICheckboxProps, prevState: ReadonlyICheckboxState): ICheckboxState | Null = js.native
}

