package typings.mendixmodelsdk.srcGenProjectsMod.projects

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenProjectsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.StructuralUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsFolderBase, containerAsProject, folders, documents */ @JSImport("mendixmodelsdk/src/gen/projects", "projects.FolderBase")
@js.native
open class FolderBase protected () extends StructuralUnit[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
  
  def containerAsFolderBase: FolderBase = js.native
  @JSName("containerAsFolderBase")
  val containerAsFolderBase_FFolderBase: IFolderBase = js.native
  
  def containerAsProject: Project = js.native
  @JSName("containerAsProject")
  val containerAsProject_FFolderBase: IProject = js.native
  
  def documents: IList[IDocument] = js.native
  @JSName("documents")
  var documents_FFolderBase: IList[IDocument] = js.native
  
  def folders: IList[IFolder] = js.native
  @JSName("folders")
  var folders_FFolderBase: IList[IFolder] = js.native
}
object FolderBase {
  
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.FolderBase")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.FolderBase.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.FolderBase.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
