package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.AnonHandleError
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "ModelEventReceiver")
@js.native
class ModelEventReceiver protected ()
  extends typings.mendixmodelsdk.internalMod.ModelEventReceiver {
  def this(workingCopyId: String, client: IModelServerClient, errorHandler: AnonHandleError) = this()
}

