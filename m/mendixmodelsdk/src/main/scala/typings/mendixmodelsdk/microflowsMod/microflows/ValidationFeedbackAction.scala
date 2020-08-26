package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
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
  @JSName("model")
  var model_FValidationFeedbackAction: IModel = js.native
  /**
    * See: {@link https://docs.mendix.com/refguide7/validation-feedback See 'Member' section in reference guide}
    */
  def association: IAssociationBase | Null = js.native
  def associationQualifiedName: String | Null = js.native
  def association_=(newValue: IAssociationBase | Null): Unit = js.native
  /**
    * See: {@link https://docs.mendix.com/refguide7/validation-feedback See 'Member' section in reference guide}
    */
  def attribute: IAttribute | Null = js.native
  def attributeQualifiedName: String | Null = js.native
  def attribute_=(newValue: IAttribute | Null): Unit = js.native
  def feedbackTemplate: TextTemplate = js.native
  def feedbackTemplate_=(newValue: TextTemplate): Unit = js.native
  def objectVariableName: String = js.native
  def objectVariableName_=(newValue: String): Unit = js.native
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

