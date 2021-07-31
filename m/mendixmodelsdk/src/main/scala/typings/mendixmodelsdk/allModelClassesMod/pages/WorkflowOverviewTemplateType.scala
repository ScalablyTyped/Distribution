package typings.mendixmodelsdk.allModelClassesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.15.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.WorkflowOverviewTemplateType")
@js.native
class WorkflowOverviewTemplateType protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.WorkflowOverviewTemplateType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object WorkflowOverviewTemplateType {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.WorkflowOverviewTemplateType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WorkflowOverviewTemplateType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.WorkflowOverviewTemplateType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.WorkflowOverviewTemplateType]
  
  /**
    * Creates and returns a new WorkflowOverviewTemplateType instance in the SDK and on the server.
    * The new WorkflowOverviewTemplateType will be automatically stored in the 'templateType' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createIn(container: typings.mendixmodelsdk.pagesMod.pages.PageTemplate): typings.mendixmodelsdk.pagesMod.pages.WorkflowOverviewTemplateType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.WorkflowOverviewTemplateType]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.WorkflowOverviewTemplateType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.WorkflowOverviewTemplateType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
