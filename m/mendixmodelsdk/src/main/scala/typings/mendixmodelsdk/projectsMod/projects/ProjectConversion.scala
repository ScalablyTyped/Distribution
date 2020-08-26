package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IProjectConversion because var conflicts: id, isLoadable, isLoaded, isReadOnly, model, structureTypeName, unit. Inlined containerAsProject */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ProjectConversion")
@js.native
class ProjectConversion protected () extends ModelUnit {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
  @JSName("containerAsProject")
  val containerAsProject_FProjectConversion: IProject = js.native
  @JSName("model")
  var model_FProjectConversion: IModel = js.native
  def containerAsProject: Project = js.native
  def markers: IList[OneTimeConversionMarker] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/projects", "projects.ProjectConversion")
@js.native
object ProjectConversion extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new ProjectConversion unit in the SDK and on the server.
    * Expects one argument, the IProject in which this unit is contained.
    */
  def createIn(container: IProject): ProjectConversion = js.native
}

