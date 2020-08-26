package typings.officeUiFabricReact

import typings.officeUiFabricReact.fabricTypesMod.IFabricProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Fabric", JSImport.Namespace)
@js.native
object fabricMod extends js.Object {
  @js.native
  class FabricBase ()
    extends typings.officeUiFabricReact.fabricBaseMod.FabricBase
  
  val Fabric: ForwardRefExoticComponent[
    IFabricProps with RefAttributes[typings.officeUiFabricReact.fabricBaseMod.FabricBase]
  ] = js.native
}

