package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distCommonMod.common.IErrorCallback
import typings.mendixmodelsdk.distSdkInternalModelDashServerDashClientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "AbstractModel")
@js.native
abstract class AbstractModel protected ()
  extends typings.mendixmodelsdk.distSdkInternalMod.AbstractModel {
  def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
}

