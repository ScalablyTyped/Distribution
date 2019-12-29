package typings.mendixmodelsdk.mendixmodelsdkMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/validation-rules relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "domainmodels.ValidationRule")
@js.native
class ValidationRule protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels.ValidationRule {
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
@JSImport("mendixmodelsdk", "domainmodels.ValidationRule")
@js.native
object ValidationRule extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ValidationRule instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.ValidationRule = js.native
  /**
    * Creates and returns a new ValidationRule instance in the SDK and on the server.
    * The new ValidationRule will be automatically stored in the 'validationRules' property
    * of the parent Entity element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.Entity): typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.ValidationRule = js.native
}

