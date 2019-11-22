package typings.mendixmodelsdk.distSdkInternalVersionChecksMod

import typings.mendixmodelsdk.distSdkInternalAbstractModelMod.IAbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "VersionInfo")
@js.native
abstract class VersionInfo () extends js.Object {
  def checkSameModelVersion(model: IAbstractModel, otherModel: IAbstractModel): Unit = js.native
}

