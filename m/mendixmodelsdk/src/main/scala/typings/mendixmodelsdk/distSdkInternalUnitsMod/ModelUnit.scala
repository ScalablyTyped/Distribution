package typings.mendixmodelsdk.distSdkInternalUnitsMod

import typings.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined 
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "ModelUnit")
@js.native
abstract class ModelUnit protected () extends AbstractElement {
  def this(model: AbstractModel, structureTypeName: String, id: String, isPartial: Boolean) = this()
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IStructuralUnit
  ) = this()
  @JSName("container")
  val container_FModelUnit: StructuralUnit = js.native
  @JSName("isLoaded")
  def isLoaded_MModelUnit(): Boolean = js.native
  @JSName("unit")
  def unit_MModelUnit(): this.type = js.native
}

