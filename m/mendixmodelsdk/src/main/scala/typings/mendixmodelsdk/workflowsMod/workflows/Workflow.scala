package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.microflowsMod.microflows.StringTemplate
import typings.mendixmodelsdk.pagesMod.pages.IPage
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.workflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.10.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.workflowsMod.workflows.IWorkflow because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined contextEntity, contextEntityQualifiedName, activities */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Workflow")
@js.native
class Workflow protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  @JSName("activities")
  val activities_FWorkflow: IList[IWorkflowActivity] = js.native
  @JSName("contextEntityQualifiedName")
  val contextEntityQualifiedName_FWorkflow: String | Null = js.native
  @JSName("contextEntity")
  val contextEntity_FWorkflow: IEntity | Null = js.native
  @JSName("model")
  var model_FWorkflow: IModel = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  def activities: IList[WorkflowActivity] = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MWorkflow: FolderBase = js.native
  def contextEntity: IEntity | Null = js.native
  def contextEntityQualifiedName: String | Null = js.native
  def contextEntity_=(newValue: IEntity | Null): Unit = js.native
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  def flows: IList[Flow] = js.native
  /**
    * In version 8.11.0: introduced
    */
  def overviewPage: IPage | Null = js.native
  def overviewPageQualifiedName: String | Null = js.native
  def overviewPage_=(newValue: IPage | Null): Unit = js.native
  /**
    * In version 8.11.0: introduced
    */
  def subject: StringTemplate = js.native
  def subject_=(newValue: StringTemplate): Unit = js.native
  def title: String = js.native
  def title_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Workflow")
@js.native
object Workflow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Workflow unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Workflow = js.native
}

