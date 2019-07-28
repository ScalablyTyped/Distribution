package typings.mendixmodelsdk.distSdkInternalUnitsMod

import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "AbstractUnit")
@js.native
abstract class AbstractUnit protected () extends Structure {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IStructuralUnit
  ) = this()
  @JSName("container")
  val container_AbstractUnit: StructuralUnit = js.native
  def deepCopyInto(newParent: IStructuralUnit): AbstractUnit = js.native
}

