package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distModelMod.IModel
import typings.mendixmodelsdk.distModelSdkClientImplMod.ModelSdkClientImpl
import typings.mendixmodelsdk.distSdkConfigurationMod.configuration.ISdkConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Model")
@js.native
class Model ()
  extends typings.mendixmodelsdk.distModelMod.Model

/* static members */
@JSImport("mendixmodelsdk", "Model")
@js.native
object Model extends js.Object {
  def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, typings.mendixmodelsdk.distModelMod.Model] = js.native
}

