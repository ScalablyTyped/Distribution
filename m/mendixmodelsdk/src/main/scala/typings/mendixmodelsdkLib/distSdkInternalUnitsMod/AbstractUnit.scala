package typings
package mendixmodelsdkLib.distSdkInternalUnitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
@JSImport("mendixmodelsdk/dist/sdk/internal/units", "AbstractUnit")
@js.native
abstract class AbstractUnit protected ()
  extends mendixmodelsdkLib.distSdkInternalStructuresMod.Structure {
  def this(model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: IStructuralUnit) = this()
  @JSName("container")
  val container_AbstractUnit: StructuralUnit = js.native
  def deepCopyInto(newParent: IStructuralUnit): AbstractUnit = js.native
}

