package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.ReadonlyICheckboxProps
import typings.officeUiFabricReact.anon.ReadonlyICheckboxState
import typings.officeUiFabricReact.checkboxBaseMod.ICheckboxState
import typings.officeUiFabricReact.checkboxTypesMod.ICheckboxProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCheckboxMod {
  
  @JSImport("office-ui-fabric-react/lib/Checkbox", "Checkbox")
  @js.native
  val Checkbox: FunctionComponent[ICheckboxProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Checkbox", "CheckboxBase")
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
  /* static members */
  object CheckboxBase {
    
    @JSImport("office-ui-fabric-react/lib/Checkbox", "CheckboxBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Checkbox", "CheckboxBase.defaultProps")
    @js.native
    def defaultProps: ICheckboxProps = js.native
    inline def defaultProps_=(x: ICheckboxProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: ReadonlyICheckboxProps, prevState: ReadonlyICheckboxState): ICheckboxState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[ICheckboxState | Null]
  }
}
