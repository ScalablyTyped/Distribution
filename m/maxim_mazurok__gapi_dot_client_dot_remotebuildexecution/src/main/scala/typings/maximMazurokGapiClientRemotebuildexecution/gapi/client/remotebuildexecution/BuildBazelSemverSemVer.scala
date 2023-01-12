package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelSemverSemVer extends StObject {
  
  /** The major version, e.g 10 for 10.2.3. */
  var major: js.UndefOr[Double] = js.undefined
  
  /** The minor version, e.g. 2 for 10.2.3. */
  var minor: js.UndefOr[Double] = js.undefined
  
  /** The patch version, e.g 3 for 10.2.3. */
  var patch: js.UndefOr[Double] = js.undefined
  
  /**
    * The pre-release version. Either this field or major/minor/patch fields must be filled. They are mutually exclusive. Pre-release versions are assumed to be earlier than any released
    * versions.
    */
  var prerelease: js.UndefOr[String] = js.undefined
}
object BuildBazelSemverSemVer {
  
  inline def apply(): BuildBazelSemverSemVer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelSemverSemVer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildBazelSemverSemVer] (val x: Self) extends AnyVal {
    
    inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
    
    inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    inline def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
  }
}
