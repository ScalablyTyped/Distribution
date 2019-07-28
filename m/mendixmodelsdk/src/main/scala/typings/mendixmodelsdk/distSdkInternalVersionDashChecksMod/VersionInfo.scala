package typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod

import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.IAbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/version-checks", "VersionInfo")
@js.native
abstract class VersionInfo () extends js.Object {
  def checkSameModelVersion(model: IAbstractModel, otherModel: IAbstractModel): Unit = js.native
}

