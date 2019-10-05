package typings.mendixmodelsdk.mendixmodelsdkMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "domainmodels.MaxLengthRuleInfo")
@js.native
class MaxLengthRuleInfo protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels.MaxLengthRuleInfo {
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
@JSImport("mendixmodelsdk", "domainmodels.MaxLengthRuleInfo")
@js.native
object MaxLengthRuleInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new MaxLengthRuleInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.MaxLengthRuleInfo = js.native
  /**
    * Creates and returns a new MaxLengthRuleInfo instance in the SDK and on the server.
    * The new MaxLengthRuleInfo will be automatically stored in the 'ruleInfo' property
    * of the parent ValidationRule element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.ValidationRule): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.MaxLengthRuleInfo = js.native
}

