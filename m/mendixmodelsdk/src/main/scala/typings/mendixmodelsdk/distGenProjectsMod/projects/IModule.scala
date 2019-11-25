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
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), appStoreGuid = appStoreGuid.asInstanceOf[js.Any], appStoreVersion = appStoreVersion.asInstanceOf[js.Any], appStoreVersionGuid = appStoreVersionGuid.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], containerAsFolderBase = containerAsFolderBase.asInstanceOf[js.Any], containerAsProject = containerAsProject.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], domainModel = domainModel.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], fromAppStore = fromAppStore.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], moduleSecurity = moduleSecurity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), sortIndex = sortIndex.asInstanceOf[js.Any], structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IModule]
  }
}

