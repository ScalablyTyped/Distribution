package typings
package mendixmodelsdkLib.distSdkInternalUnitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- mendixmodelsdkLib.distSdkInternalUnitsMod.IModelUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined delete */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "ModelUnit")
@js.native
abstract class ModelUnit protected ()
  extends mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement {
  def this(model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean) = this()
  def this(model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: IStructuralUnit) = this()
  @JSName("container")
  val container_ModelUnit: StructuralUnit = js.native
  @JSName("unit")
  val unit_ModelUnit: this.type = js.native
}

