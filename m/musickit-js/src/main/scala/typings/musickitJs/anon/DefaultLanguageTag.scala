package typings.musickitJs.anon

import typings.musickitJs.musickitJsStrings.`opt-in`
import typings.musickitJs.musickitJsStrings.allowed
import typings.musickitJs.musickitJsStrings.prohibited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultLanguageTag extends StObject {
  
  var defaultLanguageTag: String
  
  var explicitContentPolicy: allowed | `opt-in` | prohibited
  
  var name: String
  
  var supportedLanguageTags: js.Array[String]
}
object DefaultLanguageTag {
  
  inline def apply(
    defaultLanguageTag: String,
    explicitContentPolicy: allowed | `opt-in` | prohibited,
    name: String,
    supportedLanguageTags: js.Array[String]
  ): DefaultLanguageTag = {
    val __obj = js.Dynamic.literal(defaultLanguageTag = defaultLanguageTag.asInstanceOf[js.Any], explicitContentPolicy = explicitContentPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportedLanguageTags = supportedLanguageTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLanguageTag]
  }
  
  extension [Self <: DefaultLanguageTag](x: Self) {
    
    inline def setDefaultLanguageTag(value: String): Self = StObject.set(x, "defaultLanguageTag", value.asInstanceOf[js.Any])
    
    inline def setExplicitContentPolicy(value: allowed | `opt-in` | prohibited): Self = StObject.set(x, "explicitContentPolicy", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSupportedLanguageTags(value: js.Array[String]): Self = StObject.set(x, "supportedLanguageTags", value.asInstanceOf[js.Any])
    
    inline def setSupportedLanguageTagsVarargs(value: String*): Self = StObject.set(x, "supportedLanguageTags", js.Array(value*))
  }
}
