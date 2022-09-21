package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Githubownedallowed extends StObject {
  
  /** @description Whether GitHub-owned actions are allowed. For example, this includes the actions in the `actions` organization. */
  var github_owned_allowed: js.UndefOr[Boolean] = js.undefined
  
  /** @description Specifies a list of string-matching patterns to allow specific action(s) and reusable workflow(s). Wildcards, tags, and SHAs are allowed. For example, `monalisa/octocat@*`, `monalisa/octocat@v2`, `monalisa/ *`." */
  var patterns_allowed: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description Whether actions from GitHub Marketplace verified creators are allowed. Set to `true` to allow all actions by GitHub Marketplace verified creators. */
  var verified_allowed: js.UndefOr[Boolean] = js.undefined
}
object Githubownedallowed {
  
  inline def apply(): Githubownedallowed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Githubownedallowed]
  }
  
  extension [Self <: Githubownedallowed](x: Self) {
    
    inline def setGithub_owned_allowed(value: Boolean): Self = StObject.set(x, "github_owned_allowed", value.asInstanceOf[js.Any])
    
    inline def setGithub_owned_allowedUndefined: Self = StObject.set(x, "github_owned_allowed", js.undefined)
    
    inline def setPatterns_allowed(value: js.Array[String]): Self = StObject.set(x, "patterns_allowed", value.asInstanceOf[js.Any])
    
    inline def setPatterns_allowedUndefined: Self = StObject.set(x, "patterns_allowed", js.undefined)
    
    inline def setPatterns_allowedVarargs(value: String*): Self = StObject.set(x, "patterns_allowed", js.Array(value*))
    
    inline def setVerified_allowed(value: Boolean): Self = StObject.set(x, "verified_allowed", value.asInstanceOf[js.Any])
    
    inline def setVerified_allowedUndefined: Self = StObject.set(x, "verified_allowed", js.undefined)
  }
}
