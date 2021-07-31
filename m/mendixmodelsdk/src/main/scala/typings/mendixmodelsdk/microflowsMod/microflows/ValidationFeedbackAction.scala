package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/validation-feedback relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ValidationFeedbackAction")
@js.native
class ValidationFeedbackAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * See: {@link https://docs.mendix.com/refguide/validation-feedback See 'Member' section in reference guide}
    */
  def association: IAssociationBase | Null = js.native
  
  def associationQualifiedName: String | Null = js.native
  
  def association_=(newValue: IAssociationBase | Null): Unit = js.native
  
  /**
    * See: {@link https://docs.mendix.com/refguide/validation-feedback See 'Member' section in reference guide}
    */
  def attribute: IAttribute | Null = js.native
  
  def attributeQualifiedName: String | Null = js.native
  
  def attribute_=(newValue: IAttribute | Null): Unit = js.native
  
  def feedbackTemplate: TextTemplate = js.native
  def feedbackTemplate_=(newValue: TextTemplate): Unit = js.native
  
  def objectVariableName: String = js.native
  def objectVariableName_=(newValue: String): Unit = js.native
}
object ValidationFeedbackAction {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ValidationFeedbackAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ValidationFeedbackAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): ValidationFeedbackAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ValidationFeedbackAction]
  
  /**
    * Creates and returns a new ValidationFeedbackAction instance in the SDK and on the server.
    * The new ValidationFeedbackAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  /* static member */
  @scala.inline
  def createIn(container: ActionActivity): ValidationFeedbackAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ValidationFeedbackAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ValidationFeedbackAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ValidationFeedbackAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
