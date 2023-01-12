package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detector extends StObject {
  
  /** @description A description of the detector used. */
  var detector: UrlVersion
  
  var job: Correlator
  
  /** @description A collection of package manifests, which are a collection of related dependencies declared in a file or representing a logical group of dependencies. */
  var manifests: js.UndefOr[StringDictionary[Resolved]] = js.undefined
  
  var metadata: js.UndefOr[StringDictionary[Partial[String] & Partial[Double] & Partial[Boolean]]] = js.undefined
  
  /**
    * @description The repository branch that triggered this snapshot.
    * @example refs/heads/main
    */
  var ref: String
  
  /**
    * Format: date-time
    * @description The time at which the snapshot was scanned.
    * @example 2020-06-13T14:52:50-05:00
    */
  var scanned: String
  
  /**
    * @description The commit SHA associated with this dependency snapshot.
    * @example ddc951f4b1293222421f2c8df679786153acf689
    */
  var sha: String
  
  /** @description The version of the repository snapshot submission. */
  var version: Double
}
object Detector {
  
  inline def apply(detector: UrlVersion, job: Correlator, ref: String, scanned: String, sha: String, version: Double): Detector = {
    val __obj = js.Dynamic.literal(detector = detector.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], scanned = scanned.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Detector] (val x: Self) extends AnyVal {
    
    inline def setDetector(value: UrlVersion): Self = StObject.set(x, "detector", value.asInstanceOf[js.Any])
    
    inline def setJob(value: Correlator): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setManifests(value: StringDictionary[Resolved]): Self = StObject.set(x, "manifests", value.asInstanceOf[js.Any])
    
    inline def setManifestsUndefined: Self = StObject.set(x, "manifests", js.undefined)
    
    inline def setMetadata(value: StringDictionary[Partial[String] & Partial[Double] & Partial[Boolean]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setScanned(value: String): Self = StObject.set(x, "scanned", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
