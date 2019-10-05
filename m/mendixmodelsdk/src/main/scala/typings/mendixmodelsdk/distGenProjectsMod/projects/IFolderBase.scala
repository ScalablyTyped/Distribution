package typings.mendixmodelsdk.distGenProjectsMod.projects

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderBase extends IAbstractUnit {
  val containerAsFolderBase: IFolderBase
  val containerAsProject: IProject
  var documents: IList[IDocument]
  var folders: IList[IFolder]
  @JSName("model")
  val model_IFolderBase: IModel
}

object IFolderBase {
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
    publicProperties: () => js.Array[AbstractProperty[_, _]],
    structureTypeName: String,
    toJSON: () => js.Object,
    traverse: js.Function1[IFolderBase, Unit] => Unit,
    traverseFind: js.Function1[IFolderBase, js.Any] => js.Any | Null,
    traversePublicParts: js.Function1[IFolderBase, Unit] => Unit,
    unit: IAbstractUnit
  ): IFolderBase = {
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container, containerAsFolderBase = containerAsFolderBase, containerAsProject = containerAsProject, documents = documents, folders = folders, id = id, isLoaded = isLoaded, loadedProperties = js.Any.fromFunction0(loadedProperties), model = model, publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName, toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit)
  
    __obj.asInstanceOf[IFolderBase]
  }
}

