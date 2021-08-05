package typings.mendixmodelsdk.allModelClassesMod.microflows

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

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate")
@js.native
class StringTemplate protected ()
  extends typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object StringTemplate {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'template' property
    * of the parent CustomRequestHandling element passed as argument.
    */
  /* static member */
  inline def createInCustomRequestHandlingUnderTemplate(container: typings.mendixmodelsdk.microflowsMod.microflows.CustomRequestHandling): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomRequestHandlingUnderTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'customLocationTemplate' property
    * of the parent HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  inline def createInHttpConfigurationUnderCustomLocationTemplate(container: typings.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderCustomLocationTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'messageTemplate' property
    * of the parent LogMessageAction element passed as argument.
    */
  /* static member */
  inline def createInLogMessageActionUnderMessageTemplate(container: typings.mendixmodelsdk.microflowsMod.microflows.LogMessageAction): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLogMessageActionUnderMessageTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'template' property
    * of the parent StringTemplateParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 to 8.5.0
    */
  /* static member */
  inline def createInStringTemplateParameterValueUnderTemplate(container: typings.mendixmodelsdk.microflowsMod.microflows.StringTemplateParameterValue): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStringTemplateParameterValueUnderTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'description' property
    * of the parent workflows.UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInUserTaskUnderDescription(container: UserTask): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInUserTaskUnderDescription")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'subject' property
    * of the parent workflows.UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInUserTaskUnderSubject(container: UserTask): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInUserTaskUnderSubject")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'subject' property
    * of the parent workflows.Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInWorkflowUnderSubject(container: Workflow): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowUnderSubject")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
