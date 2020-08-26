package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.unitsMod.IAbstractUnit
import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderBase extends IStructuralUnit {
  val containerAsFolderBase: IFolderBase = js.native
  val containerAsProject: IProject = js.native
  var documents: IList[IDocument] = js.native
  var folders: IList[IFolder] = js.native
  @JSName("model")
  val model_IFolderBase: IModel = js.native
}

object IFolderBase {
  @scala.inline
  def apply(
    allProperties: () => js.Array[AbstractProperty[_, _]],
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
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container.asInstanceOf[js.Any], containerAsFolderBase = containerAsFolderBase.asInstanceOf[js.Any], containerAsProject = containerAsProject.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), documents = documents.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderBase]
  }
  @scala.inline
  implicit class IFolderBaseOps[Self <: IFolderBase] (val x: Self) extends AnyVal {
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
    def setContainerAsFolderBase(value: IFolderBase): Self = this.set("containerAsFolderBase", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerAsProject(value: IProject): Self = this.set("containerAsProject", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocuments(value: IList[IDocument]): Self = this.set("documents", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolders(value: IList[IFolder]): Self = this.set("folders", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: IModel): Self = this.set("model", value.asInstanceOf[js.Any])
  }
  
}

