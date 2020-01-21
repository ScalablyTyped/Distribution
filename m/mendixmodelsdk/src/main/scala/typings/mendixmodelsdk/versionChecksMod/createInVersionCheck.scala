package typings.mendixmodelsdk.versionChecksMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "createInVersionCheck")
@js.native
object createInVersionCheck extends js.Object {
  def apply(model: IAbstractModel, structureTypeName: String, versionRange: IVersionRange): Unit = js.native
}

