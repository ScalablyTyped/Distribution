package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "AbstractModel")
@js.native
abstract class AbstractModel protected ()
  extends typings.mendixmodelsdk.internalMod.AbstractModel {
  def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
}

