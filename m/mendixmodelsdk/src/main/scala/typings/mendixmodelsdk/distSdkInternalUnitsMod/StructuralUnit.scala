package typings.mendixmodelsdk.distSdkInternalUnitsMod

import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalStructuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/units", "StructuralUnit")
@js.native
abstract class StructuralUnit protected ()
  extends AbstractUnit
     with Container {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    _ignoredIsPartial: Boolean,
    container: IStructuralUnit
  ) = this()
  @JSName("unit")
  val unit_StructuralUnit: this.type = js.native
}

