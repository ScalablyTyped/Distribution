package typings.mendixmodelsdk.mendixmodelsdkMod.domainmodels

import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "domainmodels.IntegerAttributeTypeBase")
@js.native
abstract class IntegerAttributeTypeBase protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels.IntegerAttributeTypeBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "domainmodels.IntegerAttributeTypeBase")
@js.native
object IntegerAttributeTypeBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

