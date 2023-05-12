package typings.postcss.anon

import typings.postcss.libCommentMod.CommentRaws
import typings.postcss.libNodeMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<postcss.postcss/lib/comment.CommentProps> */
trait PartialCommentProps extends StObject {
  
  var raws: js.UndefOr[CommentRaws] = js.undefined
  
  var source: js.UndefOr[Source] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object PartialCommentProps {
  
  inline def apply(): PartialCommentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCommentProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCommentProps] (val x: Self) extends AnyVal {
    
    inline def setRaws(value: CommentRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
