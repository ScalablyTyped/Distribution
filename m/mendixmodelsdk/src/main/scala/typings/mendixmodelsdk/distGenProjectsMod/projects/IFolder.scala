package typings.mendixmodelsdk.distGenProjectsMod.projects

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://world.mendix.com/display/howto50/Add+documents+to+a+module relevant section in reference guide}
  */
trait IFolder extends IFolderBase {
  var name: String
}

object IFolder {
  @scala.inline
  def apply(
    allProperties: () => js.Array[AbstractProperty[_, _]],
    container: IStructuralUnit,
    containerAsFolderBase: IFolderBase,
    containerAsProject: IProject,
    documents: IList[IDocument],
    folders: IList[IFolder],
    id: String,
    isLoaded: Boolean,
    loadedProperties: () => js.Array[AbstractProperty[_, _]],
    model: IModel,
    name: String,
    publicProperties: () => js.Array[AbstractProperty[_, _]],
    structureTypeName: String,
    toJSON: () => js.Object,
    traverse: js.Function1[IFolder, Unit] => Unit,
    traverseFind: js.Function1[IFolder, js.Any] => js.Any | Null,
    traversePublicParts: js.Function1[IFolder, Unit] => Unit,
    unit: IAbstractUnit
  ): IFolder = {
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container, containerAsFolderBase = containerAsFolderBase, containerAsProject = containerAsProject, documents = documents, folders = folders, id = id, isLoaded = isLoaded, loadedProperties = js.Any.fromFunction0(loadedProperties), model = model, name = name, publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName, toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit)
  
    __obj.asInstanceOf[IFolder]
  }
}

