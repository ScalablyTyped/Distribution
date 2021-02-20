package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocComment extends StObject {
  
  /**
    * The string that appears on the last line and closes the doc comment (e.g. ' * /').
    */
  var close: js.UndefOr[String] = js.native
  
  /**
    * The string that starts a doc comment (e.g. '/ **')
    */
  var open: String = js.native
}
object IDocComment {
  
  @scala.inline
  def apply(open: String): IDocComment = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocComment]
  }
  
  @scala.inline
  implicit class IDocCommentMutableBuilder[Self <: IDocComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
