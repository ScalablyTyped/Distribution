package typings.officeUiFabricReact

import typings.officeUiFabricReact.overflowSetTypesMod.IOverflowSetProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overflowSetMod {
  
  @JSImport("office-ui-fabric-react/lib/components/OverflowSet", "OverflowSet")
  @js.native
  val OverflowSet: FunctionComponent[IOverflowSetProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/OverflowSet", "OverflowSetBase")
  @js.native
  open class OverflowSetBase protected ()
    extends typings.officeUiFabricReact.overflowSetBaseMod.OverflowSetBase {
    def this(props: IOverflowSetProps) = this()
  }
}
