package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Templateowner extends StObject {
  
  var template_owner: String
  
  var template_repo: String
}
object Templateowner {
  
  inline def apply(template_owner: String, template_repo: String): Templateowner = {
    val __obj = js.Dynamic.literal(template_owner = template_owner.asInstanceOf[js.Any], template_repo = template_repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Templateowner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Templateowner] (val x: Self) extends AnyVal {
    
    inline def setTemplate_owner(value: String): Self = StObject.set(x, "template_owner", value.asInstanceOf[js.Any])
    
    inline def setTemplate_repo(value: String): Self = StObject.set(x, "template_repo", value.asInstanceOf[js.Any])
  }
}
