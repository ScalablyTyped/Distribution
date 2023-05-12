package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`gh-pages`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`master Slashdocs`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.legacy
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.master
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.workflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buildtype extends StObject {
  
  /**
    * @description The process by which the GitHub Pages site will be built. `workflow` means that the site is built by a custom GitHub Actions workflow. `legacy` means that the site is built by GitHub when changes are pushed to a specific branch.
    * @enum {string}
    */
  var build_type: js.UndefOr[legacy | workflow] = js.undefined
  
  /** @description Specify a custom domain for the repository. Sending a `null` value will remove the custom domain. For more about custom domains, see "[Using a custom domain with GitHub Pages](https://docs.github.com/articles/using-a-custom-domain-with-github-pages/)." */
  var cname: js.UndefOr[String | Null] = js.undefined
  
  /** @description Specify whether HTTPS should be enforced for the repository. */
  var https_enforced: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[`gh-pages` | master | (`master Slashdocs`) | BranchPath] = js.undefined
}
object Buildtype {
  
  inline def apply(): Buildtype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Buildtype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Buildtype] (val x: Self) extends AnyVal {
    
    inline def setBuild_type(value: legacy | workflow): Self = StObject.set(x, "build_type", value.asInstanceOf[js.Any])
    
    inline def setBuild_typeUndefined: Self = StObject.set(x, "build_type", js.undefined)
    
    inline def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    inline def setCnameNull: Self = StObject.set(x, "cname", null)
    
    inline def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    inline def setHttps_enforced(value: Boolean): Self = StObject.set(x, "https_enforced", value.asInstanceOf[js.Any])
    
    inline def setHttps_enforcedUndefined: Self = StObject.set(x, "https_enforced", js.undefined)
    
    inline def setSource(value: `gh-pages` | master | (`master Slashdocs`) | BranchPath): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
