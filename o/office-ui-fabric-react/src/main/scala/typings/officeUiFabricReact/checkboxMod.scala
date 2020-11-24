package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.ReadonlyICheckboxProps
import typings.officeUiFabricReact.anon.ReadonlyICheckboxState
import typings.officeUiFabricReact.checkboxBaseMod.ICheckboxState
import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Checkbox", JSImport.Namespace)
@js.native
object checkboxMod extends js.Object {
  
  val Checkbox: FunctionComponent[ICheckboxProps] = js.native
  
  @js.native
  class CheckboxBase protected ()
    extends typings.officeUiFabricReact.checkboxBaseMod.CheckboxBase {
    /**
      * Initialize a new instance of the Checkbox
      * @param props - Props for the component
      * @param context - Context or initial state for the base component.
      */
    def this(props: ICheckboxProps) = this()
    def this(props: ICheckboxProps, context: js.Any) = this()
  }
  /* static members */
  @js.native
  object CheckboxBase extends js.Object {
    
    var defaultProps: ICheckboxProps = js.native
    
    def getDerivedStateFromProps(nextProps: ReadonlyICheckboxProps, prevState: ReadonlyICheckboxState): ICheckboxState | Null = js.native
  }
}
