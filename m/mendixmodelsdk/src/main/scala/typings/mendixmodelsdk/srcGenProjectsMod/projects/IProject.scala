package typings.mendixmodelsdk.srcGenProjectsMod.projects

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/project relevant section in reference guide}
  */
trait IProject
  extends StObject
     with IStructuralUnit {
  
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
  
  inline def apply(
    allProperties: () => js.Array[AbstractProperty[Any, Any]],
    container: IStructuralUnit,
    delete: () => Unit,
    id: String,
    isLoadable: Boolean,
    isLoaded: Boolean,
    isReadOnly: Boolean,
    isSystemProject: Boolean,
    loadedProperties: () => js.Array[AbstractProperty[Any, Any]],
    model: IModel,
    modules: IList[IModule],
    projectConversion: IProjectConversion,
    projectDocuments: IList[IProjectDocument],
    publicProperties: () => js.Array[AbstractProperty[Any, Any]],
    structureTypeName: String,
    toJSON: () => js.Object,
    traverse: js.Function1[IProject, Unit] => Unit,
    traverseFind: js.Function1[IProject, Any] => Any | Null,
    traversePublicParts: js.Function1[IProject, Unit] => Unit,
    unit: IAbstractUnit
  ): IProject = {
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isSystemProject = isSystemProject.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], projectConversion = projectConversion.asInstanceOf[js.Any], projectDocuments = projectDocuments.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IProject] (val x: Self) extends AnyVal {
    
    inline def setIsSystemProject(value: Boolean): Self = StObject.set(x, "isSystemProject", value.asInstanceOf[js.Any])
    
    inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModules(value: IList[IModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setProjectConversion(value: IProjectConversion): Self = StObject.set(x, "projectConversion", value.asInstanceOf[js.Any])
    
    inline def setProjectDocuments(value: IList[IProjectDocument]): Self = StObject.set(x, "projectDocuments", value.asInstanceOf[js.Any])
  }
}
