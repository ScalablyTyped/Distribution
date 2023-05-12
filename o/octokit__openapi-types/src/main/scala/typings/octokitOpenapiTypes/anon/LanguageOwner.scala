package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageOwner extends StObject {
  
  /** @description The language of the CodeQL database. */
  var language: String
  
  var owner: String
  
  var repo: String
}
object LanguageOwner {
  
  inline def apply(language: String, owner: String, repo: String): LanguageOwner = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageOwner] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
