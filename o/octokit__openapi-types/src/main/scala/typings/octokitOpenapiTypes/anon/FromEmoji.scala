package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromEmoji extends StObject {
  
  var from: Emoji
}
object FromEmoji {
  
  inline def apply(from: Emoji): FromEmoji = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromEmoji]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromEmoji] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Emoji): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
  }
}
