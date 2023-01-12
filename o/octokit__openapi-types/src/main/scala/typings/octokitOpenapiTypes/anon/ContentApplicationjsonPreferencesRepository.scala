package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPreferencesRepository extends StObject {
  
  var content: ApplicationjsonPreferencesRepository
}
object ContentApplicationjsonPreferencesRepository {
  
  inline def apply(content: ApplicationjsonPreferencesRepository): ContentApplicationjsonPreferencesRepository = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPreferencesRepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonPreferencesRepository] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonPreferencesRepository): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
