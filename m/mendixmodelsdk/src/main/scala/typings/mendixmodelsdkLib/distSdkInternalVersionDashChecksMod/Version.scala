package typings
package mendixmodelsdkLib.distSdkInternalVersionDashChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/version-checks", "Version")
@js.native
class Version protected () extends js.Object {
  def this(major: scala.Double, minor: scala.Double, patch: scala.Double) = this()
  var major: scala.Double = js.native
  var minor: scala.Double = js.native
  var patch: scala.Double = js.native
  /**
    * Returns 0 if this version is equal to the other version.
    * Returns a negative integer if this version is strictly smaller than the other version.
    * Returns a positive integer if this version is strictly larger than the other version.
    */
  def compare(other: Version): scala.Double = js.native
  /**
    * Returns true if this version is strictly larger than the provided version.
    */
  def isAfter(other: Version): scala.Boolean = js.native
  def isAfterOrEqual(other: Version): scala.Boolean = js.native
  /**
    * Returns true if this version is strictly smaller compared to the provided version.
    */
  def isBefore(other: Version): scala.Boolean = js.native
  def isBeforeOrEqual(other: Version): scala.Boolean = js.native
  def isEqualTo(other: Version): scala.Boolean = js.native
}

@JSImport("mendixmodelsdk/dist/sdk/internal/version-checks", "Version")
@js.native
object Version extends js.Object {
  var memoisMap: js.Any = js.native
  /**
    * Parses and @returns the given string as a Version object.
    *
    * This function is memoised to keep memory and time consumption low,
    * given that only a handful of versions exist at any time anyway.
    */
  def parse(versionString: java.lang.String): mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.Version = js.native
}

