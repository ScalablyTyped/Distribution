package typings.mendixmodelsdk

import typings.mendixmodelsdk.baseModelMod.BaseModel
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typings.mendixmodelsdk.modelSdkClientImplMod.ModelSdkClientImpl
import typings.mendixmodelsdk.projectsMod.projects.IModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.abstractModelMod.IAbstractModel because Already inherited
  - typings.mendixmodelsdk.baseModelMod.IBaseModel because Already inherited
  - typings.mendixmodelsdk.baseModelMod.IModel because var conflicts: id, metaModelVersion, mxVersionForModel, root, workingCopy. Inlined findModuleByQualifiedName */ @JSImport("mendixmodelsdk/dist/Model", "Model")
  @js.native
  class Model protected () extends BaseModel {
    def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
    
    var allModelClasses: js.Any = js.native
    
    /**
      * Given a qualified name, returns a Module.
      */
    def findModuleByQualifiedName(qname: String): IModule | Null = js.native
  }
  /* static members */
  object Model {
    
    @JSImport("mendixmodelsdk/dist/Model", "Model.createSdkClient")
    @js.native
    def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, Model] = js.native
  }
  
  type IModel = typings.mendixmodelsdk.baseModelMod.IModel
  
  type ModelSdkClient = ModelSdkClientImpl[IModel, Model]
}
