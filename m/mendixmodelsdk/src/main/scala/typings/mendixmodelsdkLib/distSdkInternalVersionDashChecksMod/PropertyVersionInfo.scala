package typings
package mendixmodelsdkLib.distSdkInternalVersionDashChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/version-checks", "PropertyVersionInfo")
@js.native
class PropertyVersionInfo protected () extends VersionInfo {
  def this(info: IPropertyVersionInfo, publicByDefault: scala.Boolean) = this()
  def this(info: scala.Null, publicByDefault: scala.Boolean) = this()
  var availability: LifeCycle = js.native
  var isPublic: ModifierValueHistory = js.native
  var isRequired: ModifierValueHistory = js.native
}

