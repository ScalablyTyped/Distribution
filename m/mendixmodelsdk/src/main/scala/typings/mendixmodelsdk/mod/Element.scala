package typings.mendixmodelsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Element")
@js.native
abstract class Element protected ()
  extends typings.mendixmodelsdk.internalMod.Element {
  def this(
    model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.unitsMod.ModelUnit,
    container: typings.mendixmodelsdk.elementsMod.AbstractElement
  ) = this()
}

