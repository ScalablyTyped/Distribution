package typings.n3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexerOptions extends StObject {
  
  var comments: js.UndefOr[Boolean] = js.undefined
  
  var lineMode: js.UndefOr[Boolean] = js.undefined
  
  var n3: js.UndefOr[Boolean] = js.undefined
}
object LexerOptions {
  
  inline def apply(): LexerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LexerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LexerOptions] (val x: Self) extends AnyVal {
    
    inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setLineMode(value: Boolean): Self = StObject.set(x, "lineMode", value.asInstanceOf[js.Any])
    
    inline def setLineModeUndefined: Self = StObject.set(x, "lineMode", js.undefined)
    
    inline def setN3(value: Boolean): Self = StObject.set(x, "n3", value.asInstanceOf[js.Any])
    
    inline def setN3Undefined: Self = StObject.set(x, "n3", js.undefined)
  }
}
