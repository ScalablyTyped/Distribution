package typings.officeUiFabricReact

import typings.officeUiFabricReact.fabricTypesMod.IFabricProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Fabric", JSImport.Namespace)
@js.native
object libFabricMod extends js.Object {
  
  val Fabric: ForwardRefExoticComponent[
    IFabricProps with RefAttributes[typings.officeUiFabricReact.fabricBaseMod.FabricBase]
  ] = js.native
  
  @js.native
  class FabricBase ()
    extends typings.officeUiFabricReact.fabricBaseMod.FabricBase
}
