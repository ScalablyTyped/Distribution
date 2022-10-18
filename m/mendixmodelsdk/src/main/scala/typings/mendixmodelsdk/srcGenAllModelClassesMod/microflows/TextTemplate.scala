package typings.mendixmodelsdk.srcGenAllModelClassesMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenPagesMod.pages.PageSettings
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.TextTemplate")
@js.native
open class TextTemplate protected ()
  extends typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.TextTemplate {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object TextTemplate {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.TextTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new TextTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.TextTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.TextTemplate]
  
  /**
    * Creates and returns a new TextTemplate instance in the SDK and on the server.
    * The new TextTemplate will be automatically stored in the 'titleOverride' property
    * of the parent pages.PageSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.12.0 and higher
    */
  /* static member */
  inline def createInPageSettingsUnderTitleOverride(container: PageSettings): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.TextTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageSettingsUnderTitleOverride")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.TextTemplate]
  
  /**
    * Creates and returns a new TextTemplate instance in the SDK and on the server.
    * The new TextTemplate will be automatically stored in the 'template' property
    * of the parent ShowMessageAction element passed as argument.
    */
  /* static member */
  inline def createInShowMessageActionUnderTemplate(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ShowMessageAction): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.TextTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInShowMessageActionUnderTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.TextTemplate]
  
  /**
    * Creates and returns a new TextTemplate instance in the SDK and on the server.
    * The new TextTemplate will be automatically stored in the 'feedbackTemplate' property
    * of the parent ValidationFeedbackAction element passed as argument.
    */
  /* static member */
  inline def createInValidationFeedbackActionUnderFeedbackTemplate(container: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ValidationFeedbackAction): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.TextTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValidationFeedbackActionUnderFeedbackTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.TextTemplate]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.TextTemplate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.TextTemplate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
