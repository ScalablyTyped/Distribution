package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.ReadonlyICheckboxProps
import typings.officeUiFabricReact.anon.ReadonlyICheckboxState
import typings.officeUiFabricReact.libComponentsCheckboxCheckboxDotbaseMod.ICheckboxState
import typings.officeUiFabricReact.libComponentsCheckboxCheckboxDottypesMod.ICheckboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "CheckboxBase")
@js.native
open class CheckboxBase protected ()
  extends typings.officeUiFabricReact.libCheckboxMod.CheckboxBase {
  /**
    * Initialize a new instance of the Checkbox
    * @param props - Props for the component
    * @param context - Context or initial state for the base component.
    */
  def this(props: ICheckboxProps) = this()
  def this(props: ICheckboxProps, context: Any) = this()
}
/* static members */
object CheckboxBase {
  
  @JSImport("office-ui-fabric-react", "CheckboxBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "CheckboxBase.defaultProps")
  @js.native
  def defaultProps: ICheckboxProps = js.native
  inline def defaultProps_=(x: ICheckboxProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(nextProps: ReadonlyICheckboxProps, prevState: ReadonlyICheckboxState): ICheckboxState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[ICheckboxState | Null]
}
