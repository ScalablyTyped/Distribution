package typings.mendixmodelsdk.distSdkInternalUnitsMod

import typings.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel
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
  def unit_MStructuralUnit(): this.type = js.native
}

