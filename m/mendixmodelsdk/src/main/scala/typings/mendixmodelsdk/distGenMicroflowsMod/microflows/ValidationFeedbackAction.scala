package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAssociationBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/validation-feedback relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ValidationFeedbackAction")
@js.native
class ValidationFeedbackAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * See: {@link https://docs.mendix.com/refguide7/validation-feedback See 'Member' section in reference guide}
    */
  var association: IAssociationBase | Null = js.native
  val associationQualifiedName: String | Null = js.native
  /**
    * See: {@link https://docs.mendix.com/refguide7/validation-feedback See 'Member' section in reference guide}
    */
  var attribute: IAttribute | Null = js.native
  val attributeQualifiedName: String | Null = js.native
  var feedbackTemplate: TextTemplate = js.native
  var objectVariableName: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ValidationFeedbackAction")
@js.native
object ValidationFeedbackAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ValidationFeedbackAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ValidationFeedbackAction = js.native
  /**
    * Creates and returns a new ValidationFeedbackAction instance in the SDK and on the server.
    * The new ValidationFeedbackAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: ActionActivity): ValidationFeedbackAction = js.native
}

