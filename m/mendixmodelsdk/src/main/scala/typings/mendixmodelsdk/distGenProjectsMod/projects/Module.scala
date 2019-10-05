package typings.mendixmodelsdk.distGenProjectsMod.projects

import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IDomainModel
import typings.mendixmodelsdk.distGenProjectsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenSecurityMod.security.IModuleSecurity
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/modules relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IModule because var conflicts: documents, folders, id, isLoaded, model, structureTypeName, unit. Inlined sortIndex, name, domainModel, moduleSecurity, fromAppStore, appStoreGuid, appStoreVersionGuid, appStoreVersion */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Module")
@js.native
class Module protected () extends FolderBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
  var appStoreGuid: String = js.native
  var appStoreVersion: String = js.native
  var appStoreVersionGuid: String = js.native
  @JSName("containerAsProject")
  val containerAsProject_Module: Project = js.native
  var domainModel: IDomainModel = js.native
  var fromAppStore: Boolean = js.native
  var moduleSecurity: IModuleSecurity = js.native
  var name: String = js.native
  /**
    * The index of where this Module appears in the project.
    * This property is <em>required</em>, and of type double.
    * Also, its value needs to be unique among its siblings (meaning, in code: <tt>containerAsProject.modules</tt>) in the project.
    * In other words: <tt>containerAsProject.modules.map(m => m.sortedIndex)</tt> (TS syntax) needs to be a list with unique values.
    */
  var sortIndex: Double = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/projects", "projects.Module")
@js.native
object Module extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Module unit in the SDK and on the server.
    * Expects one argument, the IProject in which this unit is contained.
    */
  def createIn(container: IProject): Module = js.native
}

