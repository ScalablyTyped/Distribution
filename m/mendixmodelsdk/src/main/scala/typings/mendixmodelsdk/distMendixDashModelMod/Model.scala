package typings.mendixmodelsdk.distMendixDashModelMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.BaseModel
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IModule
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProject
import typings.mendixmodelsdk.distModelDashSdkDashClientMod.ModelSdkClientImpl
import typings.mendixmodelsdk.distSdkConfigMod.configurationNs.ISdkConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distMendixDashModelMod.IModel because var conflicts: id, metaModelVersion, mxVersionForModel, root, workingCopy. Inlined findModuleByQualifiedName */ @JSImport("mendixmodelsdk/dist/mendix-model", "Model")
@js.native
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
@JSImport("mendixmodelsdk/dist/mendix-model", "Model")
@js.native
object Model extends js.Object {
  def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, Model] = js.native
}

