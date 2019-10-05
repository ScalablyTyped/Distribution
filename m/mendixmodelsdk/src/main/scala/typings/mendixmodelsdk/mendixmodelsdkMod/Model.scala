package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distMendixDashModelMod.IModel
import typings.mendixmodelsdk.distModelDashSdkDashClientMod.ModelSdkClientImpl
import typings.mendixmodelsdk.distSdkConfigMod.configuration.ISdkConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Model")
@js.native
class Model ()
  extends typings.mendixmodelsdk.distMendixDashModelMod.Model

/* static members */
@JSImport("mendixmodelsdk", "Model")
@js.native
object Model extends js.Object {
  def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, typings.mendixmodelsdk.distMendixDashModelMod.Model] = js.native
}

