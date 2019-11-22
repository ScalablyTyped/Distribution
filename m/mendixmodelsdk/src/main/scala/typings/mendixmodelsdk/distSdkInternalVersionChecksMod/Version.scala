package typings.mendixmodelsdk.distSdkInternalVersionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "Version")
@js.native
class Version protected () extends js.Object {
  def this(major: Double, minor: Double, patch: Double) = this()
  var major: Double = js.native
  var minor: Double = js.native
  var patch: Double = js.native
  /**
    * Returns 0 if this version is equal to the other version.
    * Returns a negative integer if this version is strictly smaller than the other version.
    * Returns a positive integer if this version is strictly larger than the other version.
    */
  def compare(other: Version): Double = js.native
  /**
    * Returns true if this version is strictly larger than the provided version.
    */
  def isAfter(other: Version): Boolean = js.native
  def isAfterOrEqual(other: Version): Boolean = js.native
  /**
    * Returns true if this version is strictly smaller compared to the provided version.
    */
  def isBefore(other: Version): Boolean = js.native
  def isBeforeOrEqual(other: Version): Boolean = js.native
  def isEqualTo(other: Version): Boolean = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "Version")
@js.native
object Version extends js.Object {
  var memoisMap: js.Any = js.native
  /**
    * Parses and @returns the given string as a Version object.
    *
    * This function is memoised to keep memory and time consumption low,
    * given that only a handful of versions exist at any time anyway.
    */
  def parse(versionString: String): Version = js.native
}

