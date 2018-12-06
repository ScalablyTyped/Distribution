package typings
package mendixmodelsdkLib.mendixmodelsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Model")
@js.native
class Model ()
  extends mendixmodelsdkLib.distMendixDashModelMod.Model

@JSImport("mendixmodelsdk", "Model")
@js.native
object Model extends js.Object {
  def createSdkClient(connectionConfig: mendixmodelsdkLib.distSdkConfigMod.configurationNs.ISdkConfig): mendixmodelsdkLib.distModelDashSdkDashClientMod.ModelSdkClientImpl[
    mendixmodelsdkLib.distMendixDashModelMod.IModel, 
    mendixmodelsdkLib.distMendixDashModelMod.Model
  ] = js.native
}

