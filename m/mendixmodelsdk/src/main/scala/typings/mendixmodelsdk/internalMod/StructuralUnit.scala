package typings.mendixmodelsdk.internalMod

import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "StructuralUnit")
@js.native
abstract class StructuralUnit protected ()
  extends typings.mendixmodelsdk.unitsMod.StructuralUnit {
  def this(
    model: typings.mendixmodelsdk.abstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    _ignoredIsPartial: Boolean,
    container: IStructuralUnit
  ) = this()
}

