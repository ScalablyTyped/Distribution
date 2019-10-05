package typings.mendixmodelsdk.mendixmodelsdkMod.domainmodels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "domainmodels.NumericAttributeTypeBase")
@js.native
abstract class NumericAttributeTypeBase protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels.NumericAttributeTypeBase {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "domainmodels.NumericAttributeTypeBase")
@js.native
object NumericAttributeTypeBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
}

