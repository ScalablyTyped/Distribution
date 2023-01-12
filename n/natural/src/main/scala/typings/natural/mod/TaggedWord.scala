package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaggedWord extends StObject {
  
  var tag: String
  
  var token: String
}
object TaggedWord {
  
  inline def apply(tag: String, token: String): TaggedWord = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedWord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaggedWord] (val x: Self) extends AnyVal {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
