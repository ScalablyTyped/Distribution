package typings.nextSeo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenGraphBook extends js.Object {
  
  var authors: js.UndefOr[js.Array[String]] = js.native
  
  var isbn: js.UndefOr[String] = js.native
  
  var releaseDate: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object OpenGraphBook {
  
  @scala.inline
  def apply(): OpenGraphBook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenGraphBook]
  }
  
  @scala.inline
  implicit class OpenGraphBookOps[Self <: OpenGraphBook] (val x: Self) extends AnyVal {
    
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
    def setAuthorsVarargs(value: String*): Self = this.set("authors", js.Array(value :_*))
    
    @scala.inline
    def setAuthors(value: js.Array[String]): Self = this.set("authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthors: Self = this.set("authors", js.undefined)
    
    @scala.inline
    def setIsbn(value: String): Self = this.set("isbn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsbn: Self = this.set("isbn", js.undefined)
    
    @scala.inline
    def setReleaseDate(value: String): Self = this.set("releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseDate: Self = this.set("releaseDate", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
