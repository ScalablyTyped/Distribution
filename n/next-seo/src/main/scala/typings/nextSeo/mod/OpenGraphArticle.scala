package typings.nextSeo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenGraphArticle extends js.Object {
  var authors: js.UndefOr[js.Array[String]] = js.native
  var expirationTime: js.UndefOr[String] = js.native
  var modifiedTime: js.UndefOr[String] = js.native
  var publishedTime: js.UndefOr[String] = js.native
  var section: js.UndefOr[String] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object OpenGraphArticle {
  @scala.inline
  def apply(): OpenGraphArticle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenGraphArticle]
  }
  @scala.inline
  implicit class OpenGraphArticleOps[Self <: OpenGraphArticle] (val x: Self) extends AnyVal {
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
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationTime: Self = this.set("expirationTime", js.undefined)
    @scala.inline
    def setModifiedTime(value: String): Self = this.set("modifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedTime: Self = this.set("modifiedTime", js.undefined)
    @scala.inline
    def setPublishedTime(value: String): Self = this.set("publishedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishedTime: Self = this.set("publishedTime", js.undefined)
    @scala.inline
    def setSection(value: String): Self = this.set("section", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

