package typings.musickitJs.anon

import typings.musickitJs.musickitJsStrings.`music-recommendations`
import typings.musickitJs.musickitJsStrings.`recently-played`
import typings.musickitJs.musickitJsStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind extends StObject {
  
  var kind: `music-recommendations` | `recently-played` | unknown
  
  var nextUpdateDate: String
  
  var reason: StringForDisplay
  
  var resourceTypes: js.Array[String]
  
  var title: StringForDisplay
}
object Kind {
  
  inline def apply(
    kind: `music-recommendations` | `recently-played` | unknown,
    nextUpdateDate: String,
    reason: StringForDisplay,
    resourceTypes: js.Array[String],
    title: StringForDisplay
  ): Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], nextUpdateDate = nextUpdateDate.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], resourceTypes = resourceTypes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
  
  extension [Self <: Kind](x: Self) {
    
    inline def setKind(value: `music-recommendations` | `recently-played` | unknown): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNextUpdateDate(value: String): Self = StObject.set(x, "nextUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setReason(value: StringForDisplay): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setResourceTypes(value: js.Array[String]): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesVarargs(value: String*): Self = StObject.set(x, "resourceTypes", js.Array(value*))
    
    inline def setTitle(value: StringForDisplay): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
