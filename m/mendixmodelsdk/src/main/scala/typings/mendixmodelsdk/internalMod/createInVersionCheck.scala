package typings.mendixmodelsdk.internalMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.versionChecksMod.IVersionRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "createInVersionCheck")
@js.native
object createInVersionCheck extends js.Object {
  def apply(model: IAbstractModel, structureTypeName: String, versionRange: IVersionRange): Unit = js.native
}

