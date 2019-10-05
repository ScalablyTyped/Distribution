package typings.mendixmodelsdk.mendixmodelsdkMod.domainmodels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/associations relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "domainmodels.AssociationBase")
@js.native
abstract class AssociationBase protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels.AssociationBase {
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
@JSImport("mendixmodelsdk", "domainmodels.AssociationBase")
@js.native
object AssociationBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
}

