package typings.mendixmodelsdk.distSdkInternalInstancesMod

import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.ILifeCycle
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.LifeCycle
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/instances", "AbstractEnum")
@js.native
abstract class AbstractEnum protected () extends js.Object {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  val name: String = js.native
  var qualifiedTsTypeName: String = js.native
  var versionInfo: LifeCycle = js.native
  def checkEnumVersion(metaModelVersion: Version, includeWarnings: Boolean): Unit = js.native
  def qualifiedTsLiteralName(): String = js.native
}

