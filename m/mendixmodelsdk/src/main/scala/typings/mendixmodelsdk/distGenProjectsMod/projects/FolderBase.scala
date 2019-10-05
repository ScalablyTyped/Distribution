package typings.mendixmodelsdk.distGenProjectsMod.projects

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenProjectsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.StructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsFolderBase, containerAsProject, folders, documents */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.FolderBase")
@js.native
abstract class FolderBase protected () extends StructuralUnit {
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
  val containerAsFolderBase: FolderBase | IFolderBase = js.native
  val containerAsProject: IProject | Project = js.native
  val documents: IList[IDocument] = js.native
  val folders: IList[IFolder] = js.native
  @JSName("model")
  var model_FolderBase: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/projects", "projects.FolderBase")
@js.native
object FolderBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

