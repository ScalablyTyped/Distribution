package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowBase because Already inherited
- typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IServerSideMicroflow because var conflicts: containerAsFolderBase, id, isLoaded, microflowReturnType, model, returnType, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ServerSideMicroflow")
@js.native
abstract class ServerSideMicroflow protected () extends MicroflowBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FServerSideMicroflow: IModel = js.native
  def applyEntityAccess(): Boolean = js.native
  def applyEntityAccess(newValue: Boolean): js.Any = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MServerSideMicroflow(): FolderBase = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ServerSideMicroflow")
@js.native
object ServerSideMicroflow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

