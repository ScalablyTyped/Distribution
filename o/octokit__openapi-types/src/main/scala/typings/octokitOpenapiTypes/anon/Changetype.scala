package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.added
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Changetype extends StObject {
  
  /** @enum {string} */
  var change_type: added | removed
  
  /** @example npm */
  var ecosystem: String
  
  /** @example MIT */
  var license: String | Null
  
  /** @example path/to/package-lock.json */
  var manifest: String
  
  /** @example @actions/core */
  var name: String
  
  /** @example pkg:/npm/%40actions/core@1.1.0 */
  var package_url: String | Null
  
  /** @example https://github.com/github/actions */
  var source_repository_url: String | Null
  
  /** @example 1.0.0 */
  var version: String
  
  var vulnerabilities: js.Array[Advisoryghsaid]
}
object Changetype {
  
  inline def apply(
    change_type: added | removed,
    ecosystem: String,
    manifest: String,
    name: String,
    version: String,
    vulnerabilities: js.Array[Advisoryghsaid]
  ): Changetype = {
    val __obj = js.Dynamic.literal(change_type = change_type.asInstanceOf[js.Any], ecosystem = ecosystem.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], vulnerabilities = vulnerabilities.asInstanceOf[js.Any], license = null, package_url = null, source_repository_url = null)
    __obj.asInstanceOf[Changetype]
  }
  
  extension [Self <: Changetype](x: Self) {
    
    inline def setChange_type(value: added | removed): Self = StObject.set(x, "change_type", value.asInstanceOf[js.Any])
    
    inline def setEcosystem(value: String): Self = StObject.set(x, "ecosystem", value.asInstanceOf[js.Any])
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseNull: Self = StObject.set(x, "license", null)
    
    inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPackage_url(value: String): Self = StObject.set(x, "package_url", value.asInstanceOf[js.Any])
    
    inline def setPackage_urlNull: Self = StObject.set(x, "package_url", null)
    
    inline def setSource_repository_url(value: String): Self = StObject.set(x, "source_repository_url", value.asInstanceOf[js.Any])
    
    inline def setSource_repository_urlNull: Self = StObject.set(x, "source_repository_url", null)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilities(value: js.Array[Advisoryghsaid]): Self = StObject.set(x, "vulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitiesVarargs(value: Advisoryghsaid*): Self = StObject.set(x, "vulnerabilities", js.Array(value*))
  }
}
