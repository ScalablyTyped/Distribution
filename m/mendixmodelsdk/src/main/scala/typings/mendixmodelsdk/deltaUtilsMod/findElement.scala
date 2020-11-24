package typings.mendixmodelsdk.deltaUtilsMod

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.unitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "findElement")
@js.native
object findElement extends js.Object {
  
  def apply(model: AbstractModel, unit: ModelUnit[IAbstractModel], elementId: String): (AbstractElement[IAbstractModel, Container]) | Null = js.native
}
