package typings.prettier.anon

import typings.prettier.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Markdown extends StObject {
  
  var markdown: Parser[Any]
  
  var mdx: Parser[Any]
  
  var remark: Parser[Any]
}
object Markdown {
  
  inline def apply(markdown: Parser[Any], mdx: Parser[Any], remark: Parser[Any]): Markdown = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any], mdx = mdx.asInstanceOf[js.Any], remark = remark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Markdown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Markdown] (val x: Self) extends AnyVal {
    
    inline def setMarkdown(value: Parser[Any]): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
    
    inline def setMdx(value: Parser[Any]): Self = StObject.set(x, "mdx", value.asInstanceOf[js.Any])
    
    inline def setRemark(value: Parser[Any]): Self = StObject.set(x, "remark", value.asInstanceOf[js.Any])
  }
}
