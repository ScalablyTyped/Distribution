package typings
package mendixmodelsdkLib.distSdkInternalVersionDashChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/version-checks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def contains(
    range: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.IVersionRange,
    version: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.Version
  ): scala.Boolean = js.native
  def createInVersionCheck(
    model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel,
    structureTypeName: java.lang.String,
    versionRange: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.IVersionRange
  ): scala.Unit = js.native
  def isAtLeast(
    versionString: java.lang.String,
    model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel
  ): scala.Boolean = js.native
  def parseAsNormalizedVersion(versionString: java.lang.String): mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.Version = js.native
}

