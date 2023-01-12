package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deletedat extends StObject {
  
  /**
    * Format: date-time
    * @example 2011-04-10T20:09:31Z
    */
  var created_at: String
  
  /**
    * Format: date-time
    * @example 2014-03-03T18:58:10Z
    */
  var deleted_at: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  /** @example https://github.com/orgs/github/packages/container/super-linter/786068 */
  var html_url: js.UndefOr[String] = js.undefined
  
  /**
    * @description Unique identifier of the package version.
    * @example 1
    */
  var id: Double
  
  /** @example MIT */
  var license: js.UndefOr[String] = js.undefined
  
  /** Package Version Metadata */
  var metadata: js.UndefOr[Container] = js.undefined
  
  /**
    * @description The name of the package version.
    * @example latest
    */
  var name: String
  
  /** @example https://github.com/orgs/github/packages/container/package/super-linter */
  var package_html_url: String
  
  /**
    * Format: date-time
    * @example 2014-03-03T18:58:10Z
    */
  var updated_at: String
  
  /** @example https://api.github.com/orgs/github/packages/container/super-linter/versions/786068 */
  var url: String
}
object Deletedat {
  
  inline def apply(
    created_at: String,
    id: Double,
    name: String,
    package_html_url: String,
    updated_at: String,
    url: String
  ): Deletedat = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], package_html_url = package_html_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deletedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deletedat] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDeleted_at(value: String): Self = StObject.set(x, "deleted_at", value.asInstanceOf[js.Any])
    
    inline def setDeleted_atUndefined: Self = StObject.set(x, "deleted_at", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setMetadata(value: Container): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPackage_html_url(value: String): Self = StObject.set(x, "package_html_url", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
