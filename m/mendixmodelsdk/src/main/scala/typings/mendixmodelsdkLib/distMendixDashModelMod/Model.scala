package typings
package mendixmodelsdkLib.distMendixDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- mendixmodelsdkLib.distMendixDashModelMod.IModel because var conflicts: id, metaModelVersion, mxVersionForModel, root, workingCopy. Inlined findModuleByQualifiedName */ @JSImport("mendixmodelsdk/dist/mendix-model", "Model")
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
  /**
    * Given a qualified name, returns a Module.
    */
  def findModuleByQualifiedName(qname: java.lang.String): mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModule | scala.Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/mendix-model", "Model")
@js.native
object Model extends js.Object {
  def createSdkClient(connectionConfig: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ISdkConfig): mendixmodelsdkLib.distModelDashSdkDashClientMod.ModelSdkClientImpl[
    mendixmodelsdkLib.distMendixDashModelMod.IModel, 
    mendixmodelsdkLib.distMendixDashModelMod.Model
  ] = js.native
}

