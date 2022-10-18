package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenPagesMod.pages.PageSettings
import typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.UserTask
import typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.Workflow
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.Template")
@js.native
open class Template protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def arguments: IList[TemplateArgument] = js.native
  
  def containerAsAbortOperation: AbortOperation = js.native
  
  def containerAsCustomRequestHandling: CustomRequestHandling = js.native
  
  def containerAsHttpConfiguration: HttpConfiguration = js.native
  
  def containerAsLogMessageAction: LogMessageAction = js.native
  
  def containerAsPageSettings: PageSettings = js.native
  
  def containerAsShowMessageAction: ShowMessageAction = js.native
  
  def containerAsStringTemplateParameterValue: StringTemplateParameterValue = js.native
  
  def containerAsUserTask: UserTask = js.native
  
  def containerAsValidationFeedbackAction: ValidationFeedbackAction = js.native
  
  def containerAsWorkflow: Workflow = js.native
}
object Template {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.Template")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.Template.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.Template.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
