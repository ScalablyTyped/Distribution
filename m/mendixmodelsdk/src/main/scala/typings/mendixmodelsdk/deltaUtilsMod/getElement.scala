package typings.mendixmodelsdk.deltaUtilsMod

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.unitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "getElement")
@js.native
object getElement extends js.Object {
  def apply(model: AbstractModel, unit: ModelUnit, elementId: String): AbstractElement = js.native
}

