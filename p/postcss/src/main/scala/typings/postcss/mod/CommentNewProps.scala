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
  
  @scala.inline
  def apply(): CommentNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentNewProps]
  }
  
  @scala.inline
  implicit class CommentNewPropsMutableBuilder[Self <: CommentNewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
