package typings
package mendixmodelsdkLib.distMendixDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distMendixDashModelMod.IModel because Would inherit conflicting mutable fields List(mxVersionForModel, id, workingCopy, metaModelVersion))*/
@JSImport("mendixmodelsdk/dist/mendix-model", "Model")
@js.native
class Model ()
  extends mendixmodelsdkLib.distGenBaseDashModelMod.BaseModel {
  var allModelClasses: js.Any = js.native
  /**
       * Returns the structural unit of type "Projects$Project" which is the project's root,
       * cast to the appropriate type.
       */
  @JSName("root")
  val root_Model: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject = js.native
  def findModuleByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModule | scala.Null = js.native
}

@JSImport("mendixmodelsdk/dist/mendix-model", "Model")
@js.native
object Model extends js.Object {
  def createSdkClient(connectionConfig: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ISdkConfig): mendixmodelsdkLib.distModelDashSdkDashClientMod.ModelSdkClientImpl[
    mendixmodelsdkLib.distGenBaseDashModelMod.IModel, 
    mendixmodelsdkLib.distMendixDashModelMod.Model
  ] = js.native
}

