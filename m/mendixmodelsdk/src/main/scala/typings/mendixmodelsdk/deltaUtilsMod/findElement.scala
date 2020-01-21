package typings.mendixmodelsdk.deltaUtilsMod

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.unitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "findElement")
@js.native
object findElement extends js.Object {
  def apply(model: AbstractModel, unit: ModelUnit, elementId: String): AbstractElement | Null = js.native
}

