package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenBaseDashModelMod.BaseModel
import typings.mendixmodelsdk.distGenProjectsMod.projects.IModule
import typings.mendixmodelsdk.distGenProjectsMod.projects.IProject
import typings.mendixmodelsdk.distMendixDashModelMod.IModel
import typings.mendixmodelsdk.distMendixDashModelMod.Model
import typings.mendixmodelsdk.distModelDashSdkDashClientMod.ModelSdkClientImpl
import typings.mendixmodelsdk.distSdkConfigMod.configuration.ISdkConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/mendix-model", JSImport.Namespace)
@js.native
object distMendixDashModelMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.IAbstractModel because Already inherited
  - typings.mendixmodelsdk.distGenBaseDashModelMod.IBaseModel because Already inherited
  - typings.mendixmodelsdk.distMendixDashModelMod.IModel because var conflicts: id, metaModelVersion, mxVersionForModel, root, workingCopy. Inlined findModuleByQualifiedName */ @js.native
  class Model () extends BaseModel {
    var allModelClasses: js.Any = js.native
    /**
      * Returns the structural unit of type "Projects$Project" which is the project's root,
      * cast to the appropriate type.
      */
    @JSName("root")
    val root_Model: IProject = js.native
    /**
      * Given a qualified name, returns a Module.
      */
    def findModuleByQualifiedName(qname: String): IModule | Null = js.native
  }
  
  /* static members */
  @js.native
  object Model extends js.Object {
    def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, Model] = js.native
  }
  
  type IModel = typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
  type ModelSdkClient = ModelSdkClientImpl[IModel, Model]
}

