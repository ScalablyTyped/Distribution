package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseheadOwner extends StObject {
  
  /** @description The base and head Git revisions to compare. The Git revisions will be resolved to commit SHAs. Named revisions will be resolved to their corresponding HEAD commits, and an appropriate merge base will be determined. This parameter expects the format `{base}...{head}`. */
  var basehead: String
  
  var owner: String
  
  var repo: String
}
object BaseheadOwner {
  
  inline def apply(basehead: String, owner: String, repo: String): BaseheadOwner = {
    val __obj = js.Dynamic.literal(basehead = basehead.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseheadOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseheadOwner] (val x: Self) extends AnyVal {
    
    inline def setBasehead(value: String): Self = StObject.set(x, "basehead", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
