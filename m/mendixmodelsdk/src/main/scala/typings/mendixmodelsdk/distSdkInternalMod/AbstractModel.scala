package typings.mendixmodelsdk.distSdkInternalMod

import typings.mendixmodelsdk.distCommonMod.common.IErrorCallback
import typings.mendixmodelsdk.distSdkInternalIModelServerClientMod.IModelServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "AbstractModel")
@js.native
abstract class AbstractModel protected ()
  extends typings.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel {
  def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
}

