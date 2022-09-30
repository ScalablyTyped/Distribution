package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.workflowsMod.workflows.UserTask
import typings.mendixmodelsdk.workflowsMod.workflows.Workflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.StringTemplate")
@js.native
open class StringTemplate protected () extends Template {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def text: String = js.native
  def text_=(newValue: String): Unit = js.native
}
object StringTemplate {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.StringTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'reason' property
    * of the parent AbortOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.2.0 and higher
    */
  /* static member */
  inline def createInAbortOperationUnderReason(container: AbortOperation): StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAbortOperationUnderReason")(container.asInstanceOf[js.Any]).asInstanceOf[StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'template' property
    * of the parent CustomRequestHandling element passed as argument.
    */
  /* static member */
  inline def createInCustomRequestHandlingUnderTemplate(container: CustomRequestHandling): StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomRequestHandlingUnderTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'customLocationTemplate' property
    * of the parent HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  inline def createInHttpConfigurationUnderCustomLocationTemplate(container: HttpConfiguration): StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderCustomLocationTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'messageTemplate' property
    * of the parent LogMessageAction element passed as argument.
    */
  /* static member */
  inline def createInLogMessageActionUnderMessageTemplate(container: LogMessageAction): StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLogMessageActionUnderMessageTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'template' property
    * of the parent StringTemplateParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 to 8.5.0
    */
  /* static member */
  inline def createInStringTemplateParameterValueUnderTemplate(container: StringTemplateParameterValue): StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStringTemplateParameterValueUnderTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'taskDescription' property
    * of the parent workflows.UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInUserTaskUnderTaskDescription(container: UserTask): StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInUserTaskUnderTaskDescription")(container.asInstanceOf[js.Any]).asInstanceOf[StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'taskName' property
    * of the parent workflows.UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInUserTaskUnderTaskName(container: UserTask): StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInUserTaskUnderTaskName")(container.asInstanceOf[js.Any]).asInstanceOf[StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'workflowDescription' property
    * of the parent workflows.Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInWorkflowUnderWorkflowDescription(container: Workflow): StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowUnderWorkflowDescription")(container.asInstanceOf[js.Any]).asInstanceOf[StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'workflowName' property
    * of the parent workflows.Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInWorkflowUnderWorkflowName(container: Workflow): StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowUnderWorkflowName")(container.asInstanceOf[js.Any]).asInstanceOf[StringTemplate]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.StringTemplate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.StringTemplate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
