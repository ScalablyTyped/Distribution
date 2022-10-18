package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.PartialIToggleState
import typings.officeUiFabricReact.anon.ReadonlyIToggleProps
import typings.officeUiFabricReact.anon.ReadonlyIToggleState
import typings.officeUiFabricReact.libComponentsToggleToggleDottypesMod.IToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "ToggleBase")
@js.native
open class ToggleBase protected ()
  extends typings.officeUiFabricReact.libToggleMod.ToggleBase {
  def this(props: IToggleProps) = this()
}
/* static members */
object ToggleBase {
  
  @JSImport("office-ui-fabric-react", "ToggleBase")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialIToggleState | Null]
}
