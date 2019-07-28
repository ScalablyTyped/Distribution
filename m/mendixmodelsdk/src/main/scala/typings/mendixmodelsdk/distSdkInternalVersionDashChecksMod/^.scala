package typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod

import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.IAbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/version-checks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def contains(range: IVersionRange, version: Version): Boolean = js.native
  def createInVersionCheck(model: IAbstractModel, structureTypeName: String, versionRange: IVersionRange): Unit = js.native
  def isAtLeast(versionString: String, model: IAbstractModel): Boolean = js.native
  def parseAsNormalizedVersion(versionString: String): Version = js.native
}

