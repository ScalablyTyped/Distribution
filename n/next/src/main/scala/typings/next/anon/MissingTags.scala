package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MissingTags extends StObject {
  
  var missingTags: js.Array[String]
}
object MissingTags {
  
  inline def apply(missingTags: js.Array[String]): MissingTags = {
    val __obj = js.Dynamic.literal(missingTags = missingTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingTags]
  }
  
  extension [Self <: MissingTags](x: Self) {
    
    inline def setMissingTags(value: js.Array[String]): Self = StObject.set(x, "missingTags", value.asInstanceOf[js.Any])
    
    inline def setMissingTagsVarargs(value: String*): Self = StObject.set(x, "missingTags", js.Array(value*))
  }
}
