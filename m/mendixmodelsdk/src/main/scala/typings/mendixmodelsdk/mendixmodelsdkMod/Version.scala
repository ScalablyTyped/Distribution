package typings.mendixmodelsdk.mendixmodelsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Version")
@js.native
class Version protected ()
  extends typings.mendixmodelsdk.distSdkInternalMod.Version {
  def this(major: Double, minor: Double, patch: Double) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "Version")
@js.native
object Version extends js.Object {
  var memoisMap: js.Any = js.native
  /**
    * Parses and @returns the given string as a Version object.
    *
    * This function is memoised to keep memory and time consumption low,
    * given that only a handful of versions exist at any time anyway.
    */
  def parse(versionString: String): typings.mendixmodelsdk.distSdkInternalVersionChecksMod.Version = js.native
}

