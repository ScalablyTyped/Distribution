package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.checkboxBaseMod.ICheckboxState
import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "CheckboxBase")
@js.native
class CheckboxBase protected ()
  extends typings.officeUiFabricReact.libCheckboxMod.CheckboxBase {
  /**
    * Initialize a new instance of the Checkbox
    * @param props - Props for the component
    * @param context - Context or initial state for the base component.
    */
  def this(props: ICheckboxProps) = this()
  def this(props: ICheckboxProps, context: js.Any) = this()
}

/* static members */
@JSImport("office-ui-fabric-react", "CheckboxBase")
@js.native
object CheckboxBase extends js.Object {
  var defaultProps: ICheckboxProps = js.native
  def getDerivedStateFromProps(nextProps: ICheckboxProps, prevState: ICheckboxState): ICheckboxState | Null = js.native
}

