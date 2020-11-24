package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IDomainModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.securityMod.security.IModuleSecurity
import typings.mendixmodelsdk.unitsMod.IAbstractUnit
import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/modules relevant section in reference guide}
  */
@js.native
trait IModule extends IFolderBase {
  
  var appStoreGuid: String = js.native
  
  /**
    * In version 8.13.0: introduced
    */
  var appStorePackageId: Double = js.native
  
  var appStoreVersion: String = js.native
  
  var appStoreVersionGuid: String = js.native
  
  /**
    * This property is required and cannot be set to null.
    */
  var domainModel: IDomainModel = js.native
  
  var fromAppStore: Boolean = js.native
  
  /**
    * In version 8.5.0: introduced
    */
  var isReusableComponent: Boolean = js.native
  
  /**
    * This property is required and cannot be set to null.
    */
  var moduleSecurity: IModuleSecurity = js.native
  
  var name: String = js.native
  
  /**
    * The index of where this Module appears in the project.
    * This property is <em>required</em>, and of type double.
    * Also, its value needs to be unique among its siblings (meaning, in code: <tt>containerAsProject.modules</tt>) in the project.
    * In other words: <tt>containerAsProject.modules.map(m => m.sortedIndex)</tt> (TS syntax) needs to be a list with unique values.
    */
  var sortIndex: Double = js.native
}
object IModule {
  
  @scala.inline
  def apply(
    allProperties: () => js.Array[AbstractProperty[_, _]],
    appStoreGuid: String,
    appStorePackageId: Double,
    appStoreVersion: String,
    appStoreVersionGuid: String,
    container: IStructuralUnit,
    containerAsFolderBase: IFolderBase,
    containerAsProject: IProject,
    delete: () => Unit,
    documents: IList[IDocument],
    domainModel: IDomainModel,
    folders: IList[IFolder],
    fromAppStore: Boolean,
    id: String,
    isLoadable: Boolean,
    isLoaded: Boolean,
    isReadOnly: Boolean,
    isReusableComponent: Boolean,
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
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), appStoreGuid = appStoreGuid.asInstanceOf[js.Any], appStorePackageId = appStorePackageId.asInstanceOf[js.Any], appStoreVersion = appStoreVersion.asInstanceOf[js.Any], appStoreVersionGuid = appStoreVersionGuid.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], containerAsFolderBase = containerAsFolderBase.asInstanceOf[js.Any], containerAsProject = containerAsProject.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), documents = documents.asInstanceOf[js.Any], domainModel = domainModel.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], fromAppStore = fromAppStore.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isReusableComponent = isReusableComponent.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], moduleSecurity = moduleSecurity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), sortIndex = sortIndex.asInstanceOf[js.Any], structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModule]
  }
  
  @scala.inline
  implicit class IModuleOps[Self <: IModule] (val x: Self) extends AnyVal {
    
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
    def setAppStoreGuid(value: String): Self = this.set("appStoreGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStorePackageId(value: Double): Self = this.set("appStorePackageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreVersion(value: String): Self = this.set("appStoreVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreVersionGuid(value: String): Self = this.set("appStoreVersionGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainModel(value: IDomainModel): Self = this.set("domainModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromAppStore(value: Boolean): Self = this.set("fromAppStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReusableComponent(value: Boolean): Self = this.set("isReusableComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleSecurity(value: IModuleSecurity): Self = this.set("moduleSecurity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortIndex(value: Double): Self = this.set("sortIndex", value.asInstanceOf[js.Any])
  }
}
