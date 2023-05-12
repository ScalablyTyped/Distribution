package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Protection extends StObject {
  
  var _links: Html
  
  var commit: AuthorCommentsurl
  
  var name: String
  
  /** @example "mas*" */
  var pattern: js.UndefOr[String] = js.undefined
  
  var `protected`: Boolean
  
  var protection: Allowforksyncing
  
  /** Format: uri */
  var protection_url: String
  
  /** @example 1 */
  var required_approving_review_count: js.UndefOr[Double] = js.undefined
}
object Protection {
  
  inline def apply(
    _links: Html,
    commit: AuthorCommentsurl,
    name: String,
    `protected`: Boolean,
    protection: Allowforksyncing,
    protection_url: String
  ): Protection = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], protection_url = protection_url.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Protection] (val x: Self) extends AnyVal {
    
    inline def setCommit(value: AuthorCommentsurl): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtection(value: Allowforksyncing): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtection_url(value: String): Self = StObject.set(x, "protection_url", value.asInstanceOf[js.Any])
    
    inline def setRequired_approving_review_count(value: Double): Self = StObject.set(x, "required_approving_review_count", value.asInstanceOf[js.Any])
    
    inline def setRequired_approving_review_countUndefined: Self = StObject.set(x, "required_approving_review_count", js.undefined)
    
    inline def set_links(value: Html): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
