package typings.mendixmodelsdk.distGenProjectsMod.projects

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
  */
trait IProject extends IAbstractUnit {
  var isSystemProject: Boolean
  @JSName("model")
  val model_IProject: IModel
  var modules: IList[IModule]
  /**
    * This property is required and cannot be set to null.
    */
  var projectConversion: IProjectConversion
  var projectDocuments: IList[IProjectDocument]
}

object IProject {
  @scala.inline
  def apply(
    allProperties: () => js.Array[AbstractProperty[_, _]],
    container: IStructuralUnit,
    id: String,
    isLoaded: Boolean,
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
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container, id = id, isLoaded = isLoaded, isSystemProject = isSystemProject, loadedProperties = js.Any.fromFunction0(loadedProperties), model = model, modules = modules, projectConversion = projectConversion, projectDocuments = projectDocuments, publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName, toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit)
  
    __obj.asInstanceOf[IProject]
  }
}

