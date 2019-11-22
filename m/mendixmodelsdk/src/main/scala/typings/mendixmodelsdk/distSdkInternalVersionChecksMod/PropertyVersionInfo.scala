package typings.mendixmodelsdk.distSdkInternalVersionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "PropertyVersionInfo")
@js.native
class PropertyVersionInfo protected () extends VersionInfo {
  def this(info: Null, publicByDefault: Boolean) = this()
  def this(info: IPropertyVersionInfo, publicByDefault: Boolean) = this()
  var availability: LifeCycle = js.native
  var isPublic: ModifierValueHistory = js.native
  var isRequired: ModifierValueHistory = js.native
}

