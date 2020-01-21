package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typings.mendixmodelsdk.modelMod.IModel
import typings.mendixmodelsdk.modelSdkClientImplMod.ModelSdkClientImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Model")
@js.native
class Model ()
  extends typings.mendixmodelsdk.modelMod.Model

/* static members */
@JSImport("mendixmodelsdk", "Model")
@js.native
object Model extends js.Object {
  def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, typings.mendixmodelsdk.modelMod.Model] = js.native
}

