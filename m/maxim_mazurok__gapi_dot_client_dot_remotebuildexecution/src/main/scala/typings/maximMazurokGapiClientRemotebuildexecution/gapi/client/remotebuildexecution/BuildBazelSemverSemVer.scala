package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelSemverSemVer extends StObject {
  
  /** The major version, e.g 10 for 10.2.3. */
  var major: js.UndefOr[Double] = js.native
  
  /** The minor version, e.g. 2 for 10.2.3. */
  var minor: js.UndefOr[Double] = js.native
  
  /** The patch version, e.g 3 for 10.2.3. */
  var patch: js.UndefOr[Double] = js.native
  
  /**
    * The pre-release version. Either this field or major/minor/patch fields must be filled. They are mutually exclusive. Pre-release versions are assumed to be earlier than any released
    * versions.
    */
  var prerelease: js.UndefOr[String] = js.native
}
object BuildBazelSemverSemVer {
  
  @scala.inline
  def apply(): BuildBazelSemverSemVer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelSemverSemVer]
  }
  
  @scala.inline
  implicit class BuildBazelSemverSemVerMutableBuilder[Self <: BuildBazelSemverSemVer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    @scala.inline
    def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
    
    @scala.inline
    def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    @scala.inline
    def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
  }
}
