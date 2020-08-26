package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/snippet relevant section in reference guide}
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
- typings.mendixmodelsdk.pagesMod.pages.IFormBase because Already inherited
- typings.mendixmodelsdk.pagesMod.pages.ISnippet because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined entity, entityQualifiedName, `type` */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Snippet")
@js.native
class Snippet protected () extends FormBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("entityQualifiedName")
  val entityQualifiedName_FSnippet: String | Null = js.native
  @JSName("entity")
  val entity_FSnippet: IEntity | Null = js.native
  @JSName("model")
  var model_FSnippet: IModel = js.native
  /**
    * In version 8.4.0: added public
    * In version 8.0.0: introduced
    */
  @JSName("type")
  val type_FSnippet: SnippetType = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MSnippet: FolderBase = js.native
  def entity: IEntity | Null = js.native
  def entityQualifiedName: String | Null = js.native
  def entity_=(newValue: IEntity | Null): Unit = js.native
  /**
    * In version 8.4.0: added public
    * In version 8.0.0: introduced
    */
  def `type`: SnippetType = js.native
  def type_=(newValue: SnippetType): Unit = js.native
  /**
    * In version 7.15.0: deleted
    */
  def widget: Widget | Null = js.native
  def widget_=(newValue: Widget | Null): Unit = js.native
  /**
    * In version 7.15.0: introduced
    */
  def widgets: IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Snippet")
@js.native
object Snippet extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Snippet unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Snippet = js.native
}

