package typings.parse5.distCjsCommonTokenMod

import typings.parse5.distCjsCommonTokenMod.TokenType.COMMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentToken
  extends StObject
     with TokenBase
     with Token {
  
  var data: String
  
  @JSName("type")
  val type_CommentToken: COMMENT
}
object CommentToken {
  
  inline def apply(data: String, `type`: COMMENT): CommentToken = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], location = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentToken] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: COMMENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
