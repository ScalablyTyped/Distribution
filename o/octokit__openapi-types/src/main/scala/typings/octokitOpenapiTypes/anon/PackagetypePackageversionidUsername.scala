package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagetypePackageversionidUsername extends StObject {
  
  /** The name of the package. */
  var package_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-name'] */ js.Any
  
  /** The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. */
  var package_type: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-type'] */ js.Any
  
  /** Unique identifier of the package version. */
  var package_version_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-version-id'] */ js.Any
  
  /** The handle for the GitHub user account. */
  var username: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['username'] */ js.Any
}
object PackagetypePackageversionidUsername {
  
  inline def apply(
    package_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-name'] */ js.Any,
    package_type: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-type'] */ js.Any,
    package_version_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-version-id'] */ js.Any,
    username: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['username'] */ js.Any
  ): PackagetypePackageversionidUsername = {
    val __obj = js.Dynamic.literal(package_name = package_name.asInstanceOf[js.Any], package_type = package_type.asInstanceOf[js.Any], package_version_id = package_version_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackagetypePackageversionidUsername]
  }
  
  extension [Self <: PackagetypePackageversionidUsername](x: Self) {
    
    inline def setPackage_name(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-name'] */ js.Any
    ): Self = StObject.set(x, "package_name", value.asInstanceOf[js.Any])
    
    inline def setPackage_type(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-type'] */ js.Any
    ): Self = StObject.set(x, "package_type", value.asInstanceOf[js.Any])
    
    inline def setPackage_version_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-version-id'] */ js.Any
    ): Self = StObject.set(x, "package_version_id", value.asInstanceOf[js.Any])
    
    inline def setUsername(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['username'] */ js.Any
    ): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
