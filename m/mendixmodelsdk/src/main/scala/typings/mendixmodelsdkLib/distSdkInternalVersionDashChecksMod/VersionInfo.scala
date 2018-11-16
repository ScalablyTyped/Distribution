package typings
package mendixmodelsdkLib.distSdkInternalVersionDashChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/version-checks", "VersionInfo")
@js.native
abstract class VersionInfo () extends js.Object {
  def checkSameModelVersion(
    model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel,
    otherModel: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel
  ): scala.Unit = js.native
}

