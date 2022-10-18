package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`gh-pages`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`master Slashdocs`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.legacy
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.master
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.workflow
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Httpsenforced extends StObject {
  
  /**
    * @description The process by which the GitHub Pages site will be built. `workflow` means that the site is built by a custom GitHub Actions workflow. `legacy` means that the site is built by GitHub when changes are pushed to a specific branch.
    * @enum {string}
    */
  var build_type: js.UndefOr[legacy | workflow] = js.undefined
  
  /** @description Specify a custom domain for the repository. Sending a `null` value will remove the custom domain. For more about custom domains, see "[Using a custom domain with GitHub Pages](https://docs.github.com/articles/using-a-custom-domain-with-github-pages/)." */
  var cname: js.UndefOr[String | Null] = js.undefined
  
  /** @description Specify whether HTTPS should be enforced for the repository. */
  var https_enforced: js.UndefOr[Boolean] = js.undefined
  
  /** @description Configures access controls for the GitHub Pages site. If public is set to `true`, the site is accessible to anyone on the internet. If set to `false`, the site will only be accessible to users who have at least `read` access to the repository that published the site. This includes anyone in your Enterprise if the repository is set to `internal` visibility. This feature is only available to repositories in an organization on an Enterprise plan. */
  var public: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[(Partial[`gh-pages` | master | (`master Slashdocs`)]) & Partial[BranchPath]] = js.undefined
}
object Httpsenforced {
  
  inline def apply(): Httpsenforced = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Httpsenforced]
  }
  
  extension [Self <: Httpsenforced](x: Self) {
    
    inline def setBuild_type(value: legacy | workflow): Self = StObject.set(x, "build_type", value.asInstanceOf[js.Any])
    
    inline def setBuild_typeUndefined: Self = StObject.set(x, "build_type", js.undefined)
    
    inline def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    inline def setCnameNull: Self = StObject.set(x, "cname", null)
    
    inline def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    inline def setHttps_enforced(value: Boolean): Self = StObject.set(x, "https_enforced", value.asInstanceOf[js.Any])
    
    inline def setHttps_enforcedUndefined: Self = StObject.set(x, "https_enforced", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setSource(value: (Partial[`gh-pages` | master | (`master Slashdocs`)]) & Partial[BranchPath]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
