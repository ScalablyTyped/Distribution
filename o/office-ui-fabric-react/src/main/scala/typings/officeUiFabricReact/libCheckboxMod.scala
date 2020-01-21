package typings.officeUiFabricReact

import typings.officeUiFabricReact.checkboxBaseMod.ICheckboxState
import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Checkbox", JSImport.Namespace)
@js.native
object libCheckboxMod extends js.Object {
  @js.native
  class CheckboxBase protected ()
    extends typings.officeUiFabricReact.checkboxMod.CheckboxBase {
    /**
      * Initialize a new instance of the Checkbox
      * @param props - Props for the component
      * @param context - Context or initial state for the base component.
      */
    def this(props: ICheckboxProps) = this()
    def this(props: ICheckboxProps, context: js.Any) = this()
  }
  
  val Checkbox: StatelessComponent[ICheckboxProps] = js.native
  /* static members */
  @js.native
  object CheckboxBase extends js.Object {
    var defaultProps: ICheckboxProps = js.native
    def getDerivedStateFromProps(nextProps: ICheckboxProps, prevState: ICheckboxState): ICheckboxState | Null = js.native
  }
  
}

