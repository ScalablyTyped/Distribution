package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonPathMatcher extends StObject {
  
  /** The type of JSONPath match that will be applied to the JSON output (ContentMatcher.content) */
  var jsonMatcher: js.UndefOr[String] = js.undefined
  
  /** JSONPath within the response output pointing to the expected ContentMatcher::content to match against. */
  var jsonPath: js.UndefOr[String] = js.undefined
}
object JsonPathMatcher {
  
  inline def apply(): JsonPathMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonPathMatcher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonPathMatcher] (val x: Self) extends AnyVal {
    
    inline def setJsonMatcher(value: String): Self = StObject.set(x, "jsonMatcher", value.asInstanceOf[js.Any])
    
    inline def setJsonMatcherUndefined: Self = StObject.set(x, "jsonMatcher", js.undefined)
    
    inline def setJsonPath(value: String): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
    
    inline def setJsonPathUndefined: Self = StObject.set(x, "jsonPath", js.undefined)
  }
}
