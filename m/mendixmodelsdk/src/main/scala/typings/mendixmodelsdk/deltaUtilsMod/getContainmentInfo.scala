package typings.mendixmodelsdk.deltaUtilsMod

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.unitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "getContainmentInfo")
@js.native
object getContainmentInfo extends js.Object {
  def apply(unit: ModelUnit, model: AbstractModel, elementId: String): IContainmentInfo = js.native
}

