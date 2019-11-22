package typings.mendixmodelsdk.distGenProjectsMod.projects

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IDomainModel
import typings.mendixmodelsdk.distGenSecurityMod.security.IModuleSecurity
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/modules relevant section in reference guide}
  */
trait IModule extends IFolderBase {
  var appStoreGuid: String
  var appStoreVersion: String
  var appStoreVersionGuid: String
  /**
    * This property is required and cannot be set to null.
    */
  var domainModel: IDomainModel
  var fromAppStore: Boolean
  /**
    * This property is required and cannot be set to null.
    */
  var moduleSecurity: IModuleSecurity
  var name: String
  /**
    * The index of where this Module appears in the project.
    * This property is <em>required</em>, and of type double.
    * Also, its value needs to be unique among its siblings (meaning, in code: <tt>containerAsProject.modules</tt>) in the project.
    * In other words: <tt>containerAsProject.modules.map(m => m.sortedIndex)</tt> (TS syntax) needs to be a list with unique values.
    */
  var sortIndex: Double
}

object IModule {
  @scala.inline
  def apply(
    allProperties: () => js.Array[AbstractProperty[_, _]],
    appStoreGuid: String,
    appStoreVersion: String,
    appStoreVersionGuid: String,
    container: IStructuralUnit,
    containerAsFolderBase: IFolderBase,
    containerAsProject: IProject,
    documents: IList[IDocument],
    domainModel: IDomainModel,
    folders: IList[IFolder],
    fromAppStore: Boolean,
    id: String,
    isLoaded: Boolean,
    loadedProperties: () => js.Array[AbstractProperty[_, _]],
    model: IModel,
    moduleSecurity: IModuleSecurity,
    name: String,
    publicProperties: () => js.Array[AbstractProperty[_, _]],
    sortIndex: Double,
    structureTypeName: String,
    toJSON: () => js.Object,
    traverse: js.Function1[IModule, Unit] => Unit,
    traverseFind: js.Function1[IModule, js.Any] => js.Any | Null,
    traversePublicParts: js.Function1[IModule, Unit] => Unit,
    unit: IAbstractUnit
  ): IModule = {
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), appStoreGuid = appStoreGuid, appStoreVersion = appStoreVersion, appStoreVersionGuid = appStoreVersionGuid, container = container, containerAsFolderBase = containerAsFolderBase, containerAsProject = containerAsProject, documents = documents, domainModel = domainModel, folders = folders, fromAppStore = fromAppStore, id = id, isLoaded = isLoaded, loadedProperties = js.Any.fromFunction0(loadedProperties), model = model, moduleSecurity = moduleSecurity, name = name, publicProperties = js.Any.fromFunction0(publicProperties), sortIndex = sortIndex, structureTypeName = structureTypeName, toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit)
  
    __obj.asInstanceOf[IModule]
  }
}

