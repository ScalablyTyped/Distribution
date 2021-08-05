package typings.npmLicenseCrawler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LicenseUrl extends StObject {
    
    var licenseUrl: String
    
    var licenses: String
    
    var parents: String
    
    var repository: String
  }
  object LicenseUrl {
    
    inline def apply(licenseUrl: String, licenses: String, parents: String, repository: String): LicenseUrl = {
      val __obj = js.Dynamic.literal(licenseUrl = licenseUrl.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
      __obj.asInstanceOf[LicenseUrl]
    }
    
    extension [Self <: LicenseUrl](x: Self) {
      
      inline def setLicenseUrl(value: String): Self = StObject.set(x, "licenseUrl", value.asInstanceOf[js.Any])
      
      inline def setLicenses(value: String): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      inline def setParents(value: String): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    }
  }
}
