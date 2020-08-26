package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IProjectDocument because var conflicts: id, isLoadable, isLoaded, isReadOnly, model, structureTypeName, unit. Inlined containerAsProject */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ProjectDocument")
@js.native
abstract class ProjectDocument protected () extends ModelUnit {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
  @JSName("containerAsProject")
  val containerAsProject_FProjectDocument: IProject = js.native
  @JSName("model")
  var model_FProjectDocument: IModel = js.native
  def containerAsProject: Project = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/projects", "projects.ProjectDocument")
@js.native
object ProjectDocument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

