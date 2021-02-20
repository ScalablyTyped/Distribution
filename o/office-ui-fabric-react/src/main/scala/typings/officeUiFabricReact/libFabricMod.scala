package typings.officeUiFabricReact

import typings.officeUiFabricReact.fabricTypesMod.IFabricProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFabricMod {
  
  @JSImport("office-ui-fabric-react/lib/Fabric", "Fabric")
  @js.native
  val Fabric: ForwardRefExoticComponent[
    IFabricProps with RefAttributes[typings.officeUiFabricReact.fabricBaseMod.FabricBase]
  ] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Fabric", "FabricBase")
  @js.native
  class FabricBase protected ()
    extends typings.officeUiFabricReact.fabricMod.FabricBase {
    def this(props: IFabricProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IFabricProps, context: js.Any) = this()
  }
}
