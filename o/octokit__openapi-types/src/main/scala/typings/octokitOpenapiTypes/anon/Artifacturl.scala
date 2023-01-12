package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifacturl extends StObject {
  
  /** @description The URL of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the repository. */
  var artifact_url: String
  
  /**
    * @description The target environment for this GitHub Pages deployment.
    * @default github-pages
    */
  var environment: js.UndefOr[String] = js.undefined
  
  /** @description The OIDC token issued by GitHub Actions certifying the origin of the deployment. */
  var oidc_token: String
  
  /**
    * @description A unique string that represents the version of the build for this deployment.
    * @default GITHUB_SHA
    */
  var pages_build_version: String
}
object Artifacturl {
  
  inline def apply(artifact_url: String, oidc_token: String, pages_build_version: String): Artifacturl = {
    val __obj = js.Dynamic.literal(artifact_url = artifact_url.asInstanceOf[js.Any], oidc_token = oidc_token.asInstanceOf[js.Any], pages_build_version = pages_build_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifacturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Artifacturl] (val x: Self) extends AnyVal {
    
    inline def setArtifact_url(value: String): Self = StObject.set(x, "artifact_url", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setOidc_token(value: String): Self = StObject.set(x, "oidc_token", value.asInstanceOf[js.Any])
    
    inline def setPages_build_version(value: String): Self = StObject.set(x, "pages_build_version", value.asInstanceOf[js.Any])
  }
}
