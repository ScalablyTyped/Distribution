package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.projectsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/resources relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.unitsMod.IStructuralUnit because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IFolderBase because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IFolder because var conflicts: containerAsFolderBase, containerAsProject, documents, folders, id, isLoaded, model, structureTypeName, unit. Inlined name */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Folder")
@js.native
class Folder protected () extends FolderBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MFolder: FolderBase = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  var name_FFolder: String = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/projects", "projects.Folder")
@js.native
object Folder extends js.Object {
  
  /**
    * Creates a new Folder unit in the SDK and on the server.
    * Expects one argument, the IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Folder = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
