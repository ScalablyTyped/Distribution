package typings.npmLicenseCrawler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait LicenseUrl extends StObject {
    
    var licenseUrl: String = js.native
    
    var licenses: String = js.native
    
    var parents: String = js.native
    
    var repository: String = js.native
  }
  object LicenseUrl {
    
    @scala.inline
    def apply(licenseUrl: String, licenses: String, parents: String, repository: String): LicenseUrl = {
      val __obj = js.Dynamic.literal(licenseUrl = licenseUrl.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
      __obj.asInstanceOf[LicenseUrl]
    }
    
    @scala.inline
    implicit class LicenseUrlMutableBuilder[Self <: LicenseUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLicenseUrl(value: String): Self = StObject.set(x, "licenseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenses(value: String): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParents(value: String): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    }
  }
}
