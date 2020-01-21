package typings.mendixmodelsdk.internalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "Element")
@js.native
abstract class Element protected ()
  extends typings.mendixmodelsdk.elementsMod.Element {
  def this(
    model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.unitsMod.ModelUnit,
    container: typings.mendixmodelsdk.elementsMod.AbstractElement
  ) = this()
}

