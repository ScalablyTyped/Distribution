package typings.officeUiFabricReact.checkboxBaseMod

import typings.officeUiFabricReact.anon.ReadonlyICheckboxProps
import typings.officeUiFabricReact.anon.ReadonlyICheckboxState
import typings.officeUiFabricReact.checkboxTypesMod.ICheckbox
import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/Checkbox/Checkbox.base", "CheckboxBase")
@js.native
object CheckboxBase extends js.Object {
  
  var defaultProps: ICheckboxProps = js.native
  
  def getDerivedStateFromProps(nextProps: ReadonlyICheckboxProps, prevState: ReadonlyICheckboxState): ICheckboxState | Null = js.native
}
