package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/snippet relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.srcGenPagesMod.pages.IFormBase because Already inherited
- typings.mendixmodelsdk.srcGenPagesMod.pages.ISnippet because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined entity, entityQualifiedName, `type`, parameters */ @JSImport("mendixmodelsdk/src/gen/pages", "pages.Snippet")
@js.native
open class Snippet protected () extends FormBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MSnippet: FolderBase = js.native
  
  /**
    * In version 9.21.0: deleted
    */
  def entity: IEntity | Null = js.native
  
  def entityQualifiedName: String | Null = js.native
  @JSName("entityQualifiedName")
  val entityQualifiedName_FSnippet: String | Null = js.native
  
  def entity_=(newValue: IEntity | Null): Unit = js.native
  /**
    * In version 9.21.0: deleted
    */
  @JSName("entity")
  val entity_FSnippet: IEntity | Null = js.native
  
  /**
    * In version 9.21.0: introduced
    */
  def parameters: IList[SnippetParameter] = js.native
  /**
    * In version 9.21.0: introduced
    */
  @JSName("parameters")
  val parameters_FSnippet: IList[ISnippetParameter] = js.native
  
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
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.Snippet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Snippet unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): Snippet = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Snippet]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.Snippet.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.Snippet.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
