package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentNewProps extends StObject {
  
  /**
    * The comment's text.
    */
  var text: js.UndefOr[String] = js.undefined
}
object CommentNewProps {
  
  inline def apply(): CommentNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentNewProps]
  }
  
  extension [Self <: CommentNewProps](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
