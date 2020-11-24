package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.anon.HandleError
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "ModelEventReceiver")
@js.native
class ModelEventReceiver protected ()
  extends typings.mendixmodelsdk.internalMod.ModelEventReceiver {
  def this(workingCopyId: String, client: IModelServerClient, errorHandler: HandleError) = this()
}
