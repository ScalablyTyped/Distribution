package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "createModelUnitFromJSON")
@js.native
object createModelUnitFromJSON extends js.Object {
  
  def apply(containerUnit: IStructuralUnit, containmentName: String, contents: IAbstractElementJson): typings.mendixmodelsdk.unitsMod.ModelUnit[IAbstractModel] = js.native
}
