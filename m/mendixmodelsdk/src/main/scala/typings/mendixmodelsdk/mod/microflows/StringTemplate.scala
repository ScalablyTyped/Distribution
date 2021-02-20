package typings.mendixmodelsdk.mod.microflows

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.StringTemplate")
@js.native
class StringTemplate protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.StringTemplate {
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
  
  @JSImport("mendixmodelsdk", "microflows.StringTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplate.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'template' property
    * of the parent CustomRequestHandling element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplate.createInCustomRequestHandlingUnderTemplate")
  @js.native
  def createInCustomRequestHandlingUnderTemplate(container: typings.mendixmodelsdk.microflowsMod.microflows.CustomRequestHandling): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'customLocationTemplate' property
    * of the parent HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplate.createInHttpConfigurationUnderCustomLocationTemplate")
  @js.native
  def createInHttpConfigurationUnderCustomLocationTemplate(container: typings.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'messageTemplate' property
    * of the parent LogMessageAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplate.createInLogMessageActionUnderMessageTemplate")
  @js.native
  def createInLogMessageActionUnderMessageTemplate(container: typings.mendixmodelsdk.microflowsMod.microflows.LogMessageAction): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'template' property
    * of the parent StringTemplateParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 to 8.5.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplate.createInStringTemplateParameterValueUnderTemplate")
  @js.native
  def createInStringTemplateParameterValueUnderTemplate(container: typings.mendixmodelsdk.microflowsMod.microflows.StringTemplateParameterValue): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'description' property
    * of the parent workflows.UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplate.createInUserTaskUnderDescription")
  @js.native
  def createInUserTaskUnderDescription(container: UserTask): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'subject' property
    * of the parent workflows.UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplate.createInUserTaskUnderSubject")
  @js.native
  def createInUserTaskUnderSubject(container: UserTask): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'subject' property
    * of the parent workflows.Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplate.createInWorkflowUnderSubject")
  @js.native
  def createInWorkflowUnderSubject(container: Workflow): typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
