package typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod

import typings.mendixmodelsdk.distCommonMod.commonNs.ICallback
import typings.mendixmodelsdk.distCommonMod.commonNs.IErrorCallback
import typings.mendixmodelsdk.distCommonMod.commonNs.IVoidCallback
import typings.mendixmodelsdk.distSdkInternalModelDashServerDashClientMod.IModelServerClient
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/abstract-model", "AbstractModel")
@js.native
abstract class AbstractModel protected () extends IAbstractModel {
  def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
  val root: IStructuralUnit = js.native
  def getFile(filePath: String, outFilePath: String, callback: IVoidCallback, errorCallback: IErrorCallback): Unit = js.native
  def handleError(message: String): Unit = js.native
  def handleError(message: String, errorCallback: IErrorCallback): Unit = js.native
  def importModuleMpk(mpkPath: String, callback: IVoidCallback): Unit = js.native
  def importModuleMpk(mpkPath: Blob, callback: IVoidCallback): Unit = js.native
  def loadUnitById[T /* <: IAbstractUnit */](id: String): js.Promise[T] = js.native
  def loadUnitById[T /* <: IAbstractUnit */](id: String, forceRefresh: js.UndefOr[scala.Nothing], callback: ICallback[T]): Unit = js.native
  def loadUnitById[T /* <: IAbstractUnit */](
    id: String,
    forceRefresh: js.UndefOr[scala.Nothing],
    callback: ICallback[T],
    errorCallback: IErrorCallback
  ): Unit = js.native
}

