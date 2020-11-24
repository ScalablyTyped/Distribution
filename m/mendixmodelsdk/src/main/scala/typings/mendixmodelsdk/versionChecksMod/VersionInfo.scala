package typings.mendixmodelsdk.versionChecksMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "VersionInfo")
@js.native
abstract class VersionInfo () extends js.Object {
  
  def checkSameModelVersion(model: IAbstractModel, otherModel: IAbstractModel): Unit = js.native
}
