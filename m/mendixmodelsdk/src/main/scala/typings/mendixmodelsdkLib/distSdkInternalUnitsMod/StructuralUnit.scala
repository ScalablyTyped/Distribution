package typings
package mendixmodelsdkLib.distSdkInternalUnitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- mendixmodelsdkLib.distSdkInternalUnitsMod.IStructuralUnit because Already inherited */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "StructuralUnit")
@js.native
abstract class StructuralUnit protected ()
  extends AbstractUnit
     with mendixmodelsdkLib.distSdkInternalStructuresMod.aliasesNs.Container {
  def this(model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, _ignoredIsPartial: scala.Boolean, container: IStructuralUnit) = this()
  @JSName("unit")
  val unit_StructuralUnit: this.type = js.native
}

