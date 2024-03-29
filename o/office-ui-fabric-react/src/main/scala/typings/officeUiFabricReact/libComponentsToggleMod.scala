package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIToggleState
import typings.officeUiFabricReact.anon.ReadonlyIToggleProps
import typings.officeUiFabricReact.anon.ReadonlyIToggleState
import typings.officeUiFabricReact.libComponentsToggleToggleDottypesMod.IToggleProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsToggleMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Toggle", "Toggle")
  @js.native
  val Toggle: FunctionComponent[IToggleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Toggle", "ToggleBase")
  @js.native
  open class ToggleBase protected ()
    extends typings.officeUiFabricReact.libComponentsToggleToggleDotbaseMod.ToggleBase {
    def this(props: IToggleProps) = this()
  }
  /* static members */
  object ToggleBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Toggle", "ToggleBase")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialIToggleState | Null]
  }
}
