package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.container
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.docker
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.maven
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.npm
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.nuget
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.public
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rubygems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repository extends StObject {
  
  /** Format: date-time */
  var created_at: String
  
  /** @example https://github.com/orgs/github/packages/container/package/super-linter */
  var html_url: String
  
  /**
    * @description Unique identifier of the package.
    * @example 1
    */
  var id: Double
  
  /**
    * @description The name of the package.
    * @example super-linter
    */
  var name: String
  
  var owner: js.UndefOr[Avatarurl | Null] = js.undefined
  
  /**
    * @example docker
    * @enum {string}
    */
  var package_type: npm | maven | rubygems | docker | nuget | container
  
  var repository: js.UndefOr[Branchesurl | Null] = js.undefined
  
  /** Format: date-time */
  var updated_at: String
  
  /** @example https://api.github.com/orgs/github/packages/container/super-linter */
  var url: String
  
  /**
    * @description The number of versions of the package.
    * @example 1
    */
  var version_count: Double
  
  /**
    * @example private
    * @enum {string}
    */
  var visibility: `private` | public
}
object Repository {
  
  inline def apply(
    created_at: String,
    html_url: String,
    id: Double,
    name: String,
    package_type: npm | maven | rubygems | docker | nuget | container,
    updated_at: String,
    url: String,
    version_count: Double,
    visibility: `private` | public
  ): Repository = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], package_type = package_type.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version_count = version_count.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Repository] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Avatarurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPackage_type(value: npm | maven | rubygems | docker | nuget | container): Self = StObject.set(x, "package_type", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Branchesurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNull: Self = StObject.set(x, "repository", null)
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVersion_count(value: Double): Self = StObject.set(x, "version_count", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: `private` | public): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
