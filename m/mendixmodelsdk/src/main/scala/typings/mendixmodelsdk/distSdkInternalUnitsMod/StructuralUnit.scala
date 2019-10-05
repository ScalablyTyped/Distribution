package typings.mendixmodelsdk.distSdkInternalUnitsMod

import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalStructuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit because Already inherited */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "StructuralUnit")
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

