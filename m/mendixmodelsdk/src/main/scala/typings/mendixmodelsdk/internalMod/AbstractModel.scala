package typings.mendixmodelsdk.internalMod

import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractModel")
@js.native
abstract class AbstractModel protected ()
  extends typings.mendixmodelsdk.abstractModelMod.AbstractModel {
  def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
}
