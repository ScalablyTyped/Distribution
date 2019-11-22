package typings.mendixmodelsdk.distSdkInternalMod

import typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractUnit")
@js.native
abstract class AbstractUnit protected ()
  extends typings.mendixmodelsdk.distSdkInternalUnitsMod.AbstractUnit {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IStructuralUnit
  ) = this()
}

