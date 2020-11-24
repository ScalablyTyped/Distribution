package typings.mozillaReadability.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseResult extends js.Object {
  
  /** Author metadata */
  var byline: String = js.native
  
  /** HTML string of processed article content */
  var content: String = js.native
  
  /** Content direction */
  var dir: String = js.native
  
  /** Article description, or short excerpt from the content */
  var excerpt: String = js.native
  
  /** Length of an article, in characters */
  var length: Double = js.native
  
  /** Article site name */
  var siteName: String = js.native
  
  /** non-HTML version of `content`  */
  var textContent: String = js.native
  
  /** Article title */
  var title: String = js.native
}
object ParseResult {
  
  @scala.inline
  def apply(
    byline: String,
    content: String,
    dir: String,
    excerpt: String,
    length: Double,
    siteName: String,
    textContent: String,
    title: String
  ): ParseResult = {
    val __obj = js.Dynamic.literal(byline = byline.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], excerpt = excerpt.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], siteName = siteName.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult]
  }
  
  @scala.inline
  implicit class ParseResultOps[Self <: ParseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setByline(value: String): Self = this.set("byline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcerpt(value: String): Self = this.set("excerpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteName(value: String): Self = this.set("siteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContent(value: String): Self = this.set("textContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
