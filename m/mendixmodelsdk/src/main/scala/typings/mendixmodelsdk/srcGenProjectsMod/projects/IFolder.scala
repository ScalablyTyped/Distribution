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
  * See: {@link https://docs.mendix.com/refguide/resources relevant section in reference guide}
  */
trait IFolder
  extends StObject
     with IFolderBase {
  
  var name: String
}
object IFolder {
  
  inline def apply(
    allProperties: () => js.Array[AbstractProperty[Any, Any]],
    container: IStructuralUnit,
    containerAsFolderBase: IFolderBase,
    containerAsProject: IProject,
    delete: () => Unit,
    documents: IList[IDocument],
    folders: IList[IFolder],
    id: String,
    isLoadable: Boolean,
    isLoaded: Boolean,
    isReadOnly: Boolean,
    loadedProperties: () => js.Array[AbstractProperty[Any, Any]],
    model: IModel,
    name: String,
    publicProperties: () => js.Array[AbstractProperty[Any, Any]],
    structureTypeName: String,
    toJSON: () => js.Object,
    traverse: js.Function1[IFolder, Unit] => Unit,
    traverseFind: js.Function1[IFolder, Any] => Any | Null,
    traversePublicParts: js.Function1[IFolder, Unit] => Unit,
    unit: IAbstractUnit
  ): IFolder = {
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container.asInstanceOf[js.Any], containerAsFolderBase = containerAsFolderBase.asInstanceOf[js.Any], containerAsProject = containerAsProject.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), documents = documents.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolder]
  }
  
  extension [Self <: IFolder](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
