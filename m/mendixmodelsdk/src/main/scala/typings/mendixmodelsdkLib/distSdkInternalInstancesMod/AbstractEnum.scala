package typings
package mendixmodelsdkLib.distSdkInternalInstancesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/instances", "AbstractEnum")
@js.native
abstract class AbstractEnum protected () extends js.Object {
  def this(_name: java.lang.String, lifeCycleInfo: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.ILifeCycle) = this()
  val name: java.lang.String = js.native
  var qualifiedTsTypeName: java.lang.String = js.native
  var versionInfo: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.LifeCycle = js.native
  def checkEnumVersion(
    metaModelVersion: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.Version,
    includeWarnings: scala.Boolean
  ): scala.Unit = js.native
  def qualifiedTsLiteralName(): java.lang.String = js.native
}

