package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.unitsMod.IAbstractUnit
import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
  */
@js.native
trait IProject extends IStructuralUnit {
  var isSystemProject: Boolean = js.native
  @JSName("model")
  val model_IProject: IModel = js.native
  var modules: IList[IModule] = js.native
  /**
    * This property is required and cannot be set to null.
    */
  var projectConversion: IProjectConversion = js.native
  var projectDocuments: IList[IProjectDocument] = js.native
}

object IProject {
  @scala.inline
  def apply(
    allProperties: () => js.Array[AbstractProperty[_, _]],
    container: IStructuralUnit,
    delete: () => Unit,
    id: String,
    isLoadable: Boolean,
    isLoaded: Boolean,
    isReadOnly: Boolean,
    isSystemProject: Boolean,
    loadedProperties: () => js.Array[AbstractProperty[_, _]],
    model: IModel,
    modules: IList[IModule],
    projectConversion: IProjectConversion,
    projectDocuments: IList[IProjectDocument],
    publicProperties: () => js.Array[AbstractProperty[_, _]],
    structureTypeName: String,
    toJSON: () => js.Object,
    traverse: js.Function1[IProject, Unit] => Unit,
    traverseFind: js.Function1[IProject, js.Any] => js.Any | Null,
    traversePublicParts: js.Function1[IProject, Unit] => Unit,
    unit: IAbstractUnit
  ): IProject = {
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isSystemProject = isSystemProject.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], projectConversion = projectConversion.asInstanceOf[js.Any], projectDocuments = projectDocuments.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProject]
  }
  @scala.inline
  implicit class IProjectOps[Self <: IProject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsSystemProject(value: Boolean): Self = this.set("isSystemProject", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: IModel): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setModules(value: IList[IModule]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectConversion(value: IProjectConversion): Self = this.set("projectConversion", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectDocuments(value: IList[IProjectDocument]): Self = this.set("projectDocuments", value.asInstanceOf[js.Any])
  }
  
}

