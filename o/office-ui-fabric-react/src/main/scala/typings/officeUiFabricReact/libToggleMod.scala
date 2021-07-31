package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIToggleState
import typings.officeUiFabricReact.anon.ReadonlyIToggleProps
import typings.officeUiFabricReact.anon.ReadonlyIToggleState
import typings.officeUiFabricReact.toggleTypesMod.IToggleProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToggleMod {
  
  @JSImport("office-ui-fabric-react/lib/Toggle", "Toggle")
  @js.native
  val Toggle: FunctionComponent[IToggleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Toggle", "ToggleBase")
  @js.native
  class ToggleBase protected ()
    extends typings.officeUiFabricReact.toggleMod.ToggleBase {
    def this(props: IToggleProps) = this()
  }
  /* static members */
  object ToggleBase {
    
    @JSImport("office-ui-fabric-react/lib/Toggle", "ToggleBase")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialIToggleState | Null]
  }
}
