package typings.mendixmodelsdk.internalMod

import typings.mendixmodelsdk.AnonHandleError
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "ModelEventReceiver")
@js.native
class ModelEventReceiver protected ()
  extends typings.mendixmodelsdk.modelEventReceiverMod.ModelEventReceiver {
  def this(workingCopyId: String, client: IModelServerClient, errorHandler: AnonHandleError) = this()
}

