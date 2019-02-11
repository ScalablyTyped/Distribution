package typings
package mendixmodelsdkLib.distSdkInternalAbstractDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/abstract-model", "AbstractModel")
@js.native
abstract class AbstractModel protected () extends IAbstractModel {
  def this(_client: mendixmodelsdkLib.distSdkInternalModelDashServerDashClientMod.IModelServerClient, _errorHandler: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback) = this()
  val root: mendixmodelsdkLib.distSdkInternalUnitsMod.IStructuralUnit = js.native
  def getFile(
    filePath: java.lang.String,
    outFilePath: java.lang.String,
    callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback,
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
  def handleError(message: java.lang.String): scala.Unit = js.native
  def handleError(message: java.lang.String, errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback): scala.Unit = js.native
  def importModuleMpk(mpkPath: java.lang.String, callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback): scala.Unit = js.native
  def importModuleMpk(mpkPath: stdLib.Blob, callback: mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback): scala.Unit = js.native
  def loadUnitById[T /* <: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit */](id: java.lang.String): js.Promise[T] = js.native
  def loadUnitById[T /* <: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit */](
    id: java.lang.String,
    forceRefresh: js.UndefOr[scala.Nothing],
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[T]
  ): scala.Unit = js.native
  def loadUnitById[T /* <: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit */](
    id: java.lang.String,
    forceRefresh: js.UndefOr[scala.Nothing],
    callback: mendixmodelsdkLib.distCommonMod.commonNs.ICallback[T],
    errorCallback: mendixmodelsdkLib.distCommonMod.commonNs.IErrorCallback
  ): scala.Unit = js.native
}

