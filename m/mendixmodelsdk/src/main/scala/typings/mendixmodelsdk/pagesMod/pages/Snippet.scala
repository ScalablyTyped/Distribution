package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/snippet relevant section in reference guide}
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
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MSnippet: FolderBase = js.native
  
  def entity: IEntity | Null = js.native
  
  def entityQualifiedName: String | Null = js.native
  @JSName("entityQualifiedName")
  val entityQualifiedName_FSnippet: String | Null = js.native
  
  def entity_=(newValue: IEntity | Null): Unit = js.native
  @JSName("entity")
  val entity_FSnippet: IEntity | Null = js.native
  
  /**
    * In version 8.4.0: added public
    * In version 8.0.0: introduced
    */
  def `type`: SnippetType = js.native
  def type_=(newValue: SnippetType): Unit = js.native
  /**
    * In version 8.4.0: added public
    * In version 8.0.0: introduced
    */
  @JSName("type")
  val type_FSnippet: SnippetType = js.native
  
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
object Snippet {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Snippet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Snippet unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Snippet.createIn")
  @js.native
  def createIn(container: IFolderBase): Snippet = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Snippet.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Snippet.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
